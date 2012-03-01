package com.startupstages.client.blog.topics;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RichTextArea;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupstages.client.model.Topic;
import com.startupstages.client.utilities.RichTextToolbar;

public class TopicEdit extends VerticalPanel {

	private static RichTextArea area = new RichTextArea();

	public TopicEdit(final Topic topic) {

		this.setSpacing(20);
		this.setWidth("900px");
		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		HTML htmlName = new HTML("<font size=6 color=orange><b>"
				+ topic.getTopicName() + "</b></font>", true);
		add(htmlName);
		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);

		HTML htmlReferences = new HTML(
				"<font size=4><b>References:</b></font>", true);
		add(htmlReferences);
		this.setSpacing(30);
		VerticalPanel vp = new VerticalPanel();

		area.setHTML(topic.getTopicDescription());
		area.setSize("100%", "500px");

		RichTextToolbar toolbar = new RichTextToolbar(area);
		toolbar.setWidth("100%");
		vp.add(toolbar);
		vp.add(area);
		this.add(vp);
		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		this.add(buttonSave(topic));
		Label label = new Label(" ");
		add(label);
	}

	private Button buttonSave(final Topic topic) {
		Button button = new Button("Save", new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {

				topic.setTopicDescription(area.getHTML());

				SaveTopic.save(topic);
			}
		});
		return button;
	}
}
