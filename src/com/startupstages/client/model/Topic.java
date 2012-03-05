package com.startupstages.client.model;

import com.startupstages.client.utilities.NameGenerator;

public class Topic {

	public enum TopicID {

		ProblemSolutionFit,
        Idea, VisionStatement, Persona, Team, Goals, TeamSize, MarketResearch, Surveys, 
        Assumptions, Uses, UsesRate, Interviews, Causes, 
        UniqueValue, UniqueValueProposition, NonCodedMVP, Wireframes, ABTests, LeanCanvas, NonCodedMVPUse,
        Brand, BrandName, Logo, LandingPage, Blog, FeedbackChanels, Visits, SignUps, Advertising,

        ProductMarketFit,
        Prototype, ProductionEnvironment, FeaturePrototype, FeatureClicks, FeatureUse, UsabilityTests,
        Enhance, Performance, Security, CodeQuality, Satisfation, EarlyAdopters, Returns,

        Scale,
        Scaling, PaymentMethods, CostPerUser, ConversionRate, RevenuePerUser
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
