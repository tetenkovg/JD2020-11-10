package by.it.arekhava.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    public static void main(String[] args) {
        StringBuilder dynText = new StringBuilder(Poem.text);
        Pattern pattern=Pattern.compile("[а-яА-ЯёЁ]{4,}");
        Matcher matcher= pattern.matcher(dynText);
}
