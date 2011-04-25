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
package com.google.code.stackexchange.client;

import java.util.List;
import java.util.Set;

import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.Answer;
import com.google.code.stackexchange.schema.Badge;
import com.google.code.stackexchange.schema.Comment;
import com.google.code.stackexchange.schema.FilterOption;
import com.google.code.stackexchange.schema.Paging;
import com.google.code.stackexchange.schema.PostTimeline;
import com.google.code.stackexchange.schema.Question;
import com.google.code.stackexchange.schema.Range;
import com.google.code.stackexchange.schema.Reputation;
import com.google.code.stackexchange.schema.Revision;
import com.google.code.stackexchange.schema.Statistics;
import com.google.code.stackexchange.schema.Tag;
import com.google.code.stackexchange.schema.TimePeriod;
import com.google.code.stackexchange.schema.User;
import com.google.code.stackexchange.schema.UserTimeline;


/**
 * The Interface StackExchangeApiClient.
 */
public interface StackExchangeApiClient extends StackExchangeAuthenticationClient {
	
	// Question Methods
	/**
	 * Gets the questions.
	 * 
	 * @return the questions
	 */
	public PagedList<Question> getQuestions();
	
	/**
	 * Gets the questions.
	 * 
	 * @param paging the paging
	 * 
	 * @return the questions
	 */
	public PagedList<Question> getQuestions(Paging paging);
	
	/**
	 * Gets the questions.
	 * 
	 * @param timePeriod the time period
	 * 
	 * @return the questions
	 */
	public PagedList<Question> getQuestions(TimePeriod timePeriod);
	
	/**
	 * Gets the questions.
	 * 
	 * @param sort the sort
	 * 
	 * @return the questions
	 */
	public PagedList<Question> getQuestions(Question.SortOrder sort);
	
	/**
	 * Gets the questions.
	 * 
	 * @param sort the sort
	 * @param range the range
	 * 
	 * @return the questions
	 */
	public PagedList<Question> getQuestions(Question.SortOrder sort, Range range);
	
	/**
	 * Gets the questions.
	 * 
	 * @param filterOptions the filter options
	 * 
	 * @return the questions
	 */
	public PagedList<Question> getQuestions(Set<FilterOption> filterOptions);
	
	/**
	 * Gets the questions.
	 * 
	 * @param sort the sort
	 * @param paging the paging
	 * @param timePeriod the time period
	 * @param filterOptions the filter options
	 * 
	 * @return the questions
	 */
	public PagedList<Question> getQuestions(Question.SortOrder sort, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions);
	
	/**
	 * Gets the unanswered questions.
	 * 
	 * @return the unanswered questions
	 */
	public PagedList<Question> getUnansweredQuestions();
	
	/**
	 * Gets the unanswered questions.
	 * 
	 * @param sort the sort
	 * 
	 * @return the unanswered questions
	 */
	public PagedList<Question> getUnansweredQuestions(Question.UnansweredSortOrder sort);
	
	/**
	 * Gets the unanswered questions.
	 * 
	 * @param sort the sort
	 * @param range the range
	 * 
	 * @return the unanswered questions
	 */
	public PagedList<Question> getUnansweredQuestions(Question.UnansweredSortOrder sort, Range range);
	
	/**
	 * Gets the unanswered questions.
	 * 
	 * @param paging the paging
	 * 
	 * @return the unanswered questions
	 */
	public PagedList<Question> getUnansweredQuestions(Paging paging);
	
	/**
	 * Gets the unanswered questions.
	 * 
	 * @param timePeriod the time period
	 * 
	 * @return the unanswered questions
	 */
	public PagedList<Question> getUnansweredQuestions(TimePeriod timePeriod);
	
	/**
	 * Gets the unanswered questions.
	 * 
	 * @param filterOptions the filter options
	 * 
	 * @return the unanswered questions
	 */
	public PagedList<Question> getUnansweredQuestions(Set<FilterOption> filterOptions);
	
	/**
	 * Gets the unanswered questions.
	 * 
	 * @param sort the sort
	 * @param paging the paging
	 * @param timePeriod the time period
	 * @param filterOptions the filter options
	 * 
	 * @return the unanswered questions
	 */
	public PagedList<Question> getUnansweredQuestions(Question.UnansweredSortOrder sort, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions);
	
