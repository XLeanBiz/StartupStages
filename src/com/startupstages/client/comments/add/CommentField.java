package com.startupstages.client.comments.add;

import co.uniqueid.authentication.client.UniqueIDGlobalVariables;

import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.startupstages.client.comments.MyPhoto;
import com.startupstages.client.model.Topic;

public class CommentField extends HorizontalPanel {

	public static TextArea newComment = new TextArea();

	public CommentField(final Topic topic) {

		this.setSpacing(10);
		this.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);

		this.add(new MyPhoto(UniqueIDGlobalVariables.uniqueID));

		newComment.setSize("500px", "40px");

		this.add(newComment);

	}

}
