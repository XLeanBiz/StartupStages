package com.startupstages.client.blog.topics.references;

import co.uniqueid.authentication.client.utilities.ConvertJson;

import com.google.gwt.core.client.GWT;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.startupstages.client.StartupStagesGlobalVariables;
import com.startupstages.client.blog.topics.TopicPanel;
import com.startupstages.client.model.Topic;

public class GetTopicReferences {

	public static void get(final Topic topic) {

		final TopicsReferencesServiceAsync topicsService = GWT
				.create(TopicsReferencesService.class);

		topicsService.getTopic(topic.getTopicName(),
				new AsyncCallback<String>() {

					public void onFailure(Throwable caught) {

						// System.out.println(caught);
					}

					public void onSuccess(String jsonResult) {

						if (jsonResult != null && !jsonResult.equals("")) {

							JSONObject obj = (JSONObject) JSONParser
									.parseStrict(jsonResult);

							String topicDescription = ConvertJson
									.convertToString(obj
											.get("topicDescription"));

							StartupStagesGlobalVariables.topics.get(
									topic.getTopicID()).setTopicDescription(
									topicDescription);

							TopicPanel.vpTopicReferences.clear();
							TopicPanel.vpTopicReferences
									.add(new TopicReferences(topic));
						}
					}
				});

	}
}