	/**
	 * Gets the tagged questions.
	 * 
	 * @param tags the tags
	 * 
	 * @return the tagged questions
	 */
	public PagedList<Question> getTaggedQuestions(List<String> tags);
	
	/**
	 * Gets the tagged questions.
	 * 
	 * @param tags the tags
	 * @param paging the paging
	 * @param timePeriod the time period
	 * @param filterOptions the filter options
	 * 
	 * @return the tagged questions
	 */
	public PagedList<Question> getTaggedQuestions(List<String> tags, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions);
	
	/**
	 * Gets the questions by users.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the questions by users
	 */
	public PagedList<Question> getQuestionsByUsers(long... userIds);
	
	/**
	 * Gets the questions by users.
	 * 
	 * @param sort the sort
	 * @param userIds the user ids
	 * 
	 * @return the questions by users
	 */
	public PagedList<Question> getQuestionsByUsers(User.QuestionSortOrder sort, long... userIds);
	
	/**
	 * Gets the questions by users.
	 * 
	 * @param sort the sort
	 * @param range the range
	 * @param userIds the user ids
	 * 
	 * @return the questions by users
	 */
	public PagedList<Question> getQuestionsByUsers(User.QuestionSortOrder sort, Range range, long... userIds);
	
	/**
	 * Gets the questions by users.
	 * 
	 * @param paging the paging
	 * @param userIds the user ids
	 * 
	 * @return the questions by users
	 */
	public PagedList<Question> getQuestionsByUsers(Paging paging, long... userIds);
	
	/**
	 * Gets the questions by users.
	 * 
	 * @param timePeriod the time period
	 * @param userIds the user ids
	 * 
	 * @return the questions by users
	 */
	public PagedList<Question> getQuestionsByUsers(TimePeriod timePeriod, long... userIds);
	
	/**
	 * Gets the questions by users.
	 * 
	 * @param filterOptions the filter options
	 * @param userIds the user ids
	 * 
	 * @return the questions by users
	 */
	public PagedList<Question> getQuestionsByUsers(Set<FilterOption> filterOptions, long... userIds);
	
	/**
	 * Gets the questions by users.
	 * 
	 * @param sort the sort
	 * @param paging the paging
	 * @param timePeriod the time period
	 * @param filterOptions the filter options
	 * @param userIds the user ids
	 * 
	 * @return the questions by users
	 */
	public PagedList<Question> getQuestionsByUsers(User.QuestionSortOrder sort, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions, long... userIds);
	
	/**
	 * Gets the favorite questions by users.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the favorite questions by users
	 */
	public PagedList<Question> getFavoriteQuestionsByUsers(long... userIds);
	
	/**
	 * Gets the favorite questions by users.
	 * 
	 * @param sort the sort
	 * @param userIds the user ids
	 * 
	 * @return the favorite questions by users
	 */
	public PagedList<Question> getFavoriteQuestionsByUsers(User.FavoriteSortOrder sort, long... userIds);
	
	/**
	 * Gets the favorite questions by users.
	 * 
	 * @param sort the sort
	 * @param range the range
	 * @param userIds the user ids
	 * 
	 * @return the favorite questions by users
	 */
	public PagedList<Question> getFavoriteQuestionsByUsers(User.FavoriteSortOrder sort, Range range, long... userIds);
	
	/**
	 * Gets the favorite questions by users.
	 * 
	 * @param paging the paging
	 * @param userIds the user ids
	 * 
	 * @return the favorite questions by users
	 */
	public PagedList<Question> getFavoriteQuestionsByUsers(Paging paging, long... userIds);
	
	/**
	 * Gets the favorite questions by users.
	 * 
	 * @param timePeriod the time period
	 * @param userIds the user ids
	 * 
	 * @return the favorite questions by users
	 */
	public PagedList<Question> getFavoriteQuestionsByUsers(TimePeriod timePeriod, long... userIds);
	
	/**
	 * Gets the favorite questions by users.
	 * 
	 * @param filterOptions the filter options
	 * @param userIds the user ids
	 * 
	 * @return the favorite questions by users
	 */
	public PagedList<Question> getFavoriteQuestionsByUsers(Set<FilterOption> filterOptions, long... userIds);
	
