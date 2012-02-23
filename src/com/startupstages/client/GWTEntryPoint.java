package com.startupstages.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.startupstages.client.blog.BlogPanel;
import com.startupstages.client.model.TopicsMockup;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTEntryPoint implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
		BlogPanel.topics = TopicsMockup.getTopics();

		RootPanel.get().clear();

		RootPanel.get().add(new BlogPanel());

		BlogPanel.topicPanel.clear();
		// BlogPanel.topicPanel.add(new TopicPanel(BlogPanel.topics
		// .get(TopicID.VISION_STATEMENT)));
	}
}
