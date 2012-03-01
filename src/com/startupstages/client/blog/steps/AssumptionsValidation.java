package com.startupstages.client.blog.steps;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupstages.client.StartupStagesGlobalVariables;
import com.startupstages.client.blog.BlogPanel;
import com.startupstages.client.blog.topics.TopicAnchor;
import com.startupstages.client.blog.topics.TopicPanel;
import com.startupstages.client.model.Topic.TopicID;

public class AssumptionsValidation {

    public static void initialize() {

        BlogPanel.stepPanel.clear();
        BlogPanel.stepPanel.add(getPanel());

        BlogPanel.topicPanel.clear();
        BlogPanel.topicPanel.add(new TopicPanel(StartupStagesGlobalVariables.topics.get(TopicID.Uses)));
    }

    public static AbsolutePanel getPanel() {

        AbsolutePanel absolutePanel = new AbsolutePanel();
        absolutePanel.setSize("700px", "500px");

        Image image = new Image(GWT.getModuleBaseURL() + "startupstages/AssumptionsValidation.png");
        absolutePanel.add(image, 0, 24);

        absolutePanel.add(vpBuild(), 27, 265);

        absolutePanel.add(vpMeasure(), 245, 226);

        absolutePanel.add(vpLearn(), 485, 344);

        Image image_1 = new Image(GWT.getModuleBaseURL() + "startupstages/arrow.png");
        image_1.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {

                UniqueValueIdentification.initialize();
            }
        });
        absolutePanel.add(image_1, 503, 237);

        return absolutePanel;
    }

    private static VerticalPanel vpBuild() {

        VerticalPanel verticalPanel_1 = new VerticalPanel();
        verticalPanel_1.setBorderWidth(1);
        verticalPanel_1.setSize("150px", "100px");

        VerticalPanel verticalPanel = new VerticalPanel();
        verticalPanel_1.add(verticalPanel);
        verticalPanel.setSpacing(10);

        HTML htmlBuild = new HTML("<b>BUILD:</b>", true);
        verticalPanel.add(htmlBuild);

        verticalPanel.add(new TopicAnchor(StartupStagesGlobalVariables.topics.get(TopicID.Uses)));

        return verticalPanel_1;
    }

    private static VerticalPanel vpMeasure() {

        VerticalPanel verticalPanel_2 = new VerticalPanel();
        verticalPanel_2.setBorderWidth(1);
        verticalPanel_2.setSize("126px", "154px");

        VerticalPanel verticalPanel_3 = new VerticalPanel();
        verticalPanel_3.setSpacing(10);
        verticalPanel_2.add(verticalPanel_3);

        HTML htmlmeasure = new HTML("<b>MEASURE:</b>", true);
        verticalPanel_3.add(htmlmeasure);

        verticalPanel_3.add(new TopicAnchor(StartupStagesGlobalVariables.topics.get(TopicID.UsesRate)));

        return verticalPanel_2;
    }

    private static VerticalPanel vpLearn() {

        VerticalPanel verticalPanel_4 = new VerticalPanel();
        verticalPanel_4.setBorderWidth(1);
        verticalPanel_4.setSize("150px", "100px");

        VerticalPanel verticalPanel_5 = new VerticalPanel();
        verticalPanel_5.setSpacing(10);
        verticalPanel_4.add(verticalPanel_5);

        HTML htmllearn = new HTML("<b>LEARN:</b>", true);
        verticalPanel_5.add(htmllearn);

        verticalPanel_5.add(new TopicAnchor(StartupStagesGlobalVariables.topics.get(TopicID.Interviews)));
        verticalPanel_5.add(new TopicAnchor(StartupStagesGlobalVariables.topics.get(TopicID.LeanCanvas)));        

        return verticalPanel_4;
    }

}
