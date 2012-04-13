package com.startupstages.client.blog.topics;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HTML;
import com.startupstages.client.StartupStagesGlobalVariables;
import com.startupstages.client.model.Topic;

public class TopicAnchor extends HTML {

	public TopicAnchor(final Topic.TopicID topicid) {

		this(StartupStagesGlobalVariables.topics.get(topicid));
	}

	public TopicAnchor(final Topic topic) {

		if (topic != null) {

			this.setHTML("<a href=#>" + topic.getTopicName() + "</a>");

			this.addClickHandler(new ClickHandler() {

				@Override
				public void onClick(ClickEvent event) {

					TopicPanel.initializeTopic(topic.getTopicID());
				}
			});
		}
	}
}
