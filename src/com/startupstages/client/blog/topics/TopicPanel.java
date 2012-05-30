package com.startupstages.client.blog.topics;

import co.uniqueid.authentication.client.UniqueIDGlobalVariables;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupdata.client.MyCompanyPanel;
import com.startupstages.client.StartupStagesGlobalVariables;
import com.startupstages.client.blog.BlogPanel;
import com.startupstages.client.blog.topics.references.GetTopicReferences;
import com.startupstages.client.blog.topics.references.TopicReferences;
import com.startupstages.client.comments.CommentsPanel;
import com.startupstages.client.model.Topic;
import com.startupstages.client.utilities.LoadingPanel;
import com.startupstages.client.utilities.UseTracking;

public class TopicPanel extends VerticalPanel {

	public static VerticalPanel vpMyCompany = new VerticalPanel();

	public static VerticalPanel vpTopicReferences = new VerticalPanel();

	public static VerticalPanel vpComments = new VerticalPanel();

	public TopicPanel(final Topic topic) {

		this.setSpacing(20);
		this.setWidth("600px");

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);

		vpMyCompany.clear();
		vpTopicReferences.clear();
		vpComments.clear();

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		HTML htmlName = new HTML("<font size=6 color=orange><b>"
				+ topic.getTopicName() + "</b></font>", true);
		add(htmlName);

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);

		this.add(vpMyCompany);
		vpMyCompany.setWidth("100%");

		if (UniqueIDGlobalVariables.uniqueID != null) {

			vpMyCompany.add(new MyCompanyPanel(
					UniqueIDGlobalVariables.companyUniqueID, topic.getTopicID()
							.toString()));
		}

		this.add(vpTopicReferences);
		vpTopicReferences.setWidth("100%");
		showTopicReferences(topic);

		Label label = new Label(" ");
		add(label);

		this.add(vpComments);
		TopicPanel.vpComments.add(new CommentsPanel(topic));
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

	public static void showTopicReferences(final Topic topic) {

		if (topic.getTopicDescription() != null) {

			vpTopicReferences.add(new TopicReferences(topic));

		} else {

			vpTopicReferences.add(new LoadingPanel());

			GetTopicReferences.get(topic);
		}
	}

}
