package by.it.soldatenko.jd01_05;

import static java.lang.Math.*;

public class TaskCC {
    public static void main(String[] args) {
        Step2();
    }

    private static void Step2() {
        int[] arr = new int[31];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {//инициализация А
            arr[i] = (int) (round(random() * 347) + 103);
            if (arr[i] * 0.1 > i) {
//                System.out.print(arr[i] + " ");
                count = count + 1;
            }
        }
        int[] arr_10 = new int[count];// Инициализация В
        count = 0;
        for (int i = 0; i < 31; i++) {
            if (arr[i] * 0.1 > i) {
                arr_10[count] = arr[i];
                count = count + 1;
            }
        }

        int n = arr_10.length; // сортировка В
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++)
                if (arr_10[j] > arr_10[j + 1]) {
                    int temp = arr_10[j];
                    arr_10[j] = arr_10[j + 1];
                    arr_10[j + 1] = temp;
                }
        }
        //печать А
        System.out.print("╔"+"══════════"+"╦"+"══════════"+"╦"+"══════════"+"╦"+"══════════"+"╦"+"══════════"+"╗");
        System.out.println();
        for (int i = 0; i < 35; i++) {
            String name = "A";
            if(i<arr.length) {
                System.out.printf("║%s[%2d]=%-4d", name, i, arr[i]);
            }else System.out.print("║          ");

            if ((i + 1) % 5 == 0 || i + 1 == 35) {
                System.out.println("║");
                if (i <34) {
                    System.out.println("╠" + "══════════" + "╬" + "══════════" + "╬" + "══════════" + "╬" + "══════════" + "╬" + "══════════" + "╣");
                }
            }

        }
        System.out.println("╚"+"══════════"+"╩"+"══════════"+"╩"+"══════════"+"╩"+"══════════"+"╩"+"══════════"+"╝");


        // печать В
        String name = "B";
        double d = arr_10.length;
        int value = (int) ceil(d / 5);
        System.out.print("╔"+"══════════"+"╦"+"══════════"+"╦"+"══════════"+"╦"+"══════════"+"╦"+"══════════"+"╗");
        System.out.println();
        for (int i = 0; i < value; i++) {
            for (int k = 0; k < 25; k = k + 5) {
                if (i + k < arr_10.length) {
                    System.out.printf("║%s[%2d]=%-4d", name, i + k, arr_10[i + k]);
                } else {
                    System.out.print("║          ");
                    break;
                }
            }
            System.out.print("║");
            System.out.println();
            if (i<value-1) {
                System.out.println("╠" + "══════════" + "╬" + "══════════" + "╬" + "══════════" + "╬" + "══════════" + "╬" + "══════════" + "╣");
            }
        }
        System.out.println("╚"+"══════════"+"╩"+"══════════"+"╩"+"══════════"+"╩"+"══════════"+"╩"+"══════════"+"╝");

    }
}
