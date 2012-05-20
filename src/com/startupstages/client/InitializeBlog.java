package com.startupstages.client;

import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupstages.client.blog.BlogPanel;
import com.startupstages.client.blog.stages.ProblemSolutionFit;
import com.startupstages.client.blog.stages.ProductMarketFit;
import com.startupstages.client.blog.stages.Scale;
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

			case Persona:
			case Problem:
			case Solution:
			case Experiment:
			case Team:
			case Brand:
			case ProblemScore:
			case EarlyAdopters:
			case CustomerDevelopment:
			case LeanUX:
			case LeanStartup:

				ProblemSolutionFit.initializeAll();
				TopicPanel.initializeTopic(topicEnum);
				break;

			case Features:
			case MVP:
			case AgileDevelopment:
			case Usability:
			case BusinessModel:
			case Revenue:
			case MustHaveScore:

				ProductMarketFit.initializeAll();
				TopicPanel.initializeTopic(topicEnum);
				break;

			case Funding:

				Scale.initializeAll();
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
