package com.startupstages.client;

import com.google.gwt.core.client.EntryPoint;
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

		StartupStagesGlobalVariables.blogPanel.clear();
		//StartupStagesGlobalVariables.blogPanel.add(new BlogIntroduction(
			//	new ButtonStartBlog()));
		StartupStagesGlobalVariables.blogPanel.add(new InitializeBlog());
	}
}
