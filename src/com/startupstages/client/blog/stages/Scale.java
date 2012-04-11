package com.startupstages.client.blog.stages;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupstages.client.InitializeBlog;
import com.startupstages.client.blog.BlogPanel;
import com.startupstages.client.blog.StagesPanel;
import com.startupstages.client.blog.steps.Funding;
import com.startupstages.client.blog.steps.Scaling;
import com.startupstages.client.blog.topics.TopicPanel;
import com.startupstages.client.model.Topic;
import com.startupstages.client.utilities.UseTracking;

public class Scale {

	public static void initializeStage() {

		StagesPanel.unselectStagesTabs();
		StagesPanel.hpScale.setStyleName("backgroundColorWhite");

		BlogPanel.stagePanel.clear();
		BlogPanel.stagePanel.add(setPanel());
	}

	public static void initializeAll() {

		initializeStage();
		InitializeBlog.initializeStep(Funding.getPanel());
		TopicPanel.initializeTopic(Topic.TopicID.Scale);
	}

	public static HorizontalPanel setPanel() {

		HorizontalPanel hp = new HorizontalPanel();

		hp.setSpacing(10);

		hp.add(vpFunding());

		hp.add(vpScaling());

		return hp;
	}

	private static VerticalPanel vpFunding() {

		VerticalPanel vp = new VerticalPanel();
		vp.setSpacing(10);
		vp.setWidth("130px");
		vp.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		ClickHandler ideaClick = new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				new UseTracking(
						"com.startupstages.client.blog.stages.Scale#FundingLink");

				Funding.initialize();
			}
		};

		Anchor anchorIdea = new Anchor("<font size=3><b>Funding</b></font>",
				true);
		anchorIdea.addClickHandler(ideaClick);
		vp.add(anchorIdea);

		Image imgIdea = new Image(GWT.getModuleBaseURL()
				+ "startupstages/fundingIcon.jpg");
		imgIdea.setSize("50px", "50px");
		imgIdea.addClickHandler(ideaClick);
		vp.add(imgIdea);

		return vp;
	}

	private static VerticalPanel vpScaling() {

		VerticalPanel vp = new VerticalPanel();
		vp.setSpacing(10);
		vp.setWidth("130px");
		vp.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		ClickHandler ideaClick = new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				new UseTracking(
						"com.startupstages.client.blog.stages.Scale#ScaleLink");

				Scaling.initialize();
			}
		};

		Anchor anchorIdea = new Anchor("<font size=3><b>Scaling</b></font>",
				true);
		anchorIdea.addClickHandler(ideaClick);
		vp.add(anchorIdea);

		Image imgIdea = new Image(GWT.getModuleBaseURL()
				+ "startupstages/ScaleIcon.png");
		imgIdea.setSize("50px", "50px");
		imgIdea.addClickHandler(ideaClick);
		vp.add(imgIdea);

		return vp;
	}
}
