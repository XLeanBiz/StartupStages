package com.startupstages.client.comments.add;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.startupstages.client.blog.topics.TopicPanel;
import com.startupstages.client.comments.CommentsPanel;
import com.startupstages.client.comments.CommentsService;
import com.startupstages.client.comments.CommentsServiceAsync;
import com.startupstages.client.model.Topic;

public class SaveComment {

	public static void save(final String uniqueID, final Topic topic,
			final String comment) {

		final CommentsServiceAsync commentsService = GWT
				.create(CommentsService.class);

		commentsService.saveComment(uniqueID, topic.getTopicName(), comment,
				new AsyncCallback<Void>() {

					public void onFailure(Throwable caught) {

					}

					public void onSuccess(Void result) {

						CommentField.newComment.setValue(null);

						TopicPanel.vpComments.clear();
						TopicPanel.vpComments.add(new CommentsPanel(topic));
					}
				});

	}
}
