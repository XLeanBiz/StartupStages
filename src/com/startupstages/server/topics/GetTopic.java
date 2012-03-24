package com.startupstages.server.topics;

import co.uniqueid.authentication.server.utilities.URLUtilities;

public class GetTopic {

	// http://jsonpfy.xleanbiz.appspot.com/GetDataService?
	// kind=Topic
	// &ID=Vision%20Statement

	private static String getTopicUrl = "http://jsonpfy.xleanbiz.appspot.com/GetDataService";

	public static String getJsonString(final String topicName) {

		String parameters = "kind=Topic&ID=" + URLUtilities.encode(topicName);

		final String jsonTopicString = URLUtilities.fetchURLPost(getTopicUrl,
				parameters);

		return jsonTopicString;
	}
}
