package com.startupstages.server.topics;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.startupstages.client.blog.topics.TopicsService;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class TopicsServiceImpl extends RemoteServiceServlet implements
		TopicsService {

	public String getTopic(final String topicName)
			throws IllegalArgumentException {

		return GetTopic.getJsonString(topicName);
	}

	public void saveTopic(final String topicName, final String topicDescription)
			throws IllegalArgumentException {

		SaveTopic.save(topicName, topicDescription);
	}
}
