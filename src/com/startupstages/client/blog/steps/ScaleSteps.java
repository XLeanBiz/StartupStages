package com.startupstages.client.blog.steps;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupstages.client.blog.BlogPanel;

public class ScaleSteps {

	public static void initialize() {

		BlogPanel.stagePanel.clear();
		BlogPanel.stagePanel.add(setPanel());

		Scaling.initialize();
	}

	public static HorizontalPanel setPanel() {

		HorizontalPanel hp = new HorizontalPanel();

		hp.setSpacing(10);

		hp.add(vpScale());

		return hp;
	}

	private static VerticalPanel vpScale() {

		VerticalPanel vp = new VerticalPanel();
		vp.setSpacing(10);
		vp.setWidth("130px");
		vp.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		ClickHandler ideaClick = new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

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
