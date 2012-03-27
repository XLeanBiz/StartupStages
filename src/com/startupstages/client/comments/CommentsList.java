package com.startupstages.client.comments;

import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;

public class CommentsList extends HorizontalPanel {

	public CommentsList(final String uniqueID, final String comment) {

		this.setSpacing(10);
		this.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);

		HorizontalPanel hpPhoto = new HorizontalPanel();

		this.add(hpPhoto);

		GetUniqueID.getFromID(uniqueID, hpPhoto);

		this.add(new Label(comment));

	}

}
