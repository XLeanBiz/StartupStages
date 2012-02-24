package com.startupstages.server.topics;

import com.startupstages.server.URLUtilities;

public class SaveTopic {

    private static String saveTopicUrl = "http://jsonpfy.xleanbiz.appspot.com/SaveDataService";

    public static void save(final String topicName, final String topicDescription) {

        String parameters = "kind=Topic&filterField=" + topicName + "&filterValue=" + topicDescription;

        URLUtilities.fetchURLPost(saveTopicUrl, parameters);

    }
}
