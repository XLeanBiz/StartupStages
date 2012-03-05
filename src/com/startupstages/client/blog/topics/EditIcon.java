package com.startupstages.client.blog.topics;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Image;
import com.startupstages.client.blog.BlogPanel;
import com.startupstages.client.blog.topics.edit.TopicEdit;
import com.startupstages.client.model.Topic;
import com.startupstages.client.utilities.UseTracking;

public class EditIcon extends Image {

	public EditIcon(final Topic topic) {

		this.setUrl(GWT.getModuleBaseURL() + "startupstages/EditIcon.jpg");
		this.setSize("22px", "20px");
		this.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {

				new UseTracking("com.startupstages.client.blog.topics.EditIcon");

				BlogPanel.topicPanel.clear();
				BlogPanel.topicPanel.add(new TopicEdit(topic));
			}
		});
	}

}
