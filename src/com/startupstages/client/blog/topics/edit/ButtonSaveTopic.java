package com.startupstages.client.blog.topics.edit;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.startupstages.client.model.Topic;
import com.startupstages.client.utilities.UseTracking;

public class ButtonSaveTopic extends Button {

	public ButtonSaveTopic(final Topic topic, final String description) {

		this.setHTML("Save");

		this.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {

				new UseTracking(
						"com.startupstages.client.blog.topics.edit.ButtonSaveTopic");

				topic.setTopicDescription(description);

				SaveTopic.save(topic);
			}
		});

	}
}
