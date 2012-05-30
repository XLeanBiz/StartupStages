package com.startupstages.client.blog;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.startupstages.client.blog.stages.ProblemSolutionFit;
import com.startupstages.client.blog.stages.ProductMarketFit;
import com.startupstages.client.blog.stages.Scale;
import com.startupstages.client.utilities.UseTracking;

public class StagesPanel extends HorizontalPanel {

	public static HorizontalPanel hpProblemSolutionFit = new HorizontalPanel();
	public static HorizontalPanel hpProductMarketFit = new HorizontalPanel();
	public static HorizontalPanel hpScale = new HorizontalPanel();

	public StagesPanel() {

		this.setStyleName("backgroundColorGray");

		setProblemSolutionPanel();
		this.add(hpProblemSolutionFit);

		setProductMarketPanel();
		this.add(hpProductMarketFit);

		setScalePanel();
		this.add(hpScale);
	}

	public static void unselectStagesTabs() {

		hpProblemSolutionFit.setStyleName("backgroundColorGray");
		hpProductMarketFit.setStyleName("backgroundColorGray");
		hpScale.setStyleName("backgroundColorGray");

	}

	private void setProblemSolutionPanel() {

		hpProblemSolutionFit.clear();
		hpProblemSolutionFit.setStyleName("backgroundColorWhite");
		hpProblemSolutionFit.setSpacing(10);
		hpProblemSolutionFit.setWidth("190px");
		hpProblemSolutionFit
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		HTML problemSolutionFit = new HTML(
				"<font size=3><a href=#><b>Problem/Solution Fit</b></a></font>");
		problemSolutionFit.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				setClickProblemSolutionStage();
			}
		});
		hpProblemSolutionFit.add(problemSolutionFit);
	}

	private void setClickProblemSolutionStage() {

		new UseTracking(
				"com.startupstages.client.blog.StagesPanel#ProblemSolutionFitLink");

		unselectStagesTabs();
		hpProblemSolutionFit.setStyleName("backgroundColorWhite");

		ProblemSolutionFit.initializeAll(true);
	}

	private void setProductMarketPanel() {

		hpProductMarketFit.clear();
		hpProductMarketFit.setSpacing(10);
		hpProductMarketFit.setWidth("190px");
		hpProductMarketFit
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		HTML productMarketFit = new HTML(
				"<font size=3><a href=#><b>Product/Market Fit</b></a></font>");
		productMarketFit.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				setClickProductMarketStage();
			}
		});
		hpProductMarketFit.add(productMarketFit);
	}

	private void setClickProductMarketStage() {

		new UseTracking(
				"com.startupstages.client.blog.StagesPanel#ProductMarketFitLink");

		unselectStagesTabs();
		hpProductMarketFit.setStyleName("backgroundColorWhite");

		ProductMarketFit.initializeAll(true);
	}

	private void setScalePanel() {

		hpScale.clear();
		hpScale.setSpacing(10);
		hpScale.setWidth("110px");
		hpScale.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		HTML scale = new HTML("<font size=3><a href=#><b>Scale</b></a></font>");
		scale.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				setClickScaleStage();
			}
		});
		hpScale.add(scale);
	}

	private void setClickScaleStage() {

		new UseTracking("com.startupstages.client.blog.StagesPanel#ScaleLink");

		unselectStagesTabs();
		hpScale.setStyleName("backgroundColorWhite");

		Scale.initializeAll(true);
	}

}
