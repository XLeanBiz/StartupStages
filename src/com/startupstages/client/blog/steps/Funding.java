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

public class Funding {

	public static void initialize() {
		initialize(true);
	}

	public static void initialize(final boolean initTopicPanel) {
		
		StagesPanel.unselectStagesTabs();
		StagesPanel.hpScale.setStyleName("backgroundColorWhite");


		BlogPanel.stepPanel.clear();
		BlogPanel.stepPanel.add(setPanel());

		if (initTopicPanel) {

			BlogPanel.topicPanel.clear();
			BlogPanel.topicPanel.add(new TopicPanel(
					StartupStagesGlobalVariables.topics.get(TopicID.Funding)));
		}
	}

	public static AbsolutePanel setPanel() {

		AbsolutePanel absolutePanel = new AbsolutePanel();
		absolutePanel.setSize("590px", "470px");

		Image image = new Image(GWT.getModuleBaseURL()
				+ "startupstages/funding.png");
		absolutePanel.add(image, 0, 0);

		absolutePanel.add(vpBuild(), 12, 150);

		absolutePanel.add(vpMeasure(), 152, 180);

		absolutePanel.add(vpLearn(), 292, 210);
		
		absolutePanel.add(vpAchieve(), 432, 250);

		HTML image_1 = new HTML("<a href=#><img src='" + GWT.getModuleBaseURL()
				+ "startupstages/arrow.png'></a>");
		image_1.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {

				Referring.initialize();
			}
		});
		absolutePanel.add(image_1, 450, 137);

		return absolutePanel;
	}

	private static VerticalPanel vpBuild() {

		VerticalPanel verticalPanel_1 = new VerticalPanel();
		verticalPanel_1.setBorderWidth(1);
		verticalPanel_1.setSize("130px", "150px");

		VerticalPanel verticalPanel = new VerticalPanel();
		verticalPanel_1.add(verticalPanel);
		verticalPanel.setSpacing(10);

		HTML htmlBuild = new HTML("<center><b>BUILD</b></center>", true);
		verticalPanel.add(htmlBuild);

		verticalPanel.add(new TopicAnchor(StartupStagesGlobalVariables.topics
				.get(TopicID.AdvisorsBoard)));

		verticalPanel.add(new TopicAnchor(StartupStagesGlobalVariables.topics
				.get(TopicID.InvestorsMeetings)));

		return verticalPanel_1;
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
				.get(TopicID.TeamSize)));

		return verticalPanel_2;
	}

	private static VerticalPanel vpLearn() {

		VerticalPanel verticalPanel_4 = new VerticalPanel();
		verticalPanel_4.setBorderWidth(1);
		verticalPanel_4.setSize("130px", "150px");

		VerticalPanel verticalPanel_5 = new VerticalPanel();
		verticalPanel_5.setSpacing(10);
		verticalPanel_4.add(verticalPanel_5);

		HTML htmllearn = new HTML("<center><b>LEARN</b></center>", true);
		verticalPanel_5.add(htmllearn);

		verticalPanel_5.add(new TopicAnchor(StartupStagesGlobalVariables.topics
				.get(TopicID.MarketResearch)));

		verticalPanel_5.add(new TopicAnchor(StartupStagesGlobalVariables.topics
				.get(TopicID.Surveys)));

		return verticalPanel_4;
	}
	
	private static VerticalPanel vpAchieve() {

		VerticalPanel verticalPanel_4 = new VerticalPanel();
		verticalPanel_4.setBorderWidth(1);
		verticalPanel_4.setSize("130px", "150px");

		VerticalPanel verticalPanel_5 = new VerticalPanel();
		verticalPanel_5.setSpacing(10);
		verticalPanel_4.add(verticalPanel_5);

		HTML htmllearn = new HTML("<center><b>ACHIEVE</b></center>", true);
		verticalPanel_5.add(htmllearn);

		verticalPanel_5.add(new TopicAnchor(StartupStagesGlobalVariables.topics
				.get(TopicID.The3Cofounders)));

		return verticalPanel_4;
	}

}
