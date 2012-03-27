package com.startupstages.client.comments;

import co.uniqueid.authentication.client.uniqueid.UniqueIDService;
import co.uniqueid.authentication.client.uniqueid.UniqueIDServiceAsync;

import com.google.gwt.core.client.GWT;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HorizontalPanel;

public class GetUniqueID {

	public static void getFromID(final String uniqueID,
			final HorizontalPanel hpPhoto) {

		final UniqueIDServiceAsync uniqueIDService = GWT
				.create(UniqueIDService.class);

		uniqueIDService.getUniqueID(uniqueID, new AsyncCallback<String>() {

			public void onFailure(final Throwable caught) {
				System.out.println(caught);
			}

			public void onSuccess(final String jsonResults) {

				if (jsonResults != null) {

					JSONObject obj = (JSONObject) JSONParser
							.parseStrict(jsonResults);

					hpPhoto.clear();
					hpPhoto.add(new MyPhoto(obj));
				}
			}
		});
	}

}
