package com.startupstages.client.blog;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupstages.client.model.Topic;
import com.startupstages.client.model.Topic.TopicID;

public class Ideation extends Composite {

	public Ideation() {

		AbsolutePanel absolutePanel = new AbsolutePanel();
		initWidget(absolutePanel);
		absolutePanel.setSize("700px", "600px");

		Image image = new Image("images/ideation.png");
		absolutePanel.add(image, 0, 24);

		absolutePanel.add(vpBuild(), 27, 265);

		absolutePanel.add(vpMeasure(), 245, 226);

		absolutePanel.add(vpLearn(), 485, 344);

		Image image_1 = new Image("images/arrow.png");
		image_1.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {

				BlogPanel.stepPanel.clear();
				BlogPanel.stepPanel.add(new ProblemValidation());
			}
		});
		absolutePanel.add(image_1, 503, 237);
	}

	private Anchor getTopic(final Topic topic) {

		Anchor anchorTopic = new Anchor(topic.getTopicName());
		anchorTopic.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				BlogPanel.topicPanel.clear();
			//	BlogPanel.topicPanel.add(new TopicPanel(topic));
			}
		});

		return anchorTopic;
	}

	private VerticalPanel vpBuild() {

		VerticalPanel verticalPanel_1 = new VerticalPanel();
		verticalPanel_1.setBorderWidth(1);
		verticalPanel_1.setSize("150px", "100px");

		VerticalPanel verticalPanel = new VerticalPanel();
		verticalPanel_1.add(verticalPanel);
		verticalPanel.setSpacing(10);

		HTML htmlBuild = new HTML("<b>BUILD:</b>", true);
		verticalPanel.add(htmlBuild);

		verticalPanel.add(getTopic(BlogPanel.topics
				.get(TopicID.VISION_STATEMENT)));

		verticalPanel.add(getTopic(BlogPanel.topics.get(TopicID.PERSONA)));

		verticalPanel.add(getTopic(BlogPanel.topics.get(TopicID.LEAN_CANVAS)));

		verticalPanel.add(getTopic(BlogPanel.topics.get(TopicID.TEAM)));

		Hyperlink hprlnkGoals = new Hyperlink("Goals", false, "newHistoryToken");
		verticalPanel.add(hprlnkGoals);

		Hyperlink hprlnkLandingPage = new Hyperlink("Landing page", false,
				"newHistoryToken");
		verticalPanel.add(hprlnkLandingPage);

		Hyperlink hprlnkFeedbackChanel = new Hyperlink("Feedback Chanel",
				false, "newHistoryToken");
		verticalPanel.add(hprlnkFeedbackChanel);

		Hyperlink hprlnkBlog = new Hyperlink("Blog", false, "newHistoryToken");
		verticalPanel.add(hprlnkBlog);

		return verticalPanel_1;
	}

	private VerticalPanel vpMeasure() {

		VerticalPanel verticalPanel_2 = new VerticalPanel();
		verticalPanel_2.setBorderWidth(1);
		verticalPanel_2.setSize("126px", "154px");

		VerticalPanel verticalPanel_3 = new VerticalPanel();
		verticalPanel_3.setSpacing(10);
		verticalPanel_2.add(verticalPanel_3);

		HTML htmlmeasure = new HTML("<b>MEASURE:</b>", true);
		verticalPanel_3.add(htmlmeasure);

		Hyperlink hprlnkVisits = new Hyperlink("Visits", false,
				"newHistoryToken");
		verticalPanel_3.add(hprlnkVisits);

		Hyperlink hprlnkSignups = new Hyperlink("Sign-ups", false,
				"newHistoryToken");
		verticalPanel_3.add(hprlnkSignups);

		Hyperlink hprlnkFeedback = new Hyperlink("Feedback", false,
				"newHistoryToken");
		verticalPanel_3.add(hprlnkFeedback);

		Hyperlink hprlnkCauses = new Hyperlink("Causes", false,
				"newHistoryToken");
		verticalPanel_3.add(hprlnkCauses);

		return verticalPanel_2;
	}

	private VerticalPanel vpLearn() {

		VerticalPanel verticalPanel_4 = new VerticalPanel();
		verticalPanel_4.setBorderWidth(1);
		verticalPanel_4.setSize("150px", "100px");

		VerticalPanel verticalPanel_5 = new VerticalPanel();
		verticalPanel_5.setSpacing(10);
		verticalPanel_4.add(verticalPanel_5);

		HTML htmllearn = new HTML("<b>LEARN:</b>", true);
		verticalPanel_5.add(htmllearn);

		Hyperlink hprlnkMarketResearch = new Hyperlink("Market Research",
				false, "newHistoryToken");
		verticalPanel_5.add(hprlnkMarketResearch);

		Hyperlink hprlnkSurveys = new Hyperlink("Surveys", false,
				"newHistoryToken");
		verticalPanel_5.add(hprlnkSurveys);

		return verticalPanel_4;
	}

}
