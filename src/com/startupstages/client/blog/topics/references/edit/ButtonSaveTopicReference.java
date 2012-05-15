package com.startupstages.client.blog.topics.references.edit;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.startupstages.client.model.Topic;
import com.startupstages.client.utilities.UseTracking;

public class ButtonSaveTopicReference extends Button {

	public ButtonSaveTopicReference(final Topic topic) {

		this.setHTML("Save");

		this.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {

				new UseTracking(
						"com.startupstages.client.blog.topics.edit.ButtonSaveTopic");

				topic.setTopicDescription(EditTopicReferences.area.getHTML());

				SaveTopicReferences.save(topic);
			}
		});

	}
}
