package com.startupstages.client.blog.steps;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupstages.client.StartupStagesGlobalVariables;
import com.startupstages.client.blog.BlogPanel;
import com.startupstages.client.blog.topics.TopicAnchor;
import com.startupstages.client.blog.topics.TopicPanel;
import com.startupstages.client.model.Topic.TopicID;

public class Scaling {

	public static void initialize() {

		BlogPanel.stepPanel.clear();
		BlogPanel.stepPanel.add(setPanel());

		BlogPanel.topicPanel.clear();
		BlogPanel.topicPanel.add(new TopicPanel(
				StartupStagesGlobalVariables.topics
						.get(TopicID.PaymentMethods)));
	}

	public static AbsolutePanel setPanel() {

		AbsolutePanel absolutePanel = new AbsolutePanel();
		absolutePanel.setSize("590px", "470px");

		Image image = new Image(GWT.getModuleBaseURL()
				+ "startupstages/Scaling.png");
		absolutePanel.add(image, 0, 0);

		absolutePanel.add(vpBuild(), 27, 255);

		absolutePanel.add(vpMeasure(), 230, 215);

		absolutePanel.add(vpLearn(), 410, 337);

		return absolutePanel;
	}

	private static VerticalPanel vpBuild() {

		VerticalPanel verticalPanel_1 = new VerticalPanel();
		verticalPanel_1.setBorderWidth(1);
		verticalPanel_1.setSize("150px", "150px");

		VerticalPanel verticalPanel = new VerticalPanel();
		verticalPanel_1.add(verticalPanel);
		verticalPanel.setSpacing(10);

		HTML htmlBuild = new HTML("<b>BUILD:</b>", true);
		verticalPanel.add(htmlBuild);

		verticalPanel.add(new TopicAnchor(StartupStagesGlobalVariables.topics
				.get(TopicID.PaymentMethods)));

		return verticalPanel_1;
	}

	private static VerticalPanel vpMeasure() {

		VerticalPanel verticalPanel_2 = new VerticalPanel();
		verticalPanel_2.setBorderWidth(1);
		verticalPanel_2.setSize("150px", "154px");

		VerticalPanel verticalPanel_3 = new VerticalPanel();
		verticalPanel_3.setSpacing(10);
		verticalPanel_2.add(verticalPanel_3);

		HTML htmlmeasure = new HTML("<b>MEASURE:</b>", true);
		verticalPanel_3.add(htmlmeasure);

		verticalPanel_3.add(new TopicAnchor(StartupStagesGlobalVariables.topics
				.get(TopicID.CostPerUser)));

		verticalPanel_3.add(new TopicAnchor(StartupStagesGlobalVariables.topics
				.get(TopicID.ConversionRate)));

		verticalPanel_3.add(new TopicAnchor(StartupStagesGlobalVariables.topics
				.get(TopicID.RevenuePerUser)));

		return verticalPanel_2;
	}

	private static VerticalPanel vpLearn() {

		VerticalPanel verticalPanel_4 = new VerticalPanel();
		verticalPanel_4.setBorderWidth(1);
		verticalPanel_4.setSize("150px", "100px");

		VerticalPanel verticalPanel_5 = new VerticalPanel();
		verticalPanel_5.setSpacing(10);
		verticalPanel_4.add(verticalPanel_5);

		HTML htmllearn = new HTML("<b>LEARN:</b>", true);
		verticalPanel_5.add(htmllearn);

		return verticalPanel_4;
	}

}
