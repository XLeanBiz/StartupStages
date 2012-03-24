package com.startupstages.client.comments;

import co.uniqueid.authentication.client.utilities.ConvertJson;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.HTML;

public class MyPhoto extends HTML {

	public MyPhoto(final JSONObject unoUserJson) {

		String imageURL = ConvertJson.getStringValue(unoUserJson, "image");
		if (imageURL != null) {

			this.setHTML("<a href='http://unoidme.appspot.com?search="
					+ ConvertJson.getStringValue(unoUserJson, "facebookLogin")
					+ "' target='_blank'><img src='" + imageURL
					+ "' border=0 width='35px' height='35px' title='"
					+ ConvertJson.getStringValue(unoUserJson, "name")
					+ "'></a>");
		}
	}
}
