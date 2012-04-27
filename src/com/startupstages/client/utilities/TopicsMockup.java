package com.startupstages.client.utilities;

import java.util.HashMap;
import java.util.Map;

import com.startupstages.client.model.Topic;

public class TopicsMockup {

	public static Map<Topic.TopicID, Topic> getTopics() {

		Map<Topic.TopicID, Topic> topics = new HashMap<Topic.TopicID, Topic>();

		Topic vision = new Topic();
		vision.setTopicName(FeatureNameGenerator
				.spacedName(Topic.TopicID.Vision.toString()));
		vision.setTopicDescription("From "
				+ "<a href=\"http://en.wikipedia.org/wiki/Vision_statement#Mission_statements_and_vision_statements/\" target=\"_blank\">"
				+ "Wikipedia</a>: <br>"
				+ "<blockquote><b>Vision</b>: outlines what the organization wants to be, or how it wants the world in which it operates to be"
				+ " (an \"idealised\" view of the world). It is a long-term view and concentrates on the future. "
				+ "It can be emotive and is a source of inspiration. For example, a charity working with the poor might"
				+ " have a vision statement which reads \"A World without Poverty.\"</blockquote>"
				+ "<br><br><br>"
				+ "<center>\"An <strong>idea</strong> is based on a perceived problem/solution possibility"
				+ " <br>while a <strong>vision</strong> is the change you want "
				+ "to bring into the world by realizing the idea to it's fullest potential.\""
				+ "<br>- <a href=\"http://www.ashmaurya.com/2010/05/there-is-an-i-in-vision/\""
				+ " target=\"_blank\">There is an \"I\" in Vision - Ash Maurya</a></center>");
		topics.put(Topic.TopicID.Vision, vision);

		Topic persona = new Topic();
		persona.setTopicName(FeatureNameGenerator
				.spacedName(Topic.TopicID.Persona.toString()));
		persona.setTopicDescription("From "
				+ "<a href=\"http://en.wikipedia.org/wiki/Persona_(marketing)\" target=\"_blank\">"
				+ "Wikipedia</a>: <br>"
				+ "<blockquote>In marketing and user-centered design, <b>personas</b> are fictional characters created to represent "
				+ "the different user types within a targeted demographic, attitude and/or behavior set that might "
				+ "use a site, brand or product in a similar way."
				+ "<br><br><a href=\"http://custdevday.com/pages/content/lean-ux/\" target=\"_blank\">See example here</a>. </blockquote>");
		topics.put(Topic.TopicID.Persona, persona);

		Topic leanCanvas = new Topic();
		leanCanvas.setTopicName(FeatureNameGenerator
				.spacedName(Topic.TopicID.BusinessCanvas.toString()));
		leanCanvas
				.setTopicDescription("<blockquote><a href=\"http://www.ashmaurya.com/2010/08/businessmodelcanvas/\" target=\"_blank\">"
						+ "\"How I Document my Business Model Hypotheses\" - Ash Maurya's Blog</a>"
						+ "<br><br>"
						+ "\"A single page business model.\" - <a href=\"http://leancanvas.com\""
						+ " target=\"_blank\">http://leancanvas.com</a></blockquote>");
		topics.put(Topic.TopicID.BusinessCanvas, leanCanvas);

		Topic team = new Topic();
		team.setTopicName(FeatureNameGenerator.spacedName(Topic.TopicID.Team
				.toString()));
		team.setTopicDescription("<blockquote>1 Marketing/Business +<br>"
				+ "1 Developer + <br>"
				+ "1 UI Designer <br>"
				+ "Mix men and women!"
				+ "<br><br>"
				+ "\"We believe diverse founding teams have proven to be more innovative, "
				+ "more profitable and more capital efficient and are thus uniquely posed to change the world with "
				+ "fresh business ideas and innovative business models.\""
				+ " <a href=\"http://www.founderlabs.org/about.html\" target=\"_blank\">Founder Labs</a>"
				+ "</blockquote>");
		topics.put(Topic.TopicID.Team, team);

		Topic goals = new Topic();
		goals.setTopicName(FeatureNameGenerator.spacedName(Topic.TopicID.Goals
				.toString()));
		goals.setTopicDescription("<blockquote>Write down with your team the goals for the next short period "
				+ "(some months from now) and for the next long period (a year from now).<br><br>"
				+ "Goal setting involves establishing specific, measurable, achievable, realistic and time-targeted."
				+ "<br> See <a href=\"http://en.wikipedia.org/wiki/SMART_criteria\" target=\"_blank\">SMARTER</a>."
				+ "</blockquote>");
		topics.put(Topic.TopicID.Goals, goals);

		Topic teamSize = new Topic();
		teamSize.setTopicName(FeatureNameGenerator
				.spacedName(Topic.TopicID.TeamSize.toString()));
		teamSize.setTopicDescription("<blockquote>The more people want to contribute in your team, the better your vision."
				+ "</blockquote>");
		topics.put(Topic.TopicID.TeamSize, teamSize);

		Topic marketResearch = new Topic();
		marketResearch.setTopicName(FeatureNameGenerator
				.spacedName(Topic.TopicID.MarketResearch.toString()));
		marketResearch
				.setTopicDescription("<blockquote>Know you market industry, its size and its competitors."
						+ "</blockquote>");
		topics.put(Topic.TopicID.MarketResearch, marketResearch);

		Topic surveys = new Topic();
		surveys.setTopicName(FeatureNameGenerator
				.spacedName(Topic.TopicID.Surveys.toString()));
		surveys.setTopicDescription("<blockquote><a href=\"http://surveymonkey.com\" target=\"_blank\">SurveyMonkey.com</a>"
				+ "</blockquote>");
		topics.put(Topic.TopicID.Surveys, surveys);

		Topic uses = new Topic();
		uses.setTopicName(FeatureNameGenerator
				.spacedName(Topic.TopicID.Scenarios.toString()));
		uses.setTopicDescription("<blockquote>Quickly sketch your problems.<br><br>"
				+ "<a href=\"http://custdevday.com/pages/content/lean-ux/\" target=\"_blank\">See example here</a>."
				+ "</blockquote>");
		topics.put(Topic.TopicID.Scenarios, uses);

		return topics;
	}
}
