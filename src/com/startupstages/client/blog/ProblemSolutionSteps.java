package com.startupstages.client.blog;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ProblemSolutionSteps extends HorizontalPanel {

	public ProblemSolutionSteps() {

		this.setSpacing(10);

		this.add(vpIdea());

		this.add(vpProblem());

		this.add(vpSolution());

		this.add(vpBrand());

		this.add(new Label());

		this.add(vpFeature());
	}

	private VerticalPanel vpIdea() {

		VerticalPanel vpIdea = new VerticalPanel();
		vpIdea.setSpacing(10);
		vpIdea.setWidth("130px");
		vpIdea.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		ClickHandler ideaClick = new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				BlogPanel.stepPanel.clear();
				BlogPanel.stepPanel.add(new Ideation());
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

	private VerticalPanel vpProblem() {

		VerticalPanel vpProblem = new VerticalPanel();
		vpProblem.setSpacing(10);
		vpProblem.setWidth("130px");
		vpProblem.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		ClickHandler problemClick = new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				BlogPanel.stepPanel.clear();
				BlogPanel.stepPanel.add(new ProblemValidation());
			}
		};

		Anchor anchorProblem = new Anchor("<font size=3><b>Problem</b></font>",
				true);
		anchorProblem.addClickHandler(problemClick);
		vpProblem.add(anchorProblem);

		Image imgProblem = new Image(GWT.getModuleBaseURL()
				+ "startupstages/ProblemIcon.jpg");
		imgProblem.setSize("50px", "50px");
		imgProblem.addClickHandler(problemClick);
		vpProblem.add(imgProblem);

		return vpProblem;
	}

	private VerticalPanel vpSolution() {

		VerticalPanel vpSolution = new VerticalPanel();
		vpSolution.setSpacing(10);
		vpSolution.setWidth("130px");
		vpSolution.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		Anchor anchorSolution = new Anchor(
				"<font size=3><b>Solution</b></font>", true);
		vpSolution.add(anchorSolution);

		Image imgSolution = new Image(GWT.getModuleBaseURL()
				+ "startupstages/SolutionIcon.jpg");
		imgSolution.setSize("50px", "50px");
		vpSolution.add(imgSolution);

		return vpSolution;
	}

	private VerticalPanel vpBrand() {

		VerticalPanel vpBrand = new VerticalPanel();
		vpBrand.setSpacing(10);
		vpBrand.setWidth("130px");
		vpBrand.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		Anchor anchorBrand = new Anchor("<font size=3><b>Brand</b></font>",
				true);
		vpBrand.add(anchorBrand);

		Image imgBrand = new Image(GWT.getModuleBaseURL()
				+ "startupstages/TryButton.jpg");
		imgBrand.setSize("50px", "50px");
		vpBrand.add(imgBrand);

		return vpBrand;
	}

	private VerticalPanel vpFeature() {

		VerticalPanel vpFeature = new VerticalPanel();
		vpFeature.setSpacing(10);
		vpFeature.setWidth("130px");
		vpFeature.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		Anchor anchorFeature = new Anchor("<font size=3><b>Feature</b></font>",
				true);
		vpFeature.add(anchorFeature);

		Image imgFeature = new Image(GWT.getModuleBaseURL()
				+ "startupstages/target.jpg");
		imgFeature.setSize("50px", "50px");
		vpFeature.add(imgFeature);

		return vpFeature;
	}
}
