package com.startupstages.client.comments;

import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupstages.client.model.Topic;

public class CommentField extends VerticalPanel {

	public static TextArea newComment = new TextArea();

	public CommentField(final Topic topic) {

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		
		newComment.setSize("500px", "50px");

		this.add(newComment);

		this.add(new ButtonSendComment(topic));
	}

}
