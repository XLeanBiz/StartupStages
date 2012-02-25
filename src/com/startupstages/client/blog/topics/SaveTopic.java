package com.startupstages.client.blog.topics;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class SaveTopic {

	public static void save(final String topicName,
			final String topicDescription) {

		final TopicsServiceAsync topicsService = GWT
				.create(TopicsService.class);

		topicsService.saveTopic(topicName, topicDescription,
				new AsyncCallback<Void>() {

					public void onFailure(Throwable caught) {

					}

					public void onSuccess(Void result) {

					}
				});

	}
}
