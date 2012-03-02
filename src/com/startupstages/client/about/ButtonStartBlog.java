package com.startupstages.client.about;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Image;
import com.startupstages.client.InitializeBlog;
import com.startupstages.client.StartupStagesGlobalVariables;

public class ButtonStartBlog extends Image {

	public ButtonStartBlog() {

		this.setUrl(GWT.getModuleBaseURL() + "startupstages/tryItNow.jpg");
		this.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {

				StartupStagesGlobalVariables.blogPanel.clear();
				StartupStagesGlobalVariables.blogPanel
						.add(new InitializeBlog());
			}
		});

	}
}
