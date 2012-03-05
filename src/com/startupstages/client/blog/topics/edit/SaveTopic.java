package com.startupstages.client.blog.topics.edit;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.startupstages.client.StartupStagesGlobalVariables;
import com.startupstages.client.blog.BlogPanel;
import com.startupstages.client.blog.topics.TopicPanel;
import com.startupstages.client.blog.topics.TopicsService;
import com.startupstages.client.blog.topics.TopicsServiceAsync;
import com.startupstages.client.model.Topic;

public class SaveTopic {

	public static void save(final Topic topic) {

		final TopicsServiceAsync topicsService = GWT
				.create(TopicsService.class);

		topicsService.saveTopic(topic.getTopicName(),
				topic.getTopicDescription(), new AsyncCallback<Void>() {

					public void onFailure(Throwable caught) {

					}

					public void onSuccess(Void result) {

						StartupStagesGlobalVariables.topics.put(
								topic.getTopicID(), topic);

						BlogPanel.topicPanel.clear();
						BlogPanel.topicPanel.add(new TopicPanel(topic));
					}
				});

	}
}