	/**
	 * Gets the favorite questions by users.
	 * 
	 * @param sort the sort
	 * @param paging the paging
	 * @param timePeriod the time period
	 * @param filterOptions the filter options
	 * @param userIds the user ids
	 * 
	 * @return the favorite questions by users
	 */
	public PagedList<Question> getFavoriteQuestionsByUsers(User.FavoriteSortOrder sort, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions, long... userIds);
	
	/**
	 * Gets the questions.
	 * 
	 * @param questionIds the question ids
	 * 
	 * @return the questions
	 */
	public PagedList<Question> getQuestions(long... questionIds);
	
	/**
	 * Gets the questions.
	 * 
	 * @param paging the paging
	 * @param questionIds the question ids
	 * 
	 * @return the questions
	 */
	public PagedList<Question> getQuestions(Paging paging, long... questionIds);
	
	/**
	 * Gets the questions.
	 * 
	 * @param filterOptions the filter options
	 * @param questionIds the question ids
	 * 
	 * @return the questions
	 */
	public PagedList<Question> getQuestions(Set<FilterOption> filterOptions, long... questionIds);
	
	/**
	 * Gets the questions.
	 * 
	 * @param paging the paging
	 * @param filterOptions the filter options
	 * @param questionIds the question ids
	 * 
	 * @return the questions
	 */
	public PagedList<Question> getQuestions(Paging paging, Set<FilterOption> filterOptions, long... questionIds);
	
	/**
	 * Gets the questions timeline.
	 * 
	 * @param questionIds the question ids
	 * 
	 * @return the questions timeline
	 */
	public PagedList<PostTimeline> getQuestionsTimeline(long... questionIds);
	
	/**
	 * Gets the questions timeline.
	 * 
	 * @param timePeriod the time period
	 * @param questionIds the question ids
	 * 
	 * @return the questions timeline
	 */
	public PagedList<PostTimeline> getQuestionsTimeline(TimePeriod timePeriod, long... questionIds);
	
	/**
	 * Search questions.
	 * 
	 * @param query the query
	 * 
	 * @return the paged list< question>
	 */
	public PagedList<Question> searchQuestions(String query);
	
	/**
	 * Search questions.
	 * 
	 * @param query the query
	 * @param sort the sort
	 * @param paging the paging
	 * 
	 * @return the paged list< question>
	 */
	public PagedList<Question> searchQuestions(String query, User.QuestionSortOrder sort, Paging paging);
	
	/**
	 * Search questions.
	 * 
	 * @param query the query
	 * @param sort the sort
	 * @param range the range
	 * 
	 * @return the paged list< question>
	 */
	public PagedList<Question> searchQuestions(String query, User.QuestionSortOrder sort, Range range);
	
	/**
	 * Search questions.
	 * 
	 * @param includeTags the include tags
	 * @param excludeTags the exclude tags
	 * 
	 * @return the paged list< question>
	 */
	public PagedList<Question> searchQuestions(List<String> includeTags, List<String> excludeTags);
	
	/**
	 * Search questions.
	 * 
	 * @param includeTags the include tags
	 * @param excludeTags the exclude tags
	 * @param sort the sort
	 * @param paging the paging
	 * 
	 * @return the paged list< question>
	 */
	public PagedList<Question> searchQuestions(List<String> includeTags, List<String> excludeTags, User.QuestionSortOrder sort, Paging paging);
	
	/**
	 * Search questions.
	 * 
	 * @param query the query
	 * @param includeTags the include tags
	 * @param excludeTags the exclude tags
	 * @param sort the sort
	 * @param paging the paging
	 * 
	 * @return the paged list< question>
	 */
	public PagedList<Question> searchQuestions(String query, List<String> includeTags, List<String> excludeTags, User.QuestionSortOrder sort, Paging paging);
	
	// User Methods
	/**
	 * Gets the users.
	 * 
	 * @return the users
	 */
	public PagedList<User> getUsers();
	
	/**
	 * Gets the users.
	 * 
	 * @param paging the paging
	 * 
	 * @return the users
	 */
	public PagedList<User> getUsers(Paging paging);
	
	/**
	 * Gets the users.
	 * 
	 * @param filter the filter
	 * 
	 * @return the users
	 */
	public PagedList<User> getUsers(String filter);
	
