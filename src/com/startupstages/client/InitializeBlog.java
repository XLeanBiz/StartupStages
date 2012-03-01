package com.startupstages.client;

import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupstages.client.blog.BlogPanel;
import com.startupstages.client.blog.steps.ProblemSolutionFitSteps;

public class InitializeBlog extends VerticalPanel {

	public InitializeBlog() {

		StartupStagesGlobalVariables.startTopics();

		this.add(new BlogPanel());

		ProblemSolutionFitSteps.initialize();
	}
}
