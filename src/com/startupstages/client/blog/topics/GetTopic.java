package com.startupstages.client.blog.topics;

import com.google.gwt.core.client.GWT;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HTML;
import com.startupstages.client.StartupStagesGlobalVariables;
import com.startupstages.client.model.Topic;
import com.startupstages.client.utilities.ConvertJson;

public class GetTopic {

	public static void get(final Topic topic) {

		final TopicsServiceAsync topicsService = GWT
				.create(TopicsService.class);

		topicsService.getTopic(topic.getTopicName(),
				new AsyncCallback<String>() {

					public void onFailure(Throwable caught) {

						// System.out.println(caught);
					}

					public void onSuccess(String jsonResult) {

						if (jsonResult != null) {
							
							JSONObject obj = (JSONObject) JSONParser
									.parseStrict(jsonResult);

							String topicDescription = ConvertJson
									.convertToString(obj
											.get("topicDescription"));

							StartupStagesGlobalVariables.topics.get(
									topic.getTopicID()).setTopicDescription(
									topicDescription);

							TopicPanel.vpTopicDescription.clear();
							TopicPanel.vpTopicDescription.add(new HTML(
									topicDescription, true));
						}
					}
				});

	}
}
