package com.startupstages.client;

import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupstages.client.blog.BlogPanel;
import com.startupstages.client.blog.stages.ProblemSolutionFit;
import com.startupstages.client.blog.stages.ProductMarketFit;
import com.startupstages.client.blog.stages.Scale;
import com.startupstages.client.blog.steps.Assumptions;
import com.startupstages.client.blog.steps.Branding;
import com.startupstages.client.blog.steps.Enhancing;
import com.startupstages.client.blog.steps.Funding;
import com.startupstages.client.blog.steps.Ideation;
import com.startupstages.client.blog.steps.Profiting;
import com.startupstages.client.blog.steps.Prototyping;
import com.startupstages.client.blog.steps.Scaling;
import com.startupstages.client.blog.steps.UniqueValue;
import com.startupstages.client.blog.topics.TopicPanel;
import com.startupstages.client.model.Topic;
import com.startupstages.client.model.Topic.TopicID;

public class InitializeBlog extends VerticalPanel {

	public InitializeBlog(final String topicRequested) {

		StartupStagesGlobalVariables.blogPanel.clear();

		startTopics();

		this.add(new BlogPanel());

		getTopicIDs(topicRequested);

		StartupStagesGlobalVariables.blogPanel.add(this);
	}

	public static void startTopics() {

		for (TopicID topicID : Topic.TopicID.values()) {

			StartupStagesGlobalVariables.topics
					.put(topicID, new Topic(topicID));
		}
	}

	private void getTopicIDs(final String topicRequested) {

		if (topicRequested != null) {

			Topic.TopicID topicEnum = Topic.TopicID.valueOf(topicRequested);

			switch (topicEnum) {

			case ProblemSolutionFit:
				ProblemSolutionFit.initializeAll();
				break;

			case ProductMarketFit:
				ProductMarketFit.initializeAll();
				break;

			case Scale:
				Scale.initializeAll();
				break;

			case Assumptions:
				ProblemSolutionFit.initializeStage();
				Assumptions.initialize();
				break;

			case UniqueValue:
				ProblemSolutionFit.initializeStage();
				UniqueValue.initialize();
				break;

			case Idea:
				ProblemSolutionFit.initializeStage();
				Ideation.initialize();
				break;

			case Brand:
				ProblemSolutionFit.initializeStage();
				Branding.initialize();
				break;

			case Prototype:
				ProductMarketFit.initializeStage();
				Prototyping.initialize();
				break;

			case Enhance:
				ProductMarketFit.initializeStage();
				Enhancing.initialize();
				break;

			case Profit:
				ProductMarketFit.initializeStage();
				Profiting.initialize();
				break;

			case Funding:
				ProductMarketFit.initializeStage();
				Funding.initialize();
				break;

			case Scaling:
				ProductMarketFit.initializeStage();
				Scaling.initialize();
				break;

			case Persona:
			case Scenarios:
			case CustomerInterviews:
			case LeanUX:
			case Pivot:
			case ProblemScore:
				ProblemSolutionFit.initializeStage();
				InitializeBlog.initializeStep(Assumptions.getPanel());
				TopicPanel.initializeTopic(topicEnum);
				break;

			case UniqueValueProposition:
			case BusinessCanvas:
			case MVP:
			case Wireframes:
			case ABTests:
			case UniqueValueScore:
			case MVPResults:
				ProblemSolutionFit.initializeStage();
				InitializeBlog.initializeStep(UniqueValue.getPanel());
				TopicPanel.initializeTopic(topicEnum);
				break;

			case Vision:
			case Team:
			case Goals:
			case TeamSize:
			case Feedback:
			case MarketResearch:
			case Surveys:
			case Mentoring:
			case Empathy:

				ProblemSolutionFit.initializeStage();
				InitializeBlog.initializeStep(Ideation.getPanel());
				TopicPanel.initializeTopic(topicEnum);
				break;

			case BrandName:
			case Logo:
			case LandingPage:
			case Domain:
			case Blog:
			case FeedbackChanels:
			case SEO:
			case Visits:
			case SignUps:
			case CommunicationSkills:

				ProblemSolutionFit.initializeStage();
				InitializeBlog.initializeStep(Branding.getPanel());
				TopicPanel.initializeTopic(topicEnum);
				break;

			case SourceCode:
			case Features:
			case FeatureVisits:
			case FeatureUses:
			case TestCoverage:
			case LOC:
			case AgileDevelopment:
			case UsabilityTests:
			case APIPivot:

				ProductMarketFit.initializeStage();
				InitializeBlog.initializeStep(Prototyping.getPanel());
				TopicPanel.initializeTopic(topicEnum);
				break;

			case RevenueModel:
			case Partnerships:
			case CostPerUser:
			case RevenuePerUser:
			case MustHaveScore:
			case DemandCurve:

				ProductMarketFit.initializeStage();
				InitializeBlog.initializeStep(Profiting.getPanel());
				TopicPanel.initializeTopic(topicEnum);
				break;

			default:
				ProblemSolutionFit.initializeAll();
				break;
			}

		} else {

			ProblemSolutionFit.initializeAll();
		}
	}

	public static void initializeStep(final AbsolutePanel panel) {

		BlogPanel.stepPanel.clear();
		BlogPanel.stepPanel.add(panel);
	}

}
