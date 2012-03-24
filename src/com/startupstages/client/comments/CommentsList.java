package com.startupstages.client.comments;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupstages.client.comments.add.ButtonSendComment;
import com.startupstages.client.comments.add.CommentField;
import com.startupstages.client.model.Topic;

public class CommentsList extends VerticalPanel {

	public CommentsList(final Topic topic) {

		HTML html = new HTML("<font size=3><b>Comments:</b></font>", true);
		add(html);

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		add(new CommentField(topic));

		this.add(new ButtonSendComment(topic));

	}

}
