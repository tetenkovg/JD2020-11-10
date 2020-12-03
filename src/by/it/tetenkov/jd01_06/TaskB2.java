package by.it.tetenkov.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB2 {
    public static void main(String[] args) {
        cutter(Poem.text);

    }

    private static void cutter(String text) {
        String rawtext = text
                .replace("...", " ")
                .replace("\"", " ")
                .replace(":", " ")
                .replace(",", " ")
                .replace("!", ".");


        String[] sentences = rawtext.split("\\.");

        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sentences[i].replaceAll("[^а-яА-ЯёЁ]+", " ").trim();
        }

        String temporary = "";

        for (int i = 0; i < sentences.length; i++) {
            for (int j = 0; j < sentences.length - 1; j++) {
                if (sentences[j].length() > sentences[j + 1].length()) {
                    temporary = sentences[j];
                    sentences[j] = sentences[j + 1];
                    sentences[j + 1] = temporary;
                }
            }
        }

        for (String sentence : sentences) {
            System.out.printf("%s\n", sentence);
        }

    }
}


