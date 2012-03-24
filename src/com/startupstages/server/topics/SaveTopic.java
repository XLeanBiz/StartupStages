package com.startupstages.server.topics;

import co.uniqueid.authentication.server.utilities.URLUtilities;

public class SaveTopic {

	// http://jsonpfy.xleanbiz.appspot.com/SaveDataService?
	// kind=Topic
	// &ID=Vision%20Statement
	// &fieldsKind=Text&fieldsName=topicDescription&fieldsValue=Test

	private static String saveTopicUrl = "http://jsonpfy.xleanbiz.appspot.com/SaveDataService";

	public static void save(final String topicName,
			final String topicDescription) {

		String parameters = "kind=Topic&ID=" + URLUtilities.encode(topicName);
		parameters += "&fieldsKind=Text&fieldsName=topicDescription&fieldsValue="
				+ URLUtilities.encode(topicDescription);

		URLUtilities.fetchURLPost(saveTopicUrl, parameters);
	}
}
