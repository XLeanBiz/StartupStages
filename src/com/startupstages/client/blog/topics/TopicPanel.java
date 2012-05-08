package com.startupstages.client.blog.topics;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupstages.client.StartupStagesGlobalVariables;
import com.startupstages.client.blog.BlogPanel;
import com.startupstages.client.blog.topics.edit.EditIcon;
import com.startupstages.client.model.Topic;
import com.startupstages.client.utilities.UseTracking;

public class TopicPanel extends VerticalPanel {

	public static VerticalPanel vpEditIcon = new VerticalPanel();

	public static VerticalPanel vpTopicDescription = new VerticalPanel();

	public static VerticalPanel vpComments = new VerticalPanel();

	public TopicPanel(final Topic topic) {

		this.setSpacing(20);
		this.setWidth("600px");

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);

		vpEditIcon.clear();
		vpTopicDescription.clear();
		vpComments.clear();

		vpEditIcon.add(new EditIcon(topic, true));
		add(vpEditIcon);

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		HTML htmlName = new HTML("<font size=6 color=orange><b>"
				+ topic.getTopicName() + "</b></font>", true);
		add(htmlName);

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);

		this.add(new TopicTabsPanel(topic));

		this.add(vpTopicDescription);

		Label label = new Label(" ");
		add(label);

		this.add(vpComments);

		TopicTabsPanel.getDescription(topic);
	}

	public static void initializeTopic(final Topic.TopicID topicId) {

		initializeTopic(StartupStagesGlobalVariables.topics.get(topicId));
	}

	public static void initializeTopic(final Topic topic) {

		new UseTracking("com.startupstages.client.blog.topics.TopicAnchor#"
				+ topic.getTopicID());

		BlogPanel.topicPanel.clear();
		BlogPanel.topicPanel.add(new TopicPanel(topic));
	}

}
