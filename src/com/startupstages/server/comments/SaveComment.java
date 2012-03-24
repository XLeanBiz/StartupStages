package com.startupstages.server.comments;

import java.util.Date;

import co.uniqueid.authentication.server.utilities.URLUtilities;

public class SaveComment {

	// http://jsonpfy.xleanbiz.appspot.com/SaveDataService?
	// kind=Topic
	// &ID=Vision%20Statement
	// &fieldsKind=Text&fieldsName=topicDescription&fieldsValue=Test

	private static String saveTopicUrl = "http://jsonpfy.xleanbiz.appspot.com/SaveDataService";

	public static void save(final String uniqueID, final String topicName,
			final String comment) {

		String parameters = "kind=Comments";

		parameters += URLUtilities.addSaveParameterString(uniqueID, "uniqueID");

		parameters += URLUtilities.addSaveParameterString(topicName,
				"topicName");

		parameters += URLUtilities.addSaveParameterText(comment, "comment");

		parameters += URLUtilities.addSaveParameterString(
				((new Date()).getTime()) + "", "dateTime");

		URLUtilities.fetchURLPost(saveTopicUrl, parameters);
	}
}
