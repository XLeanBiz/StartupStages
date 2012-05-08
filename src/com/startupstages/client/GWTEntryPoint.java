package com.startupstages.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window.Location;
import com.google.gwt.user.client.ui.RootPanel;
import com.startupdata.client.StartupData;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTEntryPoint implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		StartupData.init("EXtremeLeanBusiness_1332812176007");

		RootPanel.get().clear();

		RootPanel.get().add(StartupStagesGlobalVariables.blogPanel);

		final String topic = Location.getParameter("topic");

		new InitializeBlog(topic);
	}
}
