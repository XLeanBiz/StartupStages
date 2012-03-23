package com.startupstages.client.comments;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupstages.client.model.Topic;

public class CommentsPanel extends VerticalPanel {

	public CommentsPanel(final Topic topic) {

		this.setSpacing(20);
		this.setWidth("600px");

		HTML html = new HTML("<font size=3><b>Comments:</b></font>",
				true);
		add(html);
		
		add(new CommentField(topic));


	}

}
