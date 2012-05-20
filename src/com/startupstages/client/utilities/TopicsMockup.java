package com.startupstages.client.utilities;

import java.util.HashMap;
import java.util.Map;

import com.startupstages.client.model.Topic;

public class TopicsMockup {

	public static Map<Topic.TopicID, Topic> getTopics() {

		Map<Topic.TopicID, Topic> topics = new HashMap<Topic.TopicID, Topic>();

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
				.spacedName(Topic.TopicID.BusinessModel.toString()));
		leanCanvas
				.setTopicDescription("<blockquote><a href=\"http://www.ashmaurya.com/2010/08/businessmodelcanvas/\" target=\"_blank\">"
						+ "\"How I Document my Business Model Hypotheses\" - Ash Maurya's Blog</a>"
						+ "<br><br>"
						+ "\"A single page business model.\" - <a href=\"http://leancanvas.com\""
						+ " target=\"_blank\">http://leancanvas.com</a></blockquote>");
		topics.put(Topic.TopicID.BusinessModel, leanCanvas);

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

		Topic uses = new Topic();
		uses.setTopicName(FeatureNameGenerator
				.spacedName(Topic.TopicID.Problem.toString()));
		uses.setTopicDescription("<blockquote>Quickly sketch your problems.<br><br>"
				+ "<a href=\"http://custdevday.com/pages/content/lean-ux/\" target=\"_blank\">See example here</a>."
				+ "</blockquote>");
		topics.put(Topic.TopicID.Problem, uses);

		return topics;
	}
}
