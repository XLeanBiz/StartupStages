package com.startupstages.client.blog.stages;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupstages.client.InitializeBlog;
import com.startupstages.client.blog.BlogPanel;
import com.startupstages.client.blog.StagesPanel;
import com.startupstages.client.blog.topics.TopicAnchor;
import com.startupstages.client.blog.topics.TopicPanel;
import com.startupstages.client.model.Topic;
import com.startupstages.client.model.Topic.TopicID;

public class ProductMarketFit {

	public static void initializeAll(boolean initTopic) {

		initializeStage();
		InitializeBlog.initializeStep(getPanel());

		if (initTopic) {

			TopicPanel.initializeTopic(Topic.TopicID.ProductMarketFit);
		}
	}

	public static void initializeStage() {

		StagesPanel.unselectStagesTabs();
		StagesPanel.hpProductMarketFit.setStyleName("backgroundColorWhite");
	}

	public static AbsolutePanel getPanel() {

		AbsolutePanel absolutePanel = new AbsolutePanel();
		absolutePanel.setSize("610px", "455px");

		Image image = new Image(GWT.getModuleBaseURL()
				+ "startupstages/ProductMarketFit.png");
		absolutePanel.add(image, 0, 0);

		absolutePanel.add(vpBuild(), 30, 130);

		absolutePanel.add(vpMeasure(), 230, 150);

		absolutePanel.add(vpLearn(), 430, 170);

		HTML image_1 = new HTML("<a href=#><img src='" + GWT.getModuleBaseURL()
				+ "startupstages/arrow.png' border=0></a>");
		image_1.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {

				Scale.initializeAll(true);
			}
		});
		absolutePanel.add(image_1, 480, 50);

		return absolutePanel;
	}

	private static VerticalPanel vpBuild() {

		VerticalPanel vpTopic = BlogPanel.vpTopic();

		VerticalPanel vpInner = new VerticalPanel();
		vpInner.setWidth("160px");
		vpInner.setSpacing(10);
		vpTopic.add(vpInner);

		HTML htmlBuild = new HTML("<center><b>BUILD</b></center>", true);
		vpInner.add(htmlBuild);

		vpInner.add(new TopicAnchor(TopicID.Features));
		vpInner.add(new TopicAnchor(TopicID.MVP));

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

		vpInner.add(new TopicAnchor(TopicID.Returns));
		vpInner.add(new TopicAnchor(TopicID.MustHaveScore));

		return vpTopic;
	}

	private static VerticalPanel vpLearn() {

		VerticalPanel vpTopic = BlogPanel.vpTopic();

		VerticalPanel vpInner = new VerticalPanel();
		vpInner.setWidth("160px");
		vpInner.setSpacing(10);
		vpTopic.add(vpInner);

		HTML htmllearn = new HTML("<center><b>LEARN</b></center>", true);
		vpInner.add(htmllearn);

		vpInner.add(new TopicAnchor(TopicID.CodeQuality));

		vpInner.add(new TopicAnchor(TopicID.AgileDevelopment));

		vpInner.add(new TopicAnchor(TopicID.Usability));

		vpInner.add(new TopicAnchor(TopicID.BusinessModel));

		return vpTopic;
	}
}
