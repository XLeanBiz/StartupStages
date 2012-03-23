package com.startupstages.client.comments;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.startupstages.client.model.Comment;

public class SaveComment {

	public static void save(final Comment comment) {

		final CommentsServiceAsync commentsService = GWT
				.create(CommentsService.class);

		commentsService.saveComment(comment.getUniqueID(),
				comment.getTopicName(), comment.getComment(),
				new AsyncCallback<Void>() {

					public void onFailure(Throwable caught) {

					}

					public void onSuccess(Void result) {

					}
				});

	}
}
