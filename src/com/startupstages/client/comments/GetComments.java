package com.startupstages.client.comments;

import co.uniqueid.authentication.client.utilities.ConvertJson;

import com.google.gwt.core.client.GWT;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class GetComments {

	public static void get(final String topicName) {

		final CommentsServiceAsync commentsService = GWT
				.create(CommentsService.class);

		CommentsPanel.vpCommentsList.clear();

		commentsService.getComments(topicName, new AsyncCallback<String>() {

			public void onFailure(Throwable caught) {

			}

			public void onSuccess(String jsonResults) {

				CommentsPanel.vpCommentsList.clear();

				JSONArray jsonArray = (JSONArray) JSONParser
						.parseStrict(jsonResults);

				for (int i = (jsonArray.size()-1); i >= 0; i--) {

					JSONObject jsonObject = (JSONObject) jsonArray.get(i);

					String comment = ConvertJson.convertToString(jsonObject
							.get("comment"));

					String uniqueID = ConvertJson.convertToString(jsonObject
							.get("uniqueID"));

					CommentsPanel.vpCommentsList.add(new CommentsList(uniqueID,
							comment));
				}

			}
		});

	}
}
