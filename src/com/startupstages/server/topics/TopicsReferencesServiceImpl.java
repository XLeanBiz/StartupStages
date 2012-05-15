package com.startupstages.server.topics;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.startupstages.client.blog.topics.references.TopicsReferencesService;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class TopicsReferencesServiceImpl extends RemoteServiceServlet implements
		TopicsReferencesService {

	public String getTopic(final String topicName) {

		return GetTopic.getJsonString(topicName);
	}

	public void saveTopic(final String topicName, final String topicDescription) {

		SaveTopic.save(topicName, topicDescription);
	}
}
