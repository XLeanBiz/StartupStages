package com.startupstages.client.blog.steps;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupstages.client.StartupStagesGlobalVariables;
import com.startupstages.client.blog.BlogPanel;
import com.startupstages.client.blog.StagesPanel;
import com.startupstages.client.blog.topics.TopicAnchor;
import com.startupstages.client.blog.topics.TopicPanel;
import com.startupstages.client.model.Topic.TopicID;

public class Incorporate {

	public static void initialize() {
		initialize(true);
	}

	public static void initialize(final boolean initTopicPanel) {
		
		StagesPanel.unselectStagesTabs();
		StagesPanel.hpProductMarketFit.setStyleName("backgroundColorWhite");

		BlogPanel.stepPanel.clear();
		BlogPanel.stepPanel.add(setPanel());

		if (initTopicPanel) {

			BlogPanel.topicPanel.clear();
			BlogPanel.topicPanel.add(new TopicPanel(
					StartupStagesGlobalVariables.topics.get(TopicID.Incorporate)));
		}
	}

	public static AbsolutePanel setPanel() {

		AbsolutePanel absolutePanel = new AbsolutePanel();
		absolutePanel.setSize("610px", "470px");

		Image image = new Image(GWT.getModuleBaseURL()
				+ "startupstages/incorporate.png");
		absolutePanel.add(image, 0, 0);

		absolutePanel.add(vpBuild(), 12, 150);

		absolutePanel.add(vpMeasure(), 162, 180);

		absolutePanel.add(vpLearn(), 312, 210);

		absolutePanel.add(vpAchieve(), 462, 250);

		HTML image_1 = new HTML("<a href=#><img src='" + GWT.getModuleBaseURL()
				+ "startupstages/arrow.png'></a>");
		image_1.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {

				Profiting.initialize();
			}
		});
		absolutePanel.add(image_1, 480, 137);

		return absolutePanel;
	}

	private static VerticalPanel vpBuild() {

		VerticalPanel vpTopic = BlogPanel.vpTopic();

		VerticalPanel vpInner = new VerticalPanel();
		vpInner.setSpacing(10);
		vpTopic.add(vpInner);

		HTML htmlBuild = new HTML("<center><b>BUILD</b></center>", true);
		vpInner.add(htmlBuild);

		vpInner.add(new TopicAnchor(StartupStagesGlobalVariables.topics
				.get(TopicID.FormalDocumentation)));

		vpInner.add(new TopicAnchor(StartupStagesGlobalVariables.topics
				.get(TopicID.Legal)));

		vpInner.add(new TopicAnchor(StartupStagesGlobalVariables.topics
				.get(TopicID.IPs)));

		return vpTopic;
	}

	private static VerticalPanel vpMeasure() {

		VerticalPanel verticalPanel_2 = new VerticalPanel();
		verticalPanel_2.setBorderWidth(1);
		verticalPanel_2.setSize("130px", "150px");

		VerticalPanel verticalPanel_3 = new VerticalPanel();
		verticalPanel_3.setSpacing(10);
		verticalPanel_2.add(verticalPanel_3);

		HTML htmlmeasure = new HTML("<center><b>MEASURE</b></center>", true);
		verticalPanel_3.add(htmlmeasure);

		verticalPanel_3.add(new TopicAnchor(StartupStagesGlobalVariables.topics
				.get(TopicID.Taxes)));

		return verticalPanel_2;
	}

	private static VerticalPanel vpLearn() {

		VerticalPanel vpTopic = BlogPanel.vpTopic();

		VerticalPanel vpInner = new VerticalPanel();
		vpInner.setSpacing(10);
		vpTopic.add(vpInner);

		HTML htmllearn = new HTML("<center><b>LEARN</b></center>", true);
		vpInner.add(htmllearn);

		vpInner.add(new TopicAnchor(StartupStagesGlobalVariables.topics
				.get(TopicID.MarketResearch)));

		vpInner.add(new TopicAnchor(StartupStagesGlobalVariables.topics
				.get(TopicID.Surveys)));

		return vpTopic;
	}
	
	private static VerticalPanel vpAchieve() {

		VerticalPanel vpTopic = BlogPanel.vpTopic();

		VerticalPanel vpInner = new VerticalPanel();
		vpInner.setSpacing(10);
		vpTopic.add(vpInner);

		HTML htmllearn = new HTML("<center><b>ACHIEVE</b></center>", true);
		vpInner.add(htmllearn);


		return vpTopic;
	}

}
