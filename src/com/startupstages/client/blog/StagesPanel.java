package com.startupstages.client.blog;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.startupstages.client.blog.steps.ProblemSolutionFitSteps;
import com.startupstages.client.blog.steps.ProductMarketFitSteps;

public class StagesPanel extends HorizontalPanel {

	public StagesPanel() {

		this.setSpacing(10);

		HTML problemSolutionFit = new HTML(
				"<font size=3><a href=#><b>Problem/Solution Fit</b></a></font>");
		problemSolutionFit.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				ProblemSolutionFitSteps.initialize();
			}
		});
		this.add(problemSolutionFit);

		this.add(new HTML(
				"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"));

		HTML productMarketFit = new HTML(
				"<font size=3><a href=#><b>Product/Market Fit</b></a></font>");
		productMarketFit.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				ProductMarketFitSteps.initialize();
			}
		});
		this.add(productMarketFit);

		this.add(new HTML(
				"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"));

		HTML scale = new HTML("<font size=3><a href=#><b>Scale</b></a></font>");
		scale.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				ProblemSolutionFitSteps.initialize();
			}
		});
		this.add(scale);
	}
}
