package by.it.kglushchenko.jd01_06;

public class TaskB2 {
    public static void main(String[] args) {

        StringBuilder sbText = new StringBuilder(Poem.text); // читаем текст
        String stringText = sbText.toString();               // загоняем текст в строку
        /*
        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]{4,}");
        Matcher matcher = pattern.matcher(dynText);
        while(matcher.find()){
            int index =  matcher.start();
            dynText.setCharAt(index+3, '#');
            int length = matcher.end()-matcher.start();
            if(length>=7){
                dynText.setCharAt(index+6, '#');
            }
        }
        System.out.println(dynText);
        */

        String[] sentences = stringText.trim().split("\n"); // разбивает текст на строки
        String[] edited; // отредактированные строки
        for(int i=0; i< sentences.length; i++){

        }

    }
}
