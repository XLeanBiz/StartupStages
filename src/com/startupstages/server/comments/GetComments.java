package com.startupstages.server.comments;

import co.uniqueid.authentication.server.utilities.URLUtilities;

public class GetComments {

	// http://jsonpfy.xleanbiz.appspot.com/ListDataService
	// ?kind=Comments
	// &filterField=topicName&filterValue=alline.oliveira@gmail.com

	private static String listDataURL = "http://jsonpfy.xleanbiz.appspot.com/ListDataService";

	public static String getJsonString(final String topicName) {

		String parameters = "kind=Comments&filterField=topicName&filterValue="
				+ topicName;

		final String jsonString = URLUtilities.fetchURLPost(listDataURL,
				parameters);

		return jsonString;
	}
}
