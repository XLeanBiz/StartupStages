package com.startupstages.client.comments;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.startupstages.client.model.Comment;
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
				
				Comment newComment = new Comment();

				newComment.setComment(CommentField.newComment.getValue());
				
				SaveComment.save(newComment);
			}
		});

	}
}
