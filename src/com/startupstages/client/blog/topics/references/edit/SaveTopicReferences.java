package com.startupstages.client.blog.topics.references.edit;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.startupstages.client.StartupStagesGlobalVariables;
import com.startupstages.client.blog.BlogPanel;
import com.startupstages.client.blog.topics.TopicPanel;
import com.startupstages.client.blog.topics.references.TopicsReferencesService;
import com.startupstages.client.blog.topics.references.TopicsReferencesServiceAsync;
import com.startupstages.client.model.Topic;

public class SaveTopicReferences {

	public static void save(final Topic topic) {

		final TopicsReferencesServiceAsync topicsService = GWT
				.create(TopicsReferencesService.class);

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
