package com.startupstages.client.blog.topics.references;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface TopicsReferencesServiceAsync {
	
	void saveTopic(String topicName, String topicDescription,
			AsyncCallback<Void> callback);

	void getTopic(String topicName, AsyncCallback<String> callback);
}
