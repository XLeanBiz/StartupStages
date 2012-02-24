package com.startupstages.client.model;

public class Topic {

	public enum TopicID {
		VISION_STATEMENT, LEAN_CANVAS, PERSONA, TEAM, GOALS, TEAM_SIZE, MARKET_RESEARCH, SURVEYS, USES, PROBLEMS_RATES, PROBLEM_CAUSES, INTERVIEWS
	}

	private String topicName;

	private String topicDescription;

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