	/**
	 * Gets the users.
	 * 
	 * @param sort the sort
	 * 
	 * @return the users
	 */
	public PagedList<User> getUsers(User.SortOrder sort);
	
	/**
	 * Gets the users.
	 * 
	 * @param sort the sort
	 * @param range the range
	 * 
	 * @return the users
	 */
	public PagedList<User> getUsers(User.SortOrder sort, Range range);
	
	/**
	 * Gets the users.
	 * 
	 * @param filter the filter
	 * @param sort the sort
	 * @param paging the paging
	 * 
	 * @return the users
	 */
	public PagedList<User> getUsers(String filter, User.SortOrder sort, Paging paging);
	
	/**
	 * Gets the users timeline.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the users timeline
	 */
	public PagedList<UserTimeline> getUsersTimeline(long... userIds);
	
	/**
	 * Gets the users timeline.
	 * 
	 * @param timePeriod the time period
	 * @param userIds the user ids
	 * 
	 * @return the users timeline
	 */
	public PagedList<UserTimeline> getUsersTimeline(TimePeriod timePeriod, long... userIds);
	
	/**
	 * Gets the users mentions.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the users mentions
	 */
	public PagedList<Comment> getUsersMentions(long... userIds);
	
	/**
	 * Gets the users mentions.
	 * 
	 * @param timePeriod the time period
	 * @param userIds the user ids
	 * 
	 * @return the users mentions
	 */
	public PagedList<Comment> getUsersMentions(TimePeriod timePeriod, long... userIds);
	
	/**
	 * Gets the users reputations.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the users reputations
	 */
	public PagedList<Reputation> getUsersReputations(long... userIds);
	
	/**
	 * Gets the users reputations.
	 * 
	 * @param timePeriod the time period
	 * @param userIds the user ids
	 * 
	 * @return the users reputations
	 */
	public PagedList<Reputation> getUsersReputations(TimePeriod timePeriod, long... userIds);
	
	/**
	 * Gets the users reputations.
	 * 
	 * @param paging the paging
	 * @param userIds the user ids
	 * 
	 * @return the users reputations
	 */
	public PagedList<Reputation> getUsersReputations(Paging paging, long... userIds);
	
	/**
	 * Gets the users reputations.
	 * 
	 * @param paging the paging
	 * @param timePeriod the time period
	 * @param userIds the user ids
	 * 
	 * @return the users reputations
	 */
	public PagedList<Reputation> getUsersReputations(Paging paging, TimePeriod timePeriod, long... userIds);
	
	/**
	 * Gets the users.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the users
	 */
	public PagedList<User> getUsers(long... userIds);
	
	// Badge Methods
	/**
	 * Gets the badges.
	 * 
	 * @return the badges
	 */
	public PagedList<Badge> getBadges();
	
	/**
	 * Gets the badges by name.
	 * 
	 * @return the badges by name
	 */
	public PagedList<Badge> getBadgesByName();
	
	/**
	 * Gets the badges by tags.
	 * 
	 * @return the badges by tags
	 */
	public PagedList<Badge> getBadgesByTags();
	
	/**
	 * Gets the badges for users.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the badges for users
	 */
	public PagedList<Badge> getBadgesForUsers(long... userIds);
	
	/**
	 * Gets the badges recipients.
	 * 
	 * @param badgeIds the badge ids
	 * 
	 * @return the badges recipients
	 */
	public PagedList<User> getBadgesRecipients(long... badgeIds);
	
	/**
	 * Gets the badges recipients.
	 * 
	 * @param paging the paging
	 * @param badgeIds the badge ids
	 * 
	 * @return the badges recipients
	 */
	public PagedList<User> getBadgesRecipients(Paging paging, long... badgeIds);

	// Tag Methods
	/**
	 * Gets the tags.
	 * 
	 * @return the tags
	 */
	public PagedList<Tag> getTags();
	
	/**
	 * Gets the tags.
	 * 
	 * @param sort the sort
	 * 
	 * @return the tags
	 */
	public PagedList<Tag> getTags(Tag.SortOrder sort);
	
	/**
	 * Gets the tags.
	 * 
	 * @param paging the paging
	 * 
	 * @return the tags
	 */
	public PagedList<Tag> getTags(Paging paging);
	
