package com.startupstages.client.blog.topics.references.edit;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.startupstages.client.blog.BlogPanel;
import com.startupstages.client.model.Topic;
import com.startupstages.client.utilities.UseTracking;

public class EditReferenceIcon extends Anchor {

	public EditReferenceIcon(final Topic topic) {

		this.setHTML("<a href=#><img src='"
				+ GWT.getModuleBaseURL()
				+ "startupstages/EditIcon.jpg' width='18px' height='18px' border=0></a>");

		this.setSize("22px", "20px");

		this.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {

				new UseTracking("com.startupstages.client.blog.topics.EditIcon");

				BlogPanel.topicPanel.clear();
				BlogPanel.topicPanel.add(new EditTopicReferences(topic));
			}
		});
	}

}
