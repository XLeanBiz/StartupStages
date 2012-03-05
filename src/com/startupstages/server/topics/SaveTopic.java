package com.startupstages.server.topics;

import com.startupstages.server.TrackMixPanel;
import com.startupstages.server.URLUtilities;

public class SaveTopic {

	// http://jsonpfy.xleanbiz.appspot.com/SaveDataService?
	// kind=Topic
	// &ID=Vision%20Statement
	// &fieldsKind=Text&fieldsName=topicDescription&fieldsValue=Test

	private static String saveTopicUrl = "http://jsonpfy.xleanbiz.appspot.com/SaveDataService";

	public static void save(final String topicName,
			final String topicDescription) {

		TrackMixPanel.event("com.startupstages.server.topics.SaveTopic");

		String parameters = "kind=Topic&ID=" + URLUtilities.encode(topicName);
		parameters += "&fieldsKind=Text&fieldsName=topicDescription&fieldsValue="
				+ URLUtilities.encode(topicDescription);

		URLUtilities.fetchURLPost(saveTopicUrl, parameters);
	}
}