	/**
	 * Gets the tags.
	 * 
	 * @param sort the sort
	 * @param paging the paging
	 * 
	 * @return the tags
	 */
	public PagedList<Tag> getTags(Tag.SortOrder sort, Paging paging);
	
	/**
	 * Gets the tags for users.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the tags for users
	 */
	public PagedList<Tag> getTagsForUsers(long... userIds);
	
	/**
	 * Gets the tags for users.
	 * 
	 * @param paging the paging
	 * @param userIds the user ids
	 * 
	 * @return the tags for users
	 */
	public PagedList<Tag> getTagsForUsers(Paging paging, long... userIds);
	
	// Answer Methods
	/**
	 * Gets the answers by questions.
	 * 
	 * @param questionIds the question ids
	 * 
	 * @return the answers by questions
	 */
	public PagedList<Answer> getAnswersByQuestions(long... questionIds); 
	
	/**
	 * Gets the answers by questions.
	 * 
	 * @param filterOptions the filter options
	 * @param questionIds the question ids
	 * 
	 * @return the answers by questions
	 */
	public PagedList<Answer> getAnswersByQuestions(Set<FilterOption> filterOptions, long... questionIds); 
	
	/**
	 * Gets the answers by questions.
	 * 
	 * @param sort the sort
	 * @param questionIds the question ids
	 * 
	 * @return the answers by questions
	 */
	public PagedList<Answer> getAnswersByQuestions(Answer.SortOrder sort, long... questionIds);
	
	/**
	 * Gets the answers by questions.
	 * 
	 * @param sort the sort
	 * @param range the range
	 * @param questionIds the question ids
	 * 
	 * @return the answers by questions
	 */
	public PagedList<Answer> getAnswersByQuestions(Answer.SortOrder sort, Range range, long... questionIds);
	
	/**
	 * Gets the answers by questions.
	 * 
	 * @param sort the sort
	 * @param filterOptions the filter options
	 * @param questionIds the question ids
	 * 
	 * @return the answers by questions
	 */
	public PagedList<Answer> getAnswersByQuestions(Answer.SortOrder sort, Set<FilterOption> filterOptions, long... questionIds);
	
	/**
	 * Gets the answers by users.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the answers by users
	 */
	public PagedList<Answer> getAnswersByUsers(long... userIds); 
	
	/**
	 * Gets the answers by users.
	 * 
	 * @param filterOptions the filter options
	 * @param userIds the user ids
	 * 
	 * @return the answers by users
	 */
	public PagedList<Answer> getAnswersByUsers(Set<FilterOption> filterOptions, long... userIds); 
	
	/**
	 * Gets the answers by users.
	 * 
	 * @param sort the sort
	 * @param userIds the user ids
	 * 
	 * @return the answers by users
	 */
	public PagedList<Answer> getAnswersByUsers(Answer.SortOrder sort, long... userIds);
	
	/**
	 * Gets the answers by users.
	 * 
	 * @param sort the sort
	 * @param range the range
	 * @param userIds the user ids
	 * 
	 * @return the answers by users
	 */
	public PagedList<Answer> getAnswersByUsers(Answer.SortOrder sort, Range range, long... userIds);
	
	/**
	 * Gets the answers by users.
	 * 
	 * @param sort the sort
	 * @param filterOptions the filter options
	 * @param userIds the user ids
	 * 
	 * @return the answers by users
	 */
	public PagedList<Answer> getAnswersByUsers(Answer.SortOrder sort, Set<FilterOption> filterOptions, long... userIds);
	
	/**
	 * Gets the answers.
	 * 
	 * @param answerIds the answer ids
	 * 
	 * @return the answers
	 */
	public PagedList<Answer> getAnswers(long... answerIds);
	
	/**
	 * Gets the answers.
	 * 
	 * @param filterOptions the filter options
	 * @param answerIds the answer ids
	 * 
	 * @return the answers
	 */
	public PagedList<Answer> getAnswers(Set<FilterOption> filterOptions, long... answerIds);
	
	// Comment Methods
	/**
	 * Gets the users comments.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the users comments
	 */
	public PagedList<Comment> getUsersComments(long... userIds);
	
