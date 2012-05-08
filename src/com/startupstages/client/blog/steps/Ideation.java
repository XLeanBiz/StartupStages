package com.startupstages.client.blog.steps;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupstages.client.InitializeBlog;
import com.startupstages.client.StartupStagesGlobalVariables;
import com.startupstages.client.blog.BlogPanel;
import com.startupstages.client.blog.topics.TopicAnchor;
import com.startupstages.client.blog.topics.TopicPanel;
import com.startupstages.client.model.Topic;
import com.startupstages.client.model.Topic.TopicID;

public class Ideation {

	public static void initialize() {

		InitializeBlog.initializeStep(getPanel());
		TopicPanel.initializeTopic(Topic.TopicID.Idea);
	}

	public static AbsolutePanel getPanel() {

		AbsolutePanel absolutePanel = new AbsolutePanel();
		absolutePanel.setSize("610px", "455px");

		Image image = new Image(GWT.getModuleBaseURL()
				+ "startupstages/ideation.png");
		absolutePanel.add(image, 0, 0);

		absolutePanel.add(vpBuild(), 30, 150);

		absolutePanel.add(vpLearn(), 230, 170);

		absolutePanel.add(vpMeasure(), 440, 190);
		
		HTML image_1 = new HTML("<a href=#><img src='" + GWT.getModuleBaseURL()
				+ "startupstages/arrow.png' border=0></a>");
		image_1.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {

				Branding.initialize();
			}
		});
		absolutePanel.add(image_1, 480, 50);

		return absolutePanel;
	}

	private static VerticalPanel vpBuild() {

		VerticalPanel vpTopic = BlogPanel.vpTopic();

		VerticalPanel vpInner = new VerticalPanel();
		vpInner.setWidth("150px");
		vpInner.setSpacing(10);
		vpTopic.add(vpInner);

		HTML htmlBuild = new HTML("<center><b>BUILD</b></center>", true);
		vpInner.add(htmlBuild);

		vpInner.add(new TopicAnchor(TopicID.Vision));

		vpInner.add(new TopicAnchor(TopicID.Team));

		vpInner.add(new TopicAnchor(TopicID.Goals));

		return vpTopic;
	}

	private static VerticalPanel vpMeasure() {

		VerticalPanel vpTopic = BlogPanel.vpTopic();

		VerticalPanel vpInner = new VerticalPanel();
		vpInner.setWidth("150px");
		vpInner.setSpacing(10);
		vpTopic.add(vpInner);

		HTML htmlmeasure = new HTML("<center><b>MEASURE</b></center>", true);
		vpInner.add(htmlmeasure);

		vpInner.add(new TopicAnchor(TopicID.TeamSize));

		return vpTopic;
	}

	private static VerticalPanel vpLearn() {

		VerticalPanel vpTopic = BlogPanel.vpTopic();

		VerticalPanel vpInner = new VerticalPanel();
		vpInner.setWidth("150px");
		vpInner.setSpacing(10);
		vpTopic.add(vpInner);

		HTML htmllearn = new HTML("<center><b>LEARN</b></center>", true);
		vpInner.add(htmllearn);

		vpInner.add(new TopicAnchor(StartupStagesGlobalVariables.topics
				.get(TopicID.MarketResearch)));

		vpInner.add(new TopicAnchor(TopicID.Surveys));

		vpInner.add(new TopicAnchor(TopicID.Empathy));

		return vpTopic;
	}

}
