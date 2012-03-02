package com.startupstages.client.model;

import com.startupstages.client.utilities.NameGenerator;

public class Topic {

	public enum TopicID {
        VisionStatement, Persona, Team, Goals, TeamSize, MarketResearch, Surveys, 
        Uses, UsesRate, Interviews, Causes, 
        UniqueValueProposition, NonCodedMVP, Wireframes, ABTests, LeanCanvas, NonCodedMVPUse,
        BrandName, Logo, LandingPage, Blog, FeedbackChanels, Visits, SignUps, Advertising,
        ProductionEnvironment, FeaturePrototype, FeatureClicks, FeatureUse, UsabilityTests,
        Performance, Security, CodeQuality, Satisfation, EarlyAdopters, Returns,
        PaymentMethods, UserCost, ConversionRate, Virality, RevenuePerUser
    }

	private TopicID topicID;

	private String topicName;

	private String topicDescription;

	public Topic() {

	}

	public Topic(TopicID topicID) {

		this.topicID = topicID;
		this.topicName = NameGenerator.spacedName(topicID.toString());
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
