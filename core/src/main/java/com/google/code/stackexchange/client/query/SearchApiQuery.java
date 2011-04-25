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
package com.google.code.stackexchange.client.query;

import java.util.List;

import com.google.code.stackexchange.schema.Paging;
import com.google.code.stackexchange.schema.Question;
import com.google.code.stackexchange.schema.Range;
import com.google.code.stackexchange.schema.TimePeriod;
import com.google.code.stackexchange.schema.User;

/**
 * The Interface QuestionApiQuery.
 */
public interface SearchApiQuery extends StackExchangeApiQuery<Question> {
	
	/**
	 * With tags.
	 * 
	 * @param tag the tag
	 * 
	 * @return the question api query
	 */
	public SearchApiQuery withTags(String... tag);
	
	/**
	 * With tags.
	 * 
	 * @param tag the tag
	 * 
	 * @return the question api query
	 */
	public SearchApiQuery withTags(List<String> tag);
	
	/**
	 * With tags.
	 * 
	 * @param tag the tag
	 * 
	 * @return the question api query
	 */
	public SearchApiQuery withOutTags(String... tag);
	
	/**
	 * With tags.
	 * 
	 * @param tag the tag
	 * 
	 * @return the question api query
	 */
	public SearchApiQuery withOutTags(List<String> tag);
	
	/**
	 * With paging.
	 * 
	 * @param paging the paging
	 * 
	 * @return the question api query
	 */
	public SearchApiQuery withPaging(Paging paging);

	/**
	 * With time period.
	 * 
	 * @param timePeriod the time period
	 * 
	 * @return the question api query
	 */
	public SearchApiQuery withTimePeriod(TimePeriod timePeriod);

	/**
	 * With sort.
	 * 
	 * @param sort the sort
	 * 
	 * @return the question api query
	 */
	public SearchApiQuery withSort(User.QuestionSortOrder sort);
	
	/**
	 * With range.
	 * 
	 * @param range the range
	 * 
	 * @return the question api query
	 */
	public SearchApiQuery withRange(Range range);
	
	public SearchApiQuery withInTitle(String searchString);
}
