package com.startupstages.client.blog.topics;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupstages.client.StartupStagesGlobalVariables;
import com.startupstages.client.blog.BlogPanel;
import com.startupstages.client.blog.topics.edit.EditIcon;
import com.startupstages.client.comments.CommentsPanel;
import com.startupstages.client.model.Topic;
import com.startupstages.client.utilities.LoadingPanel;
import com.startupstages.client.utilities.UseTracking;

public class TopicPanel extends VerticalPanel {

	public static VerticalPanel vpTopicDescription = new VerticalPanel();

	public static VerticalPanel vpComments = new VerticalPanel();

	public TopicPanel(final Topic topic) {

		this.setSpacing(20);
		this.setWidth("600px");

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);

		add(new EditIcon(topic));

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		HTML htmlName = new HTML("<font size=6 color=orange><b>"
				+ topic.getTopicName() + "</b></font>", true);
		add(htmlName);

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);

		this.add(tabsPanel());

		vpTopicDescription.clear();
		this.add(vpTopicDescription);

		getDescription(topic);

		Label label = new Label(" ");
		add(label);

		vpComments.clear();
		vpComments.add(new CommentsPanel(topic));
		this.add(vpComments);
	}

	private void getDescription(final Topic topic) {

		if (topic.getTopicDescription() != null) {

			HTML htmlDescription = new HTML(topic.getTopicDescription(), true);
			vpTopicDescription.add(htmlDescription);

		} else {

			vpTopicDescription.add(new LoadingPanel());

			GetTopic.get(topic);
		}

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

	private HorizontalPanel tabsPanel() {

		HorizontalPanel hp = new HorizontalPanel();
		hp.setWidth("100%");

		HTML htmlReferences = new HTML(
				"<font size=4><b><a href=#>References</a>:</b></font>", true);
		htmlReferences.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

			}
		});

		hp.add(htmlReferences);

		if (showMyCompany()) {
			
			HTML htmlMyCompany = new HTML(
					"<font size=4><b><a href=#>My Company</a>:</b></font>",
					true);
			htmlMyCompany.addClickHandler(new ClickHandler() {

				@Override
				public void onClick(ClickEvent event) {

				}
			});
			hp.add(htmlMyCompany);
		}

		return hp;
	}

	private static boolean showMyCompany() {

		return false;
	}
}
