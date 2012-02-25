package com.startupstages.client.blog.topics;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface TopicsServiceAsync {
	
	void saveTopic(String topicName, String topicDescription,
			AsyncCallback<Void> callback);

	void getTopic(String topicName, AsyncCallback<String> callback);
}
