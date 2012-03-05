package com.startupstages.server.topics;

import com.startupstages.server.TrackMixPanel;
import com.startupstages.server.URLUtilities;

public class GetTopic {

	// http://jsonpfy.xleanbiz.appspot.com/GetDataService?
	// kind=Topic
	// &ID=Vision%20Statement

	private static String getTopicUrl = "http://jsonpfy.xleanbiz.appspot.com/GetDataService";

	public static String getJsonString(final String topicName) {

		TrackMixPanel.event("com.startupstages.server.topics.GetTopic");

		String parameters = "kind=Topic&ID=" + URLUtilities.encode(topicName);

		final String jsonTopicString = URLUtilities.fetchURLPost(getTopicUrl,
				parameters);

		return jsonTopicString;
	}
}
