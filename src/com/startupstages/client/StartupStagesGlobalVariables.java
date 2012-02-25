package com.startupstages.client;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupstages.client.model.Topic;
import com.startupstages.client.model.Topic.TopicID;

public class StartupStagesGlobalVariables extends VerticalPanel {

	public static Map<Topic.TopicID, Topic> topics = new HashMap<Topic.TopicID, Topic>();

	public static void startTopics() {

		for (TopicID topicID : Topic.TopicID.values()) {

			topics.put(topicID, new Topic(topicID));
		}
	}
}
