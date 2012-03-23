package com.startupstages.client.comments;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface CommentsServiceAsync {

	void saveComment(String uniqueID, String topicName, String comment,
			AsyncCallback<Void> callback);

	void getComments(String topicName, AsyncCallback<String> callback);
	

}
