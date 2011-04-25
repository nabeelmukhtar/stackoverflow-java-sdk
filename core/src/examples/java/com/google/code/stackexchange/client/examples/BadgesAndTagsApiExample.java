/*
 * Copyright 2010 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */
package com.google.code.stackexchange.client.examples;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import com.google.code.stackexchange.client.StackExchangeApiClient;
import com.google.code.stackexchange.client.StackExchangeApiClientFactory;
import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.Badge;
import com.google.code.stackexchange.schema.Paging;
import com.google.code.stackexchange.schema.Tag;

/**
 * The Class BadgesAndTagsApiExample.
 */
public class BadgesAndTagsApiExample {

    /** The Constant APPLICATION_KEY_OPTION. */
    private static final String APPLICATION_KEY_OPTION = "key";
	
    /** The Constant HELP_OPTION. */
    private static final String HELP_OPTION = "help";
    
    private static FileWriter outputFile;
    
    /**
     * The main method.
     * 
     * @param args the arguments
     */
	public static void main(String[] args) {
		Options options = buildOptions();
        try {
            CommandLine line = new BasicParser().parse(options, args);
            processCommandLine(line, options);
        } catch(ParseException exp ) {
            System.err.println(exp.getMessage());
            printHelp(options);
        }
	}
	
    /**
     * Process command line.
     * 
     * @param line the line
     * @param options the options
     */
    private static void processCommandLine(CommandLine line, Options options) {
        if(line.hasOption(HELP_OPTION)) {
            printHelp(options);            
        } else if(line.hasOption(APPLICATION_KEY_OPTION)) {
    		final String keyValue = line.getOptionValue(APPLICATION_KEY_OPTION);
    		
    		final StackExchangeApiClientFactory factory = StackExchangeApiClientFactory.newInstance(keyValue);
    		final StackExchangeApiClient client = factory.createStackExchangeApiClient();
    		
//			List<Badge> badges = client.getBadgesByName();
//			System.out.println("============ Badges ============");
//			for (Badge badge : badges) {
//				printResult(badge);
//			}
    		try {
    			outputFile = new FileWriter("E:\\workspace\\opensource\\linkedhub\\src\\com\\appspot\\linkedhub\\client\\LinkedHubTags.properties");
    			outputFile.write("com.appspot.linkedhub.tags=");
	    		for (int i = 0; i < 20; i++) {
	    			PagedList<Tag> tags = client.getTags(new Paging(i + 1, 100));
	    			for(Tag tag : tags) {
	    				printResult(tag);
	    			}
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					outputFile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
        } else {
            printHelp(options);
        }
    }
	
	/**
	 * Prints the result.
	 * 
	 * @param tag the tag
	 * @throws IOException 
	 */
	private static void printResult(Tag tag) throws IOException {
		outputFile.write(tag.getName() + ", ");
	}

	/**
	 * Prints the result.
	 * 
	 * @param badge the badge
	 */
	private static void printResult(Badge badge) {
		System.out.println(badge.getName() + ":" + badge.getRank() + ":" + badge.getAwardCount());
	}

	/**
	 * Builds the options.
	 * 
	 * @return the options
	 */
    private static Options buildOptions() {
       
        Options opts = new Options();
        
        String helpMsg = "Print this message.";
        Option help = new Option(HELP_OPTION, helpMsg);
        opts.addOption(help);

        String consumerKeyMsg = "You API Key.";
        OptionBuilder.withArgName("key");
        OptionBuilder.hasArg();
        OptionBuilder.withDescription(consumerKeyMsg);
        Option consumerKey = OptionBuilder.create(APPLICATION_KEY_OPTION);
        opts.addOption(consumerKey);
        
        return opts;
    }
    
    /**
     * Prints the help.
     * 
     * @param options the options
     */
    private static void printHelp(Options options) {
        int width = 80;
        String syntax = BadgesAndTagsApiExample.class.getName() + " <options>";
        String header = MessageFormat.format("\nThe -{0} option is required.", APPLICATION_KEY_OPTION);
        String footer = "";
        new HelpFormatter().printHelp(width, syntax, header, options, footer, false);
    }
}
