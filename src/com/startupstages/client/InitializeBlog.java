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
import com.startupstages.client.blog.steps.Incorporate;
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

			case Incorporate:
				ProductMarketFit.initializeStage();
				Incorporate.initialize();
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
			case Negatives:
			case LeanUX:
			case PersonaPivot:
			case TargetProblemPivot:
			case ProblemScore:
				ProductMarketFit.initializeStage();
				InitializeBlog.initializeStep(Assumptions.getPanel());
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
