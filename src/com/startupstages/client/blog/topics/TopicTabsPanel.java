package com.startupstages.client.blog.topics;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.startupdata.client.MyCompanyLink;
import com.startupdata.client.StartupData;
import com.startupstages.client.blog.topics.edit.EditIcon;
import com.startupstages.client.comments.CommentsPanel;
import com.startupstages.client.model.Topic;
import com.startupstages.client.utilities.LoadingPanel;

public class TopicTabsPanel extends HorizontalPanel {

	public TopicTabsPanel(final Topic topic) {

		this.setWidth("100%");

		HTML htmlReferences = new HTML(
				"<font size=4><b><a href=#>References</a></b></font>", true);
		htmlReferences.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				getDescription(topic);
			}
		});

		this.add(htmlReferences);

		if (MyCompanyLink.showMyCompany(topic.getTopicID().toString())) {

			HTML htmlMyCompany = new HTML(
					"<font size=4><b><a href=#>My Company</a></b></font>", true);
			htmlMyCompany.addClickHandler(new ClickHandler() {

				@Override
				public void onClick(ClickEvent event) {

					getMyCompanyTopic(topic, false);
				}
			});

			this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);
			this.add(htmlMyCompany);
		}
	}

	public static void getDescription(final Topic topic) {

		TopicPanel.vpEditIcon.clear();
		TopicPanel.vpTopicDescription.clear();
		TopicPanel.vpComments.clear();

		TopicPanel.vpEditIcon.add(new EditIcon(topic, true));

		if (topic.getTopicDescription() != null) {

			HTML htmlDescription = new HTML(topic.getTopicDescription(), true);
			TopicPanel.vpTopicDescription.add(htmlDescription);

		} else {

			TopicPanel.vpTopicDescription.add(new LoadingPanel());

			GetTopic.get(topic);
		}

		TopicPanel.vpComments.add(new CommentsPanel(topic));
	}

	public static void getMyCompanyTopic(final Topic topic, boolean isEdit) {

		TopicPanel.vpEditIcon.clear();
		TopicPanel.vpTopicDescription.clear();
		TopicPanel.vpComments.clear();

		TopicPanel.vpEditIcon.add(new EditIcon(topic, false));
		TopicPanel.vpTopicDescription.add(StartupData.vpStartupTopic);
		if (!isEdit) {

			StartupData.showTopic(topic.getTopicID().toString());
		} else {

			StartupData.editTopic(topic.getTopicID().toString());
		}

	}

}
