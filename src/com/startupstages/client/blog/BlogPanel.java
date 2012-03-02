package com.startupstages.client.blog;

import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class BlogPanel extends HorizontalPanel {

	public static HorizontalPanel stagePanel = new HorizontalPanel();

	public static AbsolutePanel stepPanel = new AbsolutePanel();

	public static VerticalPanel topicPanel = new VerticalPanel();

	public BlogPanel() {

		VerticalPanel verticalPanel = new VerticalPanel();

		verticalPanel.setStyleName("stagePanel");
		verticalPanel.setWidth("600px");
		verticalPanel
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		verticalPanel.add(new StagesPanel());

		stagePanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		stagePanel.setStyleName("stepsPanel");
		stagePanel.clear();
		verticalPanel.add(stagePanel);

		verticalPanel.add(new Label(". "));
		verticalPanel.add(new Label(". "));

		stepPanel.setStyleName("stepsPanel");
		stepPanel.setSize("95%", "95%");
		stepPanel.clear();
		verticalPanel.add(stepPanel);
		
		verticalPanel.add(new Label(". "));

		this.add(verticalPanel);

		topicPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		topicPanel.setSize("400px", "100%");
		topicPanel.setStyleName("stepsPanel");
		topicPanel.clear();
		this.add(topicPanel);
	}
}