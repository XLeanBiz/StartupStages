package com.startupstages.client.utilities;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Animated image to demonstrate that the system is processing the user request.
 */
public class LoadingPanel extends VerticalPanel {

	public LoadingPanel() {

		setSpacing(30);

		add(new Image(GWT.getModuleBaseURL() + "startupstages/loading.gif"));
	}

}
