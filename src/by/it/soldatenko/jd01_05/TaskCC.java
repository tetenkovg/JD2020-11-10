package by.it.soldatenko.jd01_05;

import static java.lang.Math.*;

public class TaskCC {
    public static void main(String[] args) {
        Step2();
    }

    private static void Step2() {
        int[] arr = new int[31];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (round(random() * 347) + 103);
            if (arr[i] * 0.1 > i) {
//                System.out.print(arr[i] + " ");
                count = count + 1;
            }
        }
        System.out.println(count);
        int[] arr_10 = new int[count];
        count = 0;
        for (int i = 0; i < 31; i++) {
            if (arr[i] * 0.1 > i) {
                arr_10[count] = arr[i];

//                System.out.print(arr_10[count] + " ");
                count = count + 1;
            }
        }

        int n = arr_10.length; // сортировка
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++)
                if (arr_10[j] > arr_10[j + 1]) {
                    int temp = arr_10[j];
                    arr_10[j] = arr_10[j + 1];
                    arr_10[j + 1] = temp;
                }
        }

        for (int i = 0; i < 31; i++) {//печать А
            String name = "A";
            System.out.printf("%s[%2d]=%-8d", name, i, arr[i]);
            if ((i + 1) % 5 == 0 || i + 1 == 31) {
                System.out.println();
            }
        }
        // печать В
        String name = "B";
        double d = arr_10.length;
        int value = (int) ceil(d / 5);
        for (int i = 0; i < value; i++) {
            for (int k = 0; k < 25; k = k + 5) {
                if (i + k < arr_10.length) {
                    System.out.printf("%s[%2d]=%-8d", name, i + k, arr_10[i + k]);
                } else break;
            }
            System.out.println();


        }
    }
}
