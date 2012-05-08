package com.startupstages.client.blog.topics;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("topics")
public interface TopicsService extends RemoteService {

	String getTopic(String topicName);

	void saveTopic(String topicName, String topicDescription);
}
