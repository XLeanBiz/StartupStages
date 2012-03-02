package com.startupstages.client.about;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;

public class BlogIntroduction extends AbsolutePanel {

	public BlogIntroduction(Image buttonStartBlog) {

		this.setSize("900px", "750px");

		HTML htmlIntroduction = new HTML(
				"<font size=7 color=navy><i><b>INTRODUCTION</b></i></font>",
				true);
		this.add(htmlIntroduction, 265, 29);

		HTML htmlWhatStageAre = new HTML(
				"<font size=6 color=#545464><i><b>What stage are you?</b></i></font>",
				true);
		this.add(htmlWhatStageAre, 55, 151);

		HTML htmlAhsMauryaDefined = new HTML(
				"<font size=3><a href=\"http://www.ashmaurya.com/\" target=_blank>Ash Maurya</a> "
						+ "defined in his book "
						+ "\"<a href=\"http://www.runningleanhq.com/\"  target=_blank>Running Lean</a>\" "
						+ "the three major stages for a startup:</font>", true);
		this.add(htmlAhsMauryaDefined, 138, 220);

		Image image = new Image(GWT.getModuleBaseURL()
				+ "startupstages/StartupStages.jpg");
		this.add(image, 21, 260);

		HTML htmlTheXleanInteractive = new HTML(
				"<font size=3>The <img src=\""
						+ GWT.getModuleBaseURL()
						+ "startupstages/XLeanBiz.jpg\" width=\"60px\" height=\"30px\"> "
						+ "<b><i>Interactive Blog</i></b>  &nbsp; will help you understand "
						+ "and identify yourself with the stages above,"
						+ "<br> in a way that you will be able to compare yourself with others "
						+ "and move forward towards the success!</font>", true);
		this.add(htmlTheXleanInteractive, 109, 500);

		this.add(buttonStartBlog, 356, 593);

		Anchor htmlNewHtml = new Anchor("Know more...");
		htmlNewHtml.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				
			}
		});
		add(htmlNewHtml, 109, 560);
	}
}
