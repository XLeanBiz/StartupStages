package com.startupstages.client.model;

import com.startupstages.client.utilities.FeatureNameGenerator;

public class Topic {

	public enum TopicID {

		ProblemSolutionFit,
		
		Assumptions, Persona, Scenarios, CustomerInterviews, LeanUX, Pivot, ProblemScore,
		UniqueValue, UniqueValueProposition, BusinessCanvas, MVP, Wireframes, ABTests, UniqueValueScore, MVPResults,
		Idea, Vision, Team, Goals, TeamSize, Feedback, MarketResearch, Surveys, Mentoring, Empathy,
		Brand, BrandName, Logo, LandingPage, Domain, Blog, FeedbackChanels, SEO, Visits, SignUps, CommunicationSkills,
		
		ProductMarketFit,
		Prototype, SourceRepository, Database, ProductionEnvironment, FeaturePrototype, 
		       FeatureVisits, FeatureUses, TestCoverage, LOC, AgileDevelopment, UsabilityTests, APIPivot,
		Enhance, UIDesign, Privacy, CodeQuality, CustomerSupport, SocialMedia, Rewards, EarlyAdopters, Returns,
		Profit, Incorporation, RevenueModel, Partnerships, CostPerUser, RevenuePerUser, MustHaveScore, DemandCurve, 
		
		Scale,
		Funding, AdvisorsBoard, InvestorsMeetings, Bootstrapping, SeedFunding, AngelsAndVCs, InvestmentScore,
		Scaling, DistributionChannels, Advertising, ReferralModels, IncreasingRate, ConversionRate, ReferralRate, MarketSize, 
		
		Maintenance

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
