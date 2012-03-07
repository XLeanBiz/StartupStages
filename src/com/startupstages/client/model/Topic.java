package com.startupstages.client.model;

import com.startupstages.client.utilities.NameGenerator;

public class Topic {

	public enum TopicID {

		ProblemSolutionFit,

		Idea, VisionStatement, Persona, Team, Goals, TeamSize, MarketResearch, Surveys,

		Assumptions, Uses, UsesRate, Interviews, LeanCanvas,

		UniqueValue, UniqueValueProposition, NonCodedMVP, Wireframes, ABTests, NonCodedMVPUse,

		Brand, BrandName, Logo, LandingPage, Domain, Blog, FeedbackChanels, SEO, Visits, SignUps, Advertising,

		ProductMarketFit,

		Prototype, SourceRepository, Database, ProductionEnvironment, FeaturePrototype, FeatureVisits, FeatureUses, LOC, UsabilityTests,

		Enhance, Support, Performance, Security, Privacy, CodeQuality, Rewards, Satisfation, EarlyAdopters, Returns,

		Profiting, Pricing, PaymentMethods, CostPerUser, RevenuePerUser,

		Scale,

		Referring, ReferralModels, ReferralRate,

		Scaling, VisitsIncreasingRate, ConversionRate

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
