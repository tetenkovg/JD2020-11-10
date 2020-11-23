package by.it.plehanova.jd01_06;


import java.util.regex.Pattern;

public class TaskC1 {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("\n");
        String[] sentence = pattern.split(text);

        int maxLength = sentence[0].length();

        for (int i = 1; i < sentence.length; i++) {
            maxLength = Math.max(maxLength,sentence[i].length());
        }

    }
}
