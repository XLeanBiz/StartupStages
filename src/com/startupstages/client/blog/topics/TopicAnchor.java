package com.startupstages.client.blog.topics;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HTML;
import com.startupstages.client.blog.BlogPanel;
import com.startupstages.client.model.Topic;
import com.startupstages.client.utilities.UseTracking;

public class TopicAnchor extends HTML {

	public TopicAnchor(final Topic topic) {

		if (topic != null) {

			this.setHTML("<a href=#>" + topic.getTopicName() + "</a>");

			this.addClickHandler(new ClickHandler() {

				@Override
				public void onClick(ClickEvent event) {

					new UseTracking(
							"com.startupstages.client.blog.topics.TopicAnchor#"
									+ topic.getTopicID());

					BlogPanel.topicPanel.clear();
					BlogPanel.topicPanel.add(new TopicPanel(topic));
				}
			});
		}
	}
}
