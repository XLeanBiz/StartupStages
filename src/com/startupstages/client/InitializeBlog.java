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
				ProblemSolutionFit.initializeAll(true);
				break;

			case ProductMarketFit:
				ProductMarketFit.initializeAll(true);
				break;

			case Scale:
				Scale.initializeAll(true);
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

				ProblemSolutionFit.initializeAll(false);
				TopicPanel.initializeTopic(topicEnum);
				break;

			case Features:
			case MVP:
			case AgileDevelopment:
			case Usability:
			case BusinessModel:
			case Revenue:
			case MustHaveScore:

				ProductMarketFit.initializeAll(false);
				TopicPanel.initializeTopic(topicEnum);
				break;

			case Funding:

				Scale.initializeAll(false);
				TopicPanel.initializeTopic(topicEnum);
				break;

			default:
				ProblemSolutionFit.initializeAll(true);
				break;
			}

		} else {

			ProblemSolutionFit.initializeAll(true);
		}
	}

	public static void initializeStep(final AbsolutePanel panel) {

		BlogPanel.stepPanel.clear();
		BlogPanel.stepPanel.add(panel);
	}

}
