package com.startupstages.client;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupstages.client.model.Topic;

public class StartupStagesGlobalVariables extends VerticalPanel {

	public static VerticalPanel blogPanel = new VerticalPanel();

	public static Map<Topic.TopicID, Topic> topics = new HashMap<Topic.TopicID, Topic>();

}
