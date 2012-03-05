package com.startupstages.client.blog;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.startupstages.client.blog.stages.ProblemSolutionFit;
import com.startupstages.client.blog.stages.ProductMarketFit;
import com.startupstages.client.blog.stages.Scale;

public class StagesPanel extends HorizontalPanel {

	public StagesPanel() {

		this.setSpacing(10);

		HTML problemSolutionFit = new HTML(
				"<font size=3><a href=#><b>Problem/Solution Fit</b></a></font>");
		problemSolutionFit.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				ProblemSolutionFit.initialize();
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

				ProductMarketFit.initialize();
			}
		});
		this.add(productMarketFit);

		this.add(new HTML(
				"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"));

		HTML scale = new HTML("<font size=3><a href=#><b>Scale</b></a></font>");
		scale.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				Scale.initialize();
			}
		});
		this.add(scale);
	}
}
