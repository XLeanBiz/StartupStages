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

public class Assumptions {

	public static void initialize() {
		initialize(true);
	}

	public static void initialize(final boolean initTopicPanel) {

		StagesPanel.unselectStagesTabs();
		StagesPanel.hpProblemSolutionFit.setStyleName("backgroundColorWhite");

		BlogPanel.stepPanel.clear();
		BlogPanel.stepPanel.add(getPanel());

		if (initTopicPanel) {

			BlogPanel.topicPanel.clear();
			BlogPanel.topicPanel.add(new TopicPanel(
					StartupStagesGlobalVariables.topics
							.get(TopicID.Assumptions)));
		}
	}

	public static AbsolutePanel getPanel() {

		AbsolutePanel absolutePanel = new AbsolutePanel();
		absolutePanel.setSize("610px", "480px");

		Image image = new Image(GWT.getModuleBaseURL()
				+ "startupstages/AssumptionsValidation.png");
		absolutePanel.add(image, 0, 0);

		absolutePanel.add(vpBuild(), 12, 150);

		absolutePanel.add(vpMeasure(), 162, 180);

		absolutePanel.add(vpLearn(), 312, 210);

		absolutePanel.add(vpAchieve(), 462, 250);

		HTML image_1 = new HTML("<a href=#><img src='" + GWT.getModuleBaseURL()
				+ "startupstages/arrow.png' border=0></a>");
		image_1.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {

				UniqueValue.initialize();
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
				.get(TopicID.Persona)));
		vpInner.add(new TopicAnchor(StartupStagesGlobalVariables.topics
				.get(TopicID.Scenarios)));

		return vpTopic;
	}

	private static VerticalPanel vpMeasure() {

		VerticalPanel vpTopic = BlogPanel.vpTopic();

		VerticalPanel vpInner = new VerticalPanel();
		vpInner.setSpacing(10);
		vpTopic.add(vpInner);

		HTML htmlmeasure = new HTML("<center><b>MEASURE</b></center>", true);
		vpInner.add(htmlmeasure);

		vpInner.add(new TopicAnchor(StartupStagesGlobalVariables.topics
				.get(TopicID.AssumptionRating)));

		return vpTopic;
	}

	private static VerticalPanel vpLearn() {

		VerticalPanel vpTopic = BlogPanel.vpTopic();

		VerticalPanel vpInner = new VerticalPanel();
		vpInner.setSpacing(10);
		vpTopic.add(vpInner);

		HTML htmllearn = new HTML("<center><b>LEARN</b></center>", true);
		vpInner.add(htmllearn);

		vpInner.add(new TopicAnchor(StartupStagesGlobalVariables.topics
				.get(TopicID.CustomerInterviews)));
		
		vpInner.add(new TopicAnchor(StartupStagesGlobalVariables.topics
				.get(TopicID.Negatives)));

		vpInner.add(new TopicAnchor(StartupStagesGlobalVariables.topics
				.get(TopicID.LeanUX)));

		vpInner.add(new TopicAnchor(StartupStagesGlobalVariables.topics
				.get(TopicID.Sketching)));

		vpInner.add(new TopicAnchor(StartupStagesGlobalVariables.topics
				.get(TopicID.PersonaPivot)));

		vpInner.add(new TopicAnchor(StartupStagesGlobalVariables.topics
				.get(TopicID.TargetProblemPivot)));

		return vpTopic;
	}

	private static VerticalPanel vpAchieve() {

		VerticalPanel vpTopic = BlogPanel.vpTopic();

		VerticalPanel vpInner = new VerticalPanel();
		vpInner.setSpacing(10);
		vpTopic.add(vpInner);

		HTML htmllearn = new HTML("<center><b>ACHIEVE</b></center>", true);
		vpInner.add(htmllearn);

		vpInner.add(new TopicAnchor(StartupStagesGlobalVariables.topics
				.get(TopicID.ChampionProblem)));

		return vpTopic;
	}

}
