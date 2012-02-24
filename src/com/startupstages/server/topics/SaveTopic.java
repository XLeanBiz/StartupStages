package com.startupstages.server.topics;

import com.startupstages.server.URLUtilities;

public class SaveTopic {

	// http://jsonpfy.xleanbiz.appspot.com/SaveDataService?
	// kind=Topic
	// &ID=VISION_STATEMENT
	// &fieldsKind=String&fieldsName=topicName&fieldsValue=Vision%20Statement
	// &fieldsKind=String&fieldsName=topicDescription&fieldsValue=Test

	private static String saveTopicUrl = "http://jsonpfy.xleanbiz.appspot.com/SaveDataService";

	public static void save(final String topicID, final String topicName,
			final String topicDescription) {

		String parameters = "?kind=Topic&ID=" + topicID;

		parameters += "&fieldsKind=String&fieldsName=topicName&fieldsValue="
				+ topicName;

		parameters += "&fieldsKind=String&fieldsName=topicDescription&fieldsValue="
				+ topicDescription;

		URLUtilities.fetchURLPost(saveTopicUrl, parameters);

	}
}
