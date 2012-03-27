package com.startupstages.client.comments;

import co.uniqueid.authentication.client.utilities.ConvertJson;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.HTML;

public class MyPhoto extends HTML {

	public MyPhoto(final JSONObject unoUserJson) {

		this(ConvertJson.getStringValue(unoUserJson, "entityName"), ConvertJson
				.getStringValue(unoUserJson, "image"), ConvertJson
				.getStringValue(unoUserJson, "ID"));
	}

	public MyPhoto(final String name, final String image,
			final String uniqueID) {

		if (image != null) {

			this.setHTML("<a href='http://uniqueid.co?search="
					+ uniqueID + "' target='_blank'><img src='" + image
					+ "' border=0 width='35px' height='35px' title='" + name
					+ "'></a>");
		}
	}
}
