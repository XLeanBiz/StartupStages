package com.startupstages.client.about;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;

public class AboutBlog extends AbsolutePanel {

	public AboutBlog(Image buttonStartBlog) {

		this.setSize("900px", "750px");

		HTML htmlTheXleanInteractive = new HTML(
				"<font size=3>The <img src=\""
						+ GWT.getModuleBaseURL()
						+ "startupstages/XLeanBiz.jpg\" width=\"60px\" height=\"30px\"> <b><i>Interactive Blog</i></b> "
						+ " &nbsp; is divided in three stages: Problem/Solution Fit, Product/Market Fit and Scale."
						+ "<br>Each stage is compost of a lot of steps. And each step has its topics.</font>",
				true);
		this.add(htmlTheXleanInteractive, 70, 40);

		HTML htmleachStageIs = new HTML(
				"<font size=3>All the topics of a startup step are inserted in a specific phase of the" +
				" <a href='http://theleanstartup.com/principles' target='_blank'>Build-Measure-Learn Loop</a> " +
				" from <a href='http://theleanstartup.com/principles' target='_blank'>Eric Ries</a> "
						+ "to guide the founder in his/her journey.</font>",
				true);
		add(htmleachStageIs, 70, 126);
		htmleachStageIs.setSize("759px", "35px");

		HTML htmlyouCanNavigate = new HTML(
				"<font size=3>You can navigate throw the stages and steps and click on any topic in the blog."
						+ "<br>When you click on a topic its description is shown.</font>",
				true);
		add(htmlyouCanNavigate, 70, 195);
		htmlyouCanNavigate.setSize("759px", "35px");

		HTML htmldontForgetTo = new HTML(
				"<font size=3><b>DON'T FORGET TO ADD YOUR COMMENTS !!!</b></font>",
				true);
		add(htmldontForgetTo, 262, 277);
		htmldontForgetTo.setSize("567px", "35px");

		HTML htmlthisBlogAlso = new HTML(
				"<font size=3>This blog also works as a WIKI. You can add information to any topic description clicking"
						+ " on the editor icon. Feel free to contribute with your knowledge. Our startup community appreciates it!</font>",
				true);
		add(htmlthisBlogAlso, 70, 339);
		htmlthisBlogAlso.setSize("759px", "35px");

		this.add(buttonStartBlog, 356, 453);

	}
}
