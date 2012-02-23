package com.startupstages.client.model;

import java.util.HashMap;
import java.util.Map;


public class TopicsMockup {

    public static Map<Topic.TopicID, Topic> getTopics() {

        Map<Topic.TopicID, Topic> topics = new HashMap<Topic.TopicID, Topic>();

        Topic vision = new Topic();
        vision.setTopicID(Topic.TopicID.VISION_STATEMENT);
        vision.setTopicName("Vision Statement");
        vision.setTopicDescription("From "
                + "<a href=\"http://en.wikipedia.org/wiki/Vision_statement#Mission_statements_and_vision_statements/\" target=\"_blank\">"
                + "Wikipedia</a>: <br>"
                + "<blockquote><b>Vision</b>: outlines what the organization wants to be, or how it wants the world in which it operates to be"
                + " (an \"idealised\" view of the world). It is a long-term view and concentrates on the future. "
                + "It can be emotive and is a source of inspiration. For example, a charity working with the poor might"
                + " have a vision statement which reads \"A World without Poverty.\"</blockquote>" + "<br><br><br>"
                + "<center>\"An <strong>idea</strong> is based on a perceived problem/solution possibility"
                + " <br>while a <strong>vision</strong> is the change you want "
                + "to bring into the world by realizing the idea to it's fullest potential.\""
                + "<br>- <a href=\"http://www.ashmaurya.com/2010/05/there-is-an-i-in-vision/\""
                + " target=\"_blank\">There is an \"I\" in Vision - Ash Maurya</a></center>");
        topics.put(Topic.TopicID.VISION_STATEMENT, vision);

        Topic persona = new Topic();
        persona.setTopicID(Topic.TopicID.PERSONA);
        persona.setTopicName("Persona (Lean UX)");
        persona.setTopicDescription("From "
                + "<a href=\"http://en.wikipedia.org/wiki/Persona_(marketing)\" target=\"_blank\">"
                + "Wikipedia</a>: <br>"
                + "<blockquote>In marketing and user-centered design, <b>personas</b> are fictional characters created to represent "
                + "the different user types within a targeted demographic, attitude and/or behavior set that might "
                + "use a site, brand or product in a similar way."
                + "<br><br><a href=\"http://custdevday.com/pages/content/lean-ux/\" target=\"_blank\">See example here</a>. </blockquote>");
        topics.put(Topic.TopicID.PERSONA, persona);

        Topic leanCanvas = new Topic();
        leanCanvas.setTopicID(Topic.TopicID.LEAN_CANVAS);
        leanCanvas.setTopicName("Lean Canvas");
        leanCanvas.setTopicDescription("<blockquote><a href=\"http://www.ashmaurya.com/2010/08/businessmodelcanvas/\" target=\"_blank\">"
                + "\"How I Document my Business Model Hypotheses\" - Ash Maurya's Blog</a>" + "<br><br>"
                + "\"A single page business model.\" - <a href=\"http://leancanvas.com\""
                + " target=\"_blank\">http://leancanvas.com</a></blockquote>");
        topics.put(Topic.TopicID.LEAN_CANVAS, leanCanvas);

        Topic team = new Topic();
        team.setTopicID(Topic.TopicID.TEAM);
        team.setTopicName("Team");
        team.setTopicDescription("<blockquote>1 Marketing/Business +<br>" + "1 Developer + <br>" + "1 UI Designer <br>"
                + "Mix men and women!" + "<br><br>"
                + "\"We believe diverse founding teams have proven to be more innovative, "
                + "more profitable and more capital efficient and are thus uniquely posed to change the world with "
                + "fresh business ideas and innovative business models.\""
                + " <a href=\"http://www.founderlabs.org/about.html\" target=\"_blank\">Founder Labs</a>" + "</blockquote>");
        topics.put(Topic.TopicID.TEAM, team);

        return topics;
    }
}
