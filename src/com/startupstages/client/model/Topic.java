package com.startupstages.client.model;

public class Topic {

    public enum TopicID {
        VISION_STATEMENT, LEAN_CANVAS, PERSONA, TEAM, GOALS
    }

    private TopicID topicID;

    private String topicName;

    private String topicDescription;

    public TopicID getTopicID() {
        return topicID;
    }

    public void setTopicID(TopicID topicID) {
        this.topicID = topicID;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicDescription() {
        return topicDescription;
    }

    public void setTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
    }

}
