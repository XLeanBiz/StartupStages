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
	public static HorizontalPanel hpMaintenance = new HorizontalPanel();

	public StagesPanel() {

		this.setStyleName("backgroundColorGray");

		hpProblemSolutionFit.clear();
		hpProblemSolutionFit.setStyleName("backgroundColorWhite");
		hpProblemSolutionFit.setSpacing(10);
		hpProblemSolutionFit.setWidth("180px");
		hpProblemSolutionFit
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		HTML problemSolutionFit = new HTML(
				"<font size=3><a href=#><b>Problem/Solution Fit</b></a></font>");
		problemSolutionFit.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				new UseTracking(
						"com.startupstages.client.blog.StagesPanel#ProblemSolutionFitLink");

				unselectStagesTabs();
				hpProblemSolutionFit.setStyleName("backgroundColorWhite");

				ProblemSolutionFit.initialize();
			}
		});
		hpProblemSolutionFit.add(problemSolutionFit);
		this.add(hpProblemSolutionFit);

		hpProductMarketFit.clear();
		hpProductMarketFit.setSpacing(10);
		hpProductMarketFit.setWidth("180px");
		hpProductMarketFit
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		HTML productMarketFit = new HTML(
				"<font size=3><a href=#><b>Product/Market Fit</b></a></font>");
		productMarketFit.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				new UseTracking(
						"com.startupstages.client.blog.StagesPanel#ProductMarketFitLink");

				unselectStagesTabs();
				hpProductMarketFit.setStyleName("backgroundColorWhite");
				
				ProductMarketFit.initialize();
			}
		});
		hpProductMarketFit.add(productMarketFit);
		this.add(hpProductMarketFit);

		hpScale.clear();
		hpScale.setSpacing(10);
		hpScale.setWidth("90px");
		hpScale.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		HTML scale = new HTML("<font size=3><a href=#><b>Scale</b></a></font>");
		scale.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				new UseTracking(
						"com.startupstages.client.blog.StagesPanel#ScaleLink");

				unselectStagesTabs();
				hpScale.setStyleName("backgroundColorWhite");
				
				Scale.initialize();
			}
		});
		hpScale.add(scale);
		this.add(hpScale);

		hpMaintenance.clear();
		hpMaintenance.setSpacing(10);
		hpMaintenance.setWidth("110px");
		hpMaintenance
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		HTML maintenance = new HTML(
				"<font size=3><a href=#><b>Maintenance</b></a></font>");
		maintenance.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				new UseTracking(
						"com.startupstages.client.blog.StagesPanel#MaintenanceLink");

				unselectStagesTabs();
				hpMaintenance.setStyleName("backgroundColorWhite");
			}
		});
		hpMaintenance.add(maintenance);
		this.add(hpMaintenance);
	}

	public static void unselectStagesTabs() {

		hpProblemSolutionFit.setStyleName("backgroundColorGray");
		hpProductMarketFit.setStyleName("backgroundColorGray");
		hpScale.setStyleName("backgroundColorGray");
		hpMaintenance.setStyleName("backgroundColorGray");

	}
}
