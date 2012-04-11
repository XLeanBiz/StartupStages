package com.startupstages.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window.Location;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTEntryPoint implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		RootPanel.get().clear();

		RootPanel.get().add(StartupStagesGlobalVariables.blogPanel);
		
		final String topic = Location.getParameter("topic");

		new InitializeBlog(topic);
	}
}
