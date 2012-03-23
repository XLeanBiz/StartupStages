package com.startupstages.client.comments;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("comments")
public interface CommentsService extends RemoteService {
	
	String getComments(String topicName)
			throws IllegalArgumentException;

	void saveComment(String uniqueID, String topicName, String comment)
			throws IllegalArgumentException;
}
