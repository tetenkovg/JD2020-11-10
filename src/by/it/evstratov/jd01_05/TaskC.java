package by.it.evstratov.jd01_05;


import java.util.ArrayList;
import java.util.Arrays;

import static by.it.evstratov.jd01_05.InOut.printArray;
import static java.lang.Math.*;

public class TaskC {

    public static void main(String[] args) {

        //step1();
        step2();

    }

    static void printArrayWithGraphicsRow(double[] array, String name, int countColumns){

        for (int i = 0; i < array.length; i++) {
            String cell = String.format("║%s[%- 3d]=%-4f", name,i, array[i]);
            int countEmptyCells = countColumns * ((int) ceil((double)array.length / (double)countColumns)) ; //проработать
            System.out.println(countEmptyCells);
            if(i == 0){
                System.out.print("╔");
                for (int j = 0; j < countColumns; j++) {
                    for (int k = 0; k < cell.length()-1; k++) {
                        System.out.print("═");
                    }
                    if(countColumns - j != 1){
                        System.out.print("╦");
                    }
                }
                System.out.print("╗\n");
            }

            System.out.print(cell);
            if(i+1 == array.length){
                System.out.print("║");
                for (int j = 0; j < countEmptyCells; j++) { //получить количество пустых ячеек в последней строке
                    for (int k = 0; k < cell.length()-1; k++) {
                        System.out.print(" ");
                    }
                    System.out.print("║");
                }
            }

            if( (i+1) % countColumns == 0 && i+1 != array.length){
                System.out.print("║\n╠");
                for (int j = 0; j < countColumns; j++) {
                    for (int k = 0; k < cell.length()-1; k++) {
                        System.out.print("═");
                    }
                    if(countColumns - j != 1){
                        System.out.print("╬");
                    }
                }
                System.out.print("╣\n");
            }else if(i + 1 == array.length){
                System.out.print("\n╚");
                for (int j = 0; j < countColumns; j++) {
                    for (int k = 0; k < cell.length()-1; k++) {
                        System.out.print("═");
                    }
                    if(countColumns - j != 1){
                        System.out.print("╩");
                    }
                }
                System.out.print("╝\n");
            }

        }

    }

    static void printArrayWithGraphicsCol(double[] array, String name, int countColumns){

        int stepOnRow = 0;
        double step =  ceil((double) array.length / (double) countColumns);
        int countEmptyCells = array.length - countColumns*(array.length/countColumns); //проработать
        System.out.println(countEmptyCells);
        for (int i = 0; i < array.length; i++) {
            String cell;
            if(i+stepOnRow > array.length-1){
                cell = "";
            }else{
                cell = String.format("║%s[%- 3d]=%-4f", name,i+stepOnRow, array[i+stepOnRow]);
            }

            if(i == 0){
                System.out.print("╔");
                for (int j = 0; j < countColumns; j++) {
                    for (int k = 0; k < cell.length()-1; k++) {
                        System.out.print("═");
                    }
                    if(countColumns - j != 1){
                        System.out.print("╦");
                    }
                }
                System.out.print("╗\n");
            }

            System.out.print(cell);
            stepOnRow += step;

            if(i+1 == array.length){
                System.out.print("║");
                for (int j = 0; j < countEmptyCells; j++) { //получить количество пустых ячеек в последней строке
                    for (int k = 0; k < cell.length()-1; k++) {
                        System.out.print(" ");
                    }
                    System.out.print("║");
                }
            }

            if( (i+1) % countColumns == 0 && i+1 != array.length){
                stepOnRow = 0;
                System.out.print("║\n╠");
                for (int j = 0; j < countColumns; j++) {
                    for (int k = 0; k < cell.length()-1; k++) {
                        System.out.print("═");
                    }
                    if(countColumns - j != 1){
                        System.out.print("╬");
                    }
                }
                System.out.print("╣\n");
            }else if(i + 1 == array.length){
                System.out.print("\n╚");
                for (int j = 0; j < countColumns; j++) {
                    for (int k = 0; k < cell.length()-1; k++) {
                        System.out.print("═");
                    }
                    if(countColumns - j != 1){
                        System.out.print("╩");
                    }
                }
                System.out.print("╝\n");
            }

        }

    }

    private static void step2() {

        double[] arrayA = new double[31];
        double[] arrayB;
        int sizeArrayB = 0;

        //Заполняем массив arrayA и узнаем размер массива arrayB

        for (int i = 0; i < arrayA.length; i++) {
            int random = (int)(random()*(347+1)) + 103;
            double value = random * 0.1;
            arrayA[i] =  random;
            if(value > i){
                sizeArrayB++;
            }
        }

        //Инициализируем массив arrayB и заполняем его

        arrayB = new double[sizeArrayB];
        int countArrayB = 0;
        for (int i = 0; i < arrayA.length; i++) {
            double value = arrayA[i]*0.1;
            if(value > i){
                arrayB[countArrayB] = ceil(value*10)/10;
                countArrayB++;
            }
        }
        Arrays.sort(arrayB); //Сортировка по возрастанию массива arrayB
        printArrayWithGraphicsRow(arrayA, "A", 5);
        printArrayWithGraphicsCol(arrayB, "B", 2);

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
