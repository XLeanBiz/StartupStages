package com.startupstages.client.model;

import com.startupstages.client.utilities.FeatureNameGenerator;

public class Topic {

	public enum TopicID {

		ProblemSolutionFit,
		
		Assumptions, Persona, Scenarios, CustomerInterviews, Negatives, LeanUX, PersonaPivot, TargetProblemPivot, ProblemScore,
		UniqueValue, UniqueValueProposition, LeanCanvas, MVP, Wireframes, ABTests, MVPScore,
		Idea, VisionStatement, Team, Goals, TeamSize, Feedback, MarketResearch, Surveys, BusinessModel, Mentoring, Empathy,
		Brand, BrandName, Logo, LandingPage, Domain, Blog, FeedbackChanels, SEO, Visits, SignUps, UnderstandingTime,
		
		ProductMarketFit,
		
		Prototype, 
		SourceRepository, Database, ProductionEnvironment, FeaturePrototype, 
		FeatureVisits, FeatureUses, TestCoverage, LOC,
		UserDrivenDevelopment, ExtremeProgramming, AgileDevelopment, UsabilityTests, APIPivot,

		Enhance, UIDesign, Privacy, CodeQuality, CustomerSupport, SocialMedia, Rewards, EarlyAdopters, Returns,
		
		Incorporate, FormalDocumentation, Legal, IPs, Taxes,
		Profit, RevenueModel, Partnerships, CostPerUser, RevenuePerUser, MustHaveScore, DemandCurve, 
		
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
