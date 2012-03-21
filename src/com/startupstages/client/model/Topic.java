package com.startupstages.client.model;

import com.startupstages.client.utilities.NameGenerator;

public class Topic {

	public enum TopicID {

		ProblemSolutionFit,
		Assumptions, 
		Persona, Scenarios,
		AssumptionRating, CustomerInterviews, Negatives, LeanUX, Sketching, PersonaPivot, TargetProblemPivot,
		ChampionProblem,
		
		UniqueValue, UniqueValueProposition, NonCodedMVPUse, LeanCanvas, NonCodedMVP, Wireframes, ABTests, ValidatedProposition,
		Idea, VisionStatement, Team, Goals, TeamSize, Feedback, MarketResearch, Surveys, BusinessModel, Mentoring, Empathy, _3Cofounders,
		Brand, BrandName, Logo, LandingPage, Domain, Blog, FeedbackChanels, SEO, Visits, SignUps, UnderstandingTime, _30Signups,
		
		ProductMarketFit,
		
		Prototype, 
		SourceRepository, Database, ProductionEnvironment, FeaturePrototype, 
		FeatureVisits, FeatureUses, TestCoverage, LOC,
		UserDrivenDevelopment, ExtremeProgramming, AgileDevelopment, UsabilityTests, APIPivot,
		_20Uses,

		Enhance, 
		UIDesign, Privacy, CodeQuality, CustomerSupport, SocialMedia, Rewards, 
		Satisfation, EarlyAdopters, Returns, _5Returning5,
		
		Incorporate, FormalDocumentation, Legal, IPs, Taxes,
		Profit, RevenueModel, Partnerships, CostPerUser, RevenuePerUser, DemandCurve, 
		
		Scale,
		Funding, AdvisorsBoard, InvestorsMeetings, Bootstrapping,
		Referring, ReferralModels, ReferralRate,
		Scaling, DistributionChannels, Advertising, VisitsIncreasingRate, ConversionRate, MarketSize, 
		
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
