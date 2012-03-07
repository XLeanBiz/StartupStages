package com.startupstages.client.blog.stages;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupstages.client.StartupStagesGlobalVariables;
import com.startupstages.client.blog.BlogPanel;
import com.startupstages.client.blog.steps.Enhancing;
import com.startupstages.client.blog.steps.Profiting;
import com.startupstages.client.blog.steps.Prototyping;
import com.startupstages.client.blog.topics.TopicPanel;
import com.startupstages.client.model.Topic.TopicID;
import com.startupstages.client.utilities.UseTracking;

public class ProductMarketFit {

	public static void initialize() {

		BlogPanel.stagePanel.clear();
		BlogPanel.stagePanel.add(setPanel());

		Prototyping.initialize(false);

		BlogPanel.topicPanel.clear();
		BlogPanel.topicPanel.add(new TopicPanel(
				StartupStagesGlobalVariables.topics
						.get(TopicID.ProductMarketFit)));
	}

	public static HorizontalPanel setPanel() {

		HorizontalPanel hp = new HorizontalPanel();

		hp.setSpacing(10);

		hp.add(vpPrototype());

		hp.add(vpEnhance());
		
		hp.add(vpProfiting());

		return hp;
	}

	private static VerticalPanel vpPrototype() {

		VerticalPanel vp = new VerticalPanel();
		vp.setSpacing(10);
		vp.setWidth("130px");
		vp.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		ClickHandler ideaClick = new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				new UseTracking(
						"com.startupstages.client.blog.stages.ProductMarketFit#PrototypeLink");

				Prototyping.initialize();
			}
		};

		Anchor anchorIdea = new Anchor("<font size=3><b>Prototype</b></font>",
				true);
		anchorIdea.addClickHandler(ideaClick);
		vp.add(anchorIdea);

		Image imgIdea = new Image(GWT.getModuleBaseURL()
				+ "startupstages/PrototypeIcon.png");
		imgIdea.setSize("50px", "50px");
		imgIdea.addClickHandler(ideaClick);
		vp.add(imgIdea);

		return vp;
	}

	private static VerticalPanel vpEnhance() {

		VerticalPanel vp = new VerticalPanel();
		vp.setSpacing(10);
		vp.setWidth("130px");
		vp.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		ClickHandler problemClick = new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				new UseTracking(
						"com.startupstages.client.blog.stages.ProductMarketFit#EnhanceLink");

				Enhancing.initialize();
			}
		};

		Anchor anchorProblem = new Anchor("<font size=3><b>Enhance</b></font>",
				true);
		anchorProblem.addClickHandler(problemClick);
		vp.add(anchorProblem);

		Image imgProblem = new Image(GWT.getModuleBaseURL()
				+ "startupstages/EnhanceIcon.png");
		imgProblem.setSize("50px", "50px");
		imgProblem.addClickHandler(problemClick);
		vp.add(imgProblem);

		return vp;
	}
	
	private static VerticalPanel vpProfiting() {

		VerticalPanel vp = new VerticalPanel();
		vp.setSpacing(10);
		vp.setWidth("130px");
		vp.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		ClickHandler ideaClick = new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				new UseTracking(
						"com.startupstages.client.blog.stages.Scale#ProfitingLink");

				Profiting.initialize();
			}
		};

		Anchor anchorIdea = new Anchor("<font size=3><b>Profit</b></font>",
				true);
		anchorIdea.addClickHandler(ideaClick);
		vp.add(anchorIdea);

		Image imgIdea = new Image(GWT.getModuleBaseURL()
				+ "startupstages/profitingIcon.png");
		imgIdea.setSize("50px", "50px");
		imgIdea.addClickHandler(ideaClick);
		vp.add(imgIdea);

		return vp;
	}

}
