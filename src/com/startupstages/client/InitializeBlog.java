package com.startupstages.client;

import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupstages.client.blog.BlogPanel;
import com.startupstages.client.blog.stages.ProblemSolutionFit;
import com.startupstages.client.model.Topic;
import com.startupstages.client.model.Topic.TopicID;

public class InitializeBlog extends VerticalPanel {

	public InitializeBlog() {

		StartupStagesGlobalVariables.blogPanel.clear();

		startTopics();

		this.add(new BlogPanel());

		ProblemSolutionFit.initialize();

		StartupStagesGlobalVariables.blogPanel.add(this);
	}

	public static void startTopics() {

		for (TopicID topicID : Topic.TopicID.values()) {

			StartupStagesGlobalVariables.topics
					.put(topicID, new Topic(topicID));
		}
	}
}
