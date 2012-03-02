package com.startupstages.client;

import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupstages.client.blog.BlogPanel;
import com.startupstages.client.blog.steps.ProblemSolutionFitSteps;
import com.startupstages.client.model.Topic;
import com.startupstages.client.model.Topic.TopicID;

public class InitializeBlog extends VerticalPanel {

	public InitializeBlog() {

		startTopics();

		this.add(new BlogPanel());

		ProblemSolutionFitSteps.initialize();
	}

	public static void startTopics() {

		for (TopicID topicID : Topic.TopicID.values()) {

			StartupStagesGlobalVariables.topics
					.put(topicID, new Topic(topicID));
		}
	}
}
