package com.startupstages.client.about;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.startupstages.client.StartupStagesGlobalVariables;
import com.startupstages.client.utilities.UseTracking;

public class BlogIntroduction extends AbsolutePanel {

	public BlogIntroduction(final Image buttonStartBlog) {

		this.setSize("900px", "750px");

		HTML htmlIntroduction = new HTML(
				"<font size=5 color=navy><i><b>INTRODUCTION</b></i></font>",
				true);
		this.add(htmlIntroduction, 265, 20);

		HTML htmlWhatStageAre = new HTML(
				"<font size=6 color=#545464><i><b>What stage are you?</b></i></font>",
				true);
		this.add(htmlWhatStageAre, 55, 100);

		HTML htmlAhsMauryaDefined = new HTML(
				"<font size=3><a href=\"http://www.ashmaurya.com/\" target=_blank>Ash Maurya</a> "
						+ "defined in his book "
						+ "\"<a href=\"http://www.runningleanhq.com/\"  target=_blank>Running Lean</a>\" "
						+ "the major stages for a startup:</font>", true);
		this.add(htmlAhsMauryaDefined, 138, 170);

		Image image = new Image(GWT.getModuleBaseURL()
				+ "startupstages/StartupStages.jpg");
		this.add(image, 21, 210);

		HTML htmlTheXleanInteractive = new HTML(
				"<font size=3>The <img src=\""
						+ GWT.getModuleBaseURL()
						+ "startupstages/XLeanBiz.jpg\" width=\"60px\" height=\"30px\"> "
						+ "<b><i>Interactive Blog</i></b>  &nbsp;" +
						" is a step by step roadmap that will help you understand "
						+ "and identify yourself with the stages above,"
						+ "<br> in a way that you will be able to be compared with others "
						+ "and move forward towards the success!</font>", true);
		this.add(htmlTheXleanInteractive, 109, 450);

		this.add(getKnowMoreAnchor(buttonStartBlog), 109, 530);

		this.add(buttonStartBlog, 356, 543);
	}
	
	private Anchor getKnowMoreAnchor(final Image buttonStartBlog){
		
		Anchor htmlNewHtml = new Anchor("Know more...");
		htmlNewHtml.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				
				new UseTracking("com.startupstages.client.about.BlogIntroduction#KnowMore");

				StartupStagesGlobalVariables.blogPanel.clear();
				StartupStagesGlobalVariables.blogPanel.add(new AboutBlog(
						buttonStartBlog));
			}
		});
		
		
		return htmlNewHtml;
	}
}
