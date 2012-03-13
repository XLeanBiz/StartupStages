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
import com.startupstages.client.blog.StagesPanel;
import com.startupstages.client.blog.steps.Assumptions;
import com.startupstages.client.blog.steps.Branding;
import com.startupstages.client.blog.steps.Ideation;
import com.startupstages.client.blog.steps.UniqueValue;
import com.startupstages.client.blog.topics.TopicPanel;
import com.startupstages.client.model.Topic.TopicID;
import com.startupstages.client.utilities.UseTracking;

public class ProblemSolutionFit {

	public static void initialize() {
		
		StagesPanel.unselectStagesTabs();
		StagesPanel.hpProblemSolutionFit.setStyleName("backgroundColorWhite");

		BlogPanel.stagePanel.clear();
		BlogPanel.stagePanel.add(setPanel());

		Assumptions.initialize(false);

		BlogPanel.topicPanel.clear();
		BlogPanel.topicPanel.add(new TopicPanel(
				StartupStagesGlobalVariables.topics
						.get(TopicID.ProblemSolutionFit)));
	}

	public static HorizontalPanel setPanel() {

		HorizontalPanel hp = new HorizontalPanel();

		hp.setSpacing(10);

		hp.add(vpAssumptions());

		hp.add(vpUniqueValue());
		
		hp.add(vpIdea());

		hp.add(vpBrand());

		return hp;
	}

	private static VerticalPanel vpIdea() {

		VerticalPanel vpIdea = new VerticalPanel();
		vpIdea.setSpacing(10);
		vpIdea.setWidth("130px");
		vpIdea.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		ClickHandler ideaClick = new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				new UseTracking(
						"com.startupstages.client.blog.stages.ProblemSolutionFit#IdeaLink");

				Ideation.initialize();
			}
		};

		Anchor anchorIdea = new Anchor("<font size=3><b>Idea</b></font>", true);
		anchorIdea.addClickHandler(ideaClick);
		vpIdea.add(anchorIdea);

		Image imgIdea = new Image(GWT.getModuleBaseURL()
				+ "startupstages/IdeaIcon.png");
		imgIdea.setSize("50px", "50px");
		imgIdea.addClickHandler(ideaClick);
		vpIdea.add(imgIdea);

		return vpIdea;
	}

	private static VerticalPanel vpAssumptions() {

		VerticalPanel vpProblem = new VerticalPanel();
		vpProblem.setSpacing(10);
		vpProblem.setWidth("130px");
		vpProblem.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		ClickHandler problemClick = new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				new UseTracking(
						"com.startupstages.client.blog.stages.ProblemSolutionFit#AssumptionLink");

				Assumptions.initialize();
			}
		};

		Anchor anchorProblem = new Anchor(
				"<font size=3><b>Assumptions</b></font>", true);
		anchorProblem.addClickHandler(problemClick);
		vpProblem.add(anchorProblem);

		Image imgProblem = new Image(GWT.getModuleBaseURL()
				+ "startupstages/ProblemIcon.jpg");
		imgProblem.setSize("50px", "50px");
		imgProblem.addClickHandler(problemClick);
		vpProblem.add(imgProblem);

		return vpProblem;
	}

	private static VerticalPanel vpUniqueValue() {

		VerticalPanel vpFeature = new VerticalPanel();
		vpFeature.setSpacing(10);
		vpFeature.setWidth("130px");
		vpFeature.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		ClickHandler stepClick = new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				new UseTracking(
						"com.startupstages.client.blog.stages.ProblemSolutionFit#UniqueValueLink");

				UniqueValue.initialize();
			}
		};

		Anchor anchorFeature = new Anchor(
				"<font size=3><b>Unique Value</b></font>", true);
		anchorFeature.addClickHandler(stepClick);
		vpFeature.add(anchorFeature);

		Image imgFeature = new Image(GWT.getModuleBaseURL()
				+ "startupstages/target.jpg");
		imgFeature.setSize("50px", "50px");
		imgFeature.addClickHandler(stepClick);
		vpFeature.add(imgFeature);

		return vpFeature;
	}

	private static VerticalPanel vpBrand() {

		VerticalPanel vpBrand = new VerticalPanel();
		vpBrand.setSpacing(10);
		vpBrand.setWidth("130px");
		vpBrand.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		ClickHandler stepClick = new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				new UseTracking(
						"com.startupstages.client.blog.stages.ProblemSolutionFit#BrandLink");

				Branding.initialize();
			}
		};

		Anchor anchorBrand = new Anchor("<font size=3><b>Brand</b></font>",
				true);
		anchorBrand.addClickHandler(stepClick);
		vpBrand.add(anchorBrand);

		Image imgBrand = new Image(GWT.getModuleBaseURL()
				+ "startupstages/TryButton.jpg");
		imgBrand.setSize("50px", "50px");
		imgBrand.addClickHandler(stepClick);
		vpBrand.add(imgBrand);

		return vpBrand;
	}

}
