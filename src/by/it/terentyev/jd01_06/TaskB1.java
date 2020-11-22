package by.it.terentyev.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("\\b[БВГДЖЗЙКЛМНПРСТФХЦЧШЩбвгджзйклмнпрстфхцчшщ]+[а-яА-ЯёЁ]{0,}[ауоыиэяюёе]+\\b");
        Matcher matcher=pattern.matcher(Poem.text);
        while (matcher.find()){
            int start=matcher.start();
            int end =matcher.end();
            char [] dst=new char[end-start];

            System.out.println(matcher.group());
            //System.out.println();
        }
    }
}
