package com.startupstages.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.startupstages.client.blog.BlogPanel;
import com.startupstages.client.blog.steps.Ideation;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTEntryPoint implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		StartupStagesGlobalVariables.startTopics();

		RootPanel.get().clear();

		RootPanel.get().add(new BlogPanel());

		Ideation.initializeIdeationPanel();

	}
}
