package com.startupstages.client.blog;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupstages.client.model.Topic;

public class BlogPanel extends VerticalPanel {

    public static Map<Topic.TopicID, Topic> topics = new HashMap<Topic.TopicID, Topic>();

    public static HorizontalPanel stagePanel = new HorizontalPanel();

    public static AbsolutePanel stepPanel = new AbsolutePanel();

    public static VerticalPanel topicPanel = new VerticalPanel();

    public BlogPanel() {

        this.setStyleName("stagePanel");

        this.setWidth("900px");

        this.add(new StagesPanel());

        this.add(new Label(" "));

        this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
        stagePanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
        stagePanel.setStyleName("stepsPanel");
        stagePanel.clear();
        this.add(stagePanel);
        stagePanel.add(new ProblemSolutionSteps());

        this.add(new Label(" "));
        this.add(new Label(" "));

        stepPanel.setStyleName("stepsPanel");
        stepPanel.setSize("100%", "100%");
        stepPanel.clear();
        this.add(stepPanel);
        stepPanel.add(new Ideation());

        topicPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
        topicPanel.setSize("900px", "100%");
        topicPanel.setStyleName("stepsPanel");
        topicPanel.clear();
        this.add(topicPanel);

    }
}
