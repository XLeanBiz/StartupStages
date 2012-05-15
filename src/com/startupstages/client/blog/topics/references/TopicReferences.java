package com.startupstages.client.blog.topics.references;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupstages.client.blog.topics.references.edit.EditReferenceIcon;
import com.startupstages.client.model.Topic;

public class TopicReferences extends VerticalPanel {

	public TopicReferences(final Topic topic) {

		this.setSpacing(10);
		this.setWidth("100%");

		HorizontalPanel hp = new HorizontalPanel();
		hp.setWidth("100%");

		HTML htmlReferences = new HTML("<font size=4><b>References</b></font>",
				true);
		hp.add(htmlReferences);

		hp.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);
		hp.add(new EditReferenceIcon(topic));

		this.add(hp);

		if (topic.getTopicDescription() != null) {

			HTML htmlDescription = new HTML(topic.getTopicDescription(), true);
			this.add(htmlDescription);

		}
	}

}
