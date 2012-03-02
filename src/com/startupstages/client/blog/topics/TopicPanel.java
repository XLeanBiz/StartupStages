package com.startupstages.client.blog.topics;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupstages.client.blog.BlogPanel;
import com.startupstages.client.model.Topic;
import com.startupstages.client.utilities.LoadingPanel;

public class TopicPanel extends VerticalPanel {

	public static VerticalPanel vpTopicDescription = new VerticalPanel();

	public TopicPanel(final Topic topic) {

		this.setSpacing(20);
		this.setWidth("600px");

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);

		Image image = new Image(GWT.getModuleBaseURL()
				+ "startupstages/EditIcon.jpg");
		image.setSize("22px", "26px");
		image.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {

				BlogPanel.topicPanel.clear();
				BlogPanel.topicPanel.add(new TopicEdit(topic));
			}
		});
		add(image);

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		HTML htmlName = new HTML("<font size=6 color=orange><b>"
				+ topic.getTopicName() + "</b></font>", true);
		add(htmlName);

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);

		HTML htmlReferences = new HTML(
				"<font size=4><b>References:</b></font>", true);
		add(htmlReferences);

		vpTopicDescription.clear();
		this.add(vpTopicDescription);

		getDescription(topic);

		Label label = new Label(" ");
		add(label);
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

}
