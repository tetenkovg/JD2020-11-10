package by.it.terentyev.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB2 {
    public static void main(String[] args) {
        String sb = new String(Poem.text);
       sb = sb.replaceAll(" *[^а-яА-ЯёЁ \n]+ *"," ");
       sb = sb.trim();
        Pattern pattern = Pattern.compile(".{1,}\n");
        Matcher matcher = pattern.matcher(sb);
        while (matcher.find()){
            int start=matcher.start();
            int end =matcher.end();
            System.out.println(matcher.group()+ "ok");


        }
    }
}
