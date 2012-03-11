package com.startupstages.client.model;

import com.startupstages.client.utilities.NameGenerator;

public class Topic {

	public enum TopicID {

		ProblemSolutionFit,
		Idea, VisionStatement, Persona, Team, Goals, TeamSize, MarketResearch, Surveys, _3Cofounders,
		Assumptions, Uses, UsesRate, CustomerInterviews, LeanUX, Sketching, LeanCanvas, PersonaPivot, TargetProblemPivot, Mentoring, ChampionProblem,
		UniqueValue, UniqueValueProposition, NonCodedMVPUse, NonCodedMVP, Wireframes, ABTests, ValidatedProposition,
		Brand, BrandName, Logo, LandingPage, Domain, Blog, FeedbackChanels, SEO, Visits, SignUps, _30Signups,
		
		ProductMarketFit,
		Prototype, SourceRepository, Database, ProductionEnvironment, FeaturePrototype, 
		FeatureVisits, FeatureUses, TestCoverage, LOC,
		UserDrivenDevelopment, ExtremeProgramming, AgileDevelopment, UsabilityTests, APIPivot,
		_20Uses,

		Enhance, Support, Performance, Security, Privacy, CodeQuality, SocialMedia, Rewards, Satisfation, EarlyAdopters, Returns, _5Returning5,
		Incorporate, FormalDocumentation, Legal, IPs, Taxes,
		Profit, Pricing, PaymentMethods, Sponsorships, CostPerUser, RevenuePerUser, DemandCurve, 
		
		Scale,
		Funding, AdvisorsBoard, InvestorsMeetings,
		Referring, ReferralModels, ReferralRate,
		Scaling, Advertising, VisitsIncreasingRate, ConversionRate, MarketSize, 
		
		Maintenance

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
