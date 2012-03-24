package com.startupstages.client.comments.add;

import co.uniqueid.authentication.client.UniqueIDGlobalVariables;
import co.uniqueid.authentication.client.utilities.ConvertJson;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.startupstages.client.model.Topic;
import com.startupstages.client.utilities.UseTracking;

public class ButtonSendComment extends Button {

	public ButtonSendComment(final Topic topic) {

		this.setHTML("Send");

		this.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {

				new UseTracking(
						"com.startupstages.client.blog.topics.edit.ButtonSendComment");

				String uniqueID = ConvertJson.getStringValue(
						UniqueIDGlobalVariables.uniqueID, "ID");

				String comment = CommentField.newComment.getValue();

				SaveComment.save(uniqueID, topic, comment);
			}
		});

	}
}
