/*******************************************************************************
 * File: ProblemValidation.java
 *
 * The use, disclosure, reproduction, modification, transfer, or transmittal of
 * this work for any purpose in any form or by any means without the written
 * permission of Citibank, N.A. is strictly prohibited.
 *
 * Copyright (c) 2012 Citibank, N.A. All rights reserved
 *
 ******************************************************************************/
package com.startupstages.client.blog;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ProblemValidation extends Composite {

    public ProblemValidation() {

        AbsolutePanel absolutePanel = new AbsolutePanel();
        initWidget(absolutePanel);
        absolutePanel.setSize("660px", "541px");

        Image image = new Image("images/problemValidation.png");
        absolutePanel.add(image, 0, 0);

        VerticalPanel verticalPanel_1 = new VerticalPanel();
        verticalPanel_1.setBorderWidth(1);
        absolutePanel.add(verticalPanel_1, 27, 265);
        verticalPanel_1.setSize("150px", "100px");

        VerticalPanel verticalPanel = new VerticalPanel();
        verticalPanel_1.add(verticalPanel);
        verticalPanel.setSpacing(10);

        HTML htmlBuild = new HTML("<b>BUILD:</b>", true);
        verticalPanel.add(htmlBuild);

        Hyperlink hprlnkVisionStatement = new Hyperlink("Uses (Lean UX)", false, "newHistoryToken");
        verticalPanel.add(hprlnkVisionStatement);

        VerticalPanel verticalPanel_2 = new VerticalPanel();
        verticalPanel_2.setBorderWidth(1);
        absolutePanel.add(verticalPanel_2, 245, 207);
        verticalPanel_2.setSize("126px", "154px");

        VerticalPanel verticalPanel_3 = new VerticalPanel();
        verticalPanel_3.setSpacing(10);
        verticalPanel_2.add(verticalPanel_3);

        HTML htmlmeasure = new HTML("<b>MEASURE:</b>", true);
        verticalPanel_3.add(htmlmeasure);

        Hyperlink hprlnkCauses = new Hyperlink("Causes", false, "newHistoryToken");
        verticalPanel_3.add(hprlnkCauses);

        VerticalPanel verticalPanel_4 = new VerticalPanel();
        verticalPanel_4.setBorderWidth(1);
        absolutePanel.add(verticalPanel_4, 485, 344);
        verticalPanel_4.setSize("150px", "100px");

        VerticalPanel verticalPanel_5 = new VerticalPanel();
        verticalPanel_5.setSpacing(10);
        verticalPanel_4.add(verticalPanel_5);

        HTML htmllearn = new HTML("<b>LEARN:</b>", true);
        verticalPanel_5.add(htmllearn);

        Hyperlink hprlnkMarketResearch = new Hyperlink("Interviews", false, "newHistoryToken");
        verticalPanel_5.add(hprlnkMarketResearch);
        
        Image image_1 = new Image("images/arrow.png");
        image_1.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                
                BlogPanel.stepPanel.clear();
                BlogPanel.stepPanel.add(new ProblemValidation());
            }
        });
        absolutePanel.add(image_1, 503, 237);
    }
}
