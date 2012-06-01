package com.startupstages.client.model;

import com.startupstages.client.utilities.FeatureNameGenerator;

public class Topic {

	public enum TopicID {

		ProblemSolutionFit,
		Idea, Team, Persona, Problem, Experiment, Solution, Brand,
		CustomerDevelopment, LeanUX, LeanStartup,
		ProblemScore, EarlyAdopters,
		
		ProductMarketFit,
		Features, MVP,
		Returns, MustHaveScore,
		AgileDevelopment, Usability, CodeQuality, BusinessModel, 
		
		Scale,
		Funding, Advertising, ReferralRate, Revenue, Incorporation
	}

	private TopicID topicID;

	private String topicName;

	private String topicDescription;

	public Topic() {

	}

	public Topic(TopicID topicID) {

		this.topicID = topicID;
		this.topicName = FeatureNameGenerator.spacedName(topicID.toString());
	}

	public TopicID getTopicID() {
		return topicID;
	}

	public void setTopicID(TopicID topicID) {
		this.topicID = topicID;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getTopicDescription() {
		return topicDescription;
	}

	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}

}
