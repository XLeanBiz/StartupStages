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
import com.startupstages.client.blog.steps.Referring;
import com.startupstages.client.blog.steps.Scaling;
import com.startupstages.client.blog.topics.TopicPanel;
import com.startupstages.client.model.Topic.TopicID;
import com.startupstages.client.utilities.UseTracking;

public class Scale {

	public static void initialize() {

		BlogPanel.stagePanel.clear();
		BlogPanel.stagePanel.add(setPanel());

		Scaling.initialize(false);

		BlogPanel.topicPanel.clear();
		BlogPanel.topicPanel.add(new TopicPanel(
				StartupStagesGlobalVariables.topics.get(TopicID.Scale)));
	}

	public static HorizontalPanel setPanel() {

		HorizontalPanel hp = new HorizontalPanel();

		hp.setSpacing(10);

		hp.add(vpReferring());

		hp.add(vpScaling());

		return hp;
	}

	private static VerticalPanel vpReferring() {

		VerticalPanel vp = new VerticalPanel();
		vp.setSpacing(10);
		vp.setWidth("130px");
		vp.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		ClickHandler ideaClick = new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				new UseTracking(
						"com.startupstages.client.blog.stages.Scale#ReferringLink");

				Referring.initialize();
			}
		};

		Anchor anchorIdea = new Anchor("<font size=3><b>Referring</b></font>",
				true);
		anchorIdea.addClickHandler(ideaClick);
		vp.add(anchorIdea);

		Image imgIdea = new Image(GWT.getModuleBaseURL()
				+ "startupstages/referringIcon.png");
		imgIdea.setSize("50px", "50px");
		imgIdea.addClickHandler(ideaClick);
		vp.add(imgIdea);

		return vp;
	}

	private static VerticalPanel vpScaling() {

		VerticalPanel vp = new VerticalPanel();
		vp.setSpacing(10);
		vp.setWidth("130px");
		vp.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		ClickHandler ideaClick = new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				new UseTracking(
						"com.startupstages.client.blog.stages.Scale#ScaleLink");

				Scaling.initialize();
			}
		};

		Anchor anchorIdea = new Anchor("<font size=3><b>Scaling</b></font>",
				true);
		anchorIdea.addClickHandler(ideaClick);
		vp.add(anchorIdea);

		Image imgIdea = new Image(GWT.getModuleBaseURL()
				+ "startupstages/ScaleIcon.png");
		imgIdea.setSize("50px", "50px");
		imgIdea.addClickHandler(ideaClick);
		vp.add(imgIdea);

		return vp;
	}
}
