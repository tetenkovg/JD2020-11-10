package by.it.evstratov.jd01_05;


import static by.it.evstratov.jd01_05.InOut.printArray;
import static java.lang.Math.*;

public class TaskC {

    public static void main(String[] args) {

        step1();

    }

    private static void step1() {

        int size = (int)(random()*21+20);
        double[] array = new double[size];
        double[] newArray;
        double a = (9 - 5.33) / (size - 1);
        int count = 0;
        int countColumns = 0;
        for (double x = 5.33; x <= 9; x = x + a) {
            array[count] = cbrt(x*x + 4.5);
            count++;
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 3.5){
                countColumns++;
            }
        }
        newArray = new double[countColumns];
        int countValueForNewArray = 0;
        double sumAllValueNewArray = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 3.5){
                newArray[countValueForNewArray] = array[i];
                countValueForNewArray++;
                sumAllValueNewArray += array[i];
            }
        }
        printArray(array, "V", 5);
        printArray(newArray, "V", 5);
        System.out.println("Среднее геометрическое = "+pow(sumAllValueNewArray, 1.0/countValueForNewArray));
    }


}
