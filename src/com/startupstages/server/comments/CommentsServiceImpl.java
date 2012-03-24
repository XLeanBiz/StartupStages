package com.startupstages.server.comments;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.startupstages.client.comments.CommentsService;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class CommentsServiceImpl extends RemoteServiceServlet implements
		CommentsService {

	public String getComments(final String topicName)
			throws IllegalArgumentException {

		return GetComments.getJsonString(topicName);
	}

	public void saveComment(final String uniqueID, final String topicName,
			final String comment) throws IllegalArgumentException {

		SaveComment.save(uniqueID, topicName, comment);
	}
}