	/**
	 * Gets the users comments.
	 * 
	 * @param sort the sort
	 * @param userIds the user ids
	 * 
	 * @return the users comments
	 */
	public PagedList<Comment> getUsersComments(Comment.SortOrder sort, long... userIds);
	
	/**
	 * Gets the users comments.
	 * 
	 * @param sort the sort
	 * @param range the range
	 * @param userIds the user ids
	 * 
	 * @return the users comments
	 */
	public PagedList<Comment> getUsersComments(Comment.SortOrder sort, Range range, long... userIds);
	
	/**
	 * Gets the users comments.
	 * 
	 * @param timePeriod the time period
	 * @param userIds the user ids
	 * 
	 * @return the users comments
	 */
	public PagedList<Comment> getUsersComments(TimePeriod timePeriod, long... userIds);
	
	/**
	 * Gets the users comments.
	 * 
	 * @param paging the paging
	 * @param userIds the user ids
	 * 
	 * @return the users comments
	 */
	public PagedList<Comment> getUsersComments(Paging paging, long... userIds);
	
	/**
	 * Gets the users comments.
	 * 
	 * @param sort the sort
	 * @param paging the paging
	 * @param timePeriod the time period
	 * @param userIds the user ids
	 * 
	 * @return the users comments
	 */
	public PagedList<Comment> getUsersComments(Comment.SortOrder sort, Paging paging, TimePeriod timePeriod, long... userIds);

	/**
	 * Gets the users comments to user.
	 * 
	 * @param toUserId the to user id
	 * @param userIds the user ids
	 * 
	 * @return the users comments to user
	 */
	public PagedList<Comment> getUsersCommentsToUser(long toUserId, long... userIds);
	
	/**
	 * Gets the users comments to user.
	 * 
	 * @param toUserId the to user id
	 * @param sort the sort
	 * @param userIds the user ids
	 * 
	 * @return the users comments to user
	 */
	public PagedList<Comment> getUsersCommentsToUser(long toUserId, Comment.SortOrder sort, long... userIds);
	
	/**
	 * Gets the users comments to user.
	 * 
	 * @param toUserId the to user id
	 * @param timePeriod the time period
	 * @param userIds the user ids
	 * 
	 * @return the users comments to user
	 */
	public PagedList<Comment> getUsersCommentsToUser(long toUserId, TimePeriod timePeriod, long... userIds);
	
	/**
	 * Gets the users comments to user.
	 * 
	 * @param toUserId the to user id
	 * @param paging the paging
	 * @param userIds the user ids
	 * 
	 * @return the users comments to user
	 */
	public PagedList<Comment> getUsersCommentsToUser(long toUserId, Paging paging, long... userIds);
	
	/**
	 * Gets the users comments to user.
	 * 
	 * @param toUserId the to user id
	 * @param sort the sort
	 * @param paging the paging
	 * @param timePeriod the time period
	 * @param userIds the user ids
	 * 
	 * @return the users comments to user
	 */
	public PagedList<Comment> getUsersCommentsToUser(long toUserId, Comment.SortOrder sort, Paging paging, TimePeriod timePeriod, long... userIds);
	
	/**
	 * Gets the comments.
	 * 
	 * @param commentIds the comment ids
	 * 
	 * @return the comments
	 */
	public PagedList<Comment> getComments(long... commentIds);
	
	// Statistics Method
	/**
	 * Gets the statistics.
	 * 
	 * @return the statistics
	 */
	public List<Statistics> getStatistics();
	
	// Revision Methods
	/**
	 * Gets the revisions for posts.
	 * 
	 * @param postIds the post ids
	 * 
	 * @return the revisions for posts
	 */
	public PagedList<Revision> getRevisionsForPosts(long... postIds);
	
	/**
	 * Gets the revisions for posts.
	 * 
	 * @param timePeriod the time period
	 * @param postIds the post ids
	 * 
	 * @return the revisions for posts
	 */
	public PagedList<Revision> getRevisionsForPosts(TimePeriod timePeriod, long... postIds);
	
	/**
	 * Gets the revision for post.
	 * 
	 * @param postId the post id
	 * @param revisionGuid the revision guid
	 * 
	 * @return the revision for post
	 */
	public Revision getRevisionForPost(long postId, String revisionGuid);
}
