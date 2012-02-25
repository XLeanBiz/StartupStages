package com.startupstages.client.utilities;

public class NameGenerator {

    /** Fill with spaces a name that is truncated. */
    public static String spacedName(String name) {

        String spacedName = name;

        if (name != null && name.length() > 0) {

            name = name.replaceAll("_", " ");
            String[] words = (name.substring(1)).split("[A-Z]");
            if (words.length > 0) {
                spacedName = name.substring(0, 1).toUpperCase() + words[0];
                int wordPosition = spacedName.length();
                for (int i = 1; i < words.length; i++) {
                    String firstLetter = name.substring(wordPosition, wordPosition + 1);
                    firstLetter = firstLetter.toUpperCase();
                    spacedName += " " + firstLetter + words[i];
                    wordPosition += (words[i].length() + 1);
                }
            }
            else {
                spacedName = name.toUpperCase();

            }

        }

        return spacedName;
    }
}
