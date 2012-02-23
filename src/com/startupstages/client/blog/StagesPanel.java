package com.startupstages.client.blog;

import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;

public class StagesPanel extends HorizontalPanel {

    public StagesPanel() {

        this.setSpacing(10);

        HTML problemSolutionFit = new HTML("<font size=3 color=#4169e1><b>Problem/Solution Fit</b></font>");
        this.add(problemSolutionFit);

        this.add(new HTML("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"));

        Anchor productMarketFit = new Anchor("<font size=3 color=black><b>Product/Market Fit</b></font>", true);
        this.add(productMarketFit);

        this.add(new HTML("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"));

        Anchor scale = new Anchor("<font size=3 color=black><b>Scale</b></font>", true);
        this.add(scale);
    }
}
