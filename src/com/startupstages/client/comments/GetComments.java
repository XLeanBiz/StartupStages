package com.startupstages.client.comments;



import co.uniqueid.authentication.client.utilities.ConvertJson;

import com.google.gwt.core.client.GWT;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Label;

public class GetComments {

	public static void get(final String topicName) {

		final CommentsServiceAsync commentsService = GWT
				.create(CommentsService.class);
		
		CommentsPanel.vpCommentsList.clear();

		commentsService.getComments(topicName, new AsyncCallback<String>() {

			public void onFailure(Throwable caught) {

			}

			public void onSuccess(String jsonResults) {

				JSONArray jsonArray = (JSONArray) JSONParser
						.parseStrict(jsonResults);

				for (int i = 0; i < jsonArray.size(); i++) {

					JSONObject jsonObject = (JSONObject) jsonArray.get(i);

					String comment = ConvertJson.convertToString(jsonObject
							.get("comment"));

					Label htmlComment = new Label(comment);

					CommentsPanel.vpCommentsList.add(htmlComment);
				}

			}
		});

	}
}
