package by.it.kglushchenko.jd01_06;

import java.lang.String;
import java.util.Arrays;

public class TaskB1 {

    public static void main(String[] args) {

        StringBuilder sbText = new StringBuilder(Poem.text); // читаем текст
        String stringText = sbText.toString();               // загоняем текст в строку


        /*
        char[] chars = stringText.toCharArray();
        // Убираем , . - : !
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ',' || chars[i] == '.' || chars[i] == '-' ||
                    chars[i] == ':' || chars[i] == '!') {
                chars[i] = ' ';
            }
        }
        */

        // Создаем строку из слов и пробелов
        //String stringTextClear = Arrays.toString(chars);

        // Создаем массив слов
        String[] words1 = stringText.split(" ");
        String[] words2 = new String[words1.length]; // убераем , . - : !


        // Выводим список слов по очереди
        for (int i = 0; i < words1.length; i++) {
            System.out.println(words1[i]);
        }

        // Удаляем из строк слов лишние элементы
        for (int i = 0; i < words1.length; i++) {
            //words2[i] = words1[i].split('.');
        }

        /*
        String[] sentences = stringTextClear.trim().split("\n"); // разбивает текст на строки
        // Разбиваем строки на

        for (int i = 0; i < sentences.length; i++) {
            //String[] words = sentences[i].trim().split(" ");
            char[] ch = sentences[i];
        }

        //String[] word; // массив отдельных строк
        */
    }


    private static void comparator(String word) {
        char[] s = {'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};
        char[] g = {'а', 'о', 'у', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е'};
        String lowerCase = word.toLowerCase();
        char start = lowerCase.charAt(0);
        char end = lowerCase.charAt(word.length() - 1);
        for (int i = 0; i < g.length; i++) {
            if (start == g[i]) {
                for (int j = 0; j < g.length; j++) {
                    if (end == g[j]) {
                        System.out.println(word);
                    }
                }
            }
        }
    }


}
