package by.it.plehanova.jd01_06;

import java.util.Random;
import java.util.regex.Pattern;

public class TaskC2 {
    public static void main(String[] args) {

        long start;
        long finish;

        String[] original = Poem.text.split("[^а-яА-ЯёЁ]+");

        Random random = new Random();

        String generate = "";
        while (generate.length() < 1000) {
            int i = random.nextInt(original.length);
            generate = generate + " " + original[i];
        }
        start = System.nanoTime();
        String sentence1 = slow(generate);
        finish = System.nanoTime();
        System.out.println("time = " + (finish - start));
        System.out.println(sentence1);

        start = System.nanoTime();
        String sentence2 = fast(generate);
        finish = System.nanoTime();
        System.out.println("time = " + (finish - start));
        System.out.println(sentence2);


    }

    private static String slow(String text) {
        String[] words = text.split(" ");
        String gen1 = "";

        for (int i = 0; i < words.length; i++) {
            gen1 = gen1 + " " + words[i];
        }

        return gen1;
    }

    private static String fast(String text) {

        String[] words = text.split(" ");
        StringBuilder gen2 = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            gen2 = gen2.append(" ").append(words[i]);
        }
        String str = new String(gen2);

        return str;
    }
}
