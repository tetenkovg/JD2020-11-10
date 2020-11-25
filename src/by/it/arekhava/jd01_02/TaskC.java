package by.it.arekhava.jd01_02;

import java.util.Scanner;

public class TaskC {

    public static int[][] step1(int n) {
        int[][] arr = new int[n][n];


        while (true) {

            boolean isN = false;
            boolean isNegativeN = false;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    int randomNumber = (int) (Math.random() * (2 * n + 1)) - n;

                    if (n == randomNumber) {
                        isN = true;
                    }
                    if (-n == randomNumber) {
                        isNegativeN = true;
                    }
                    arr[i][j] = randomNumber;
                }
            }
            if (isN && isNegativeN) {
                break;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[][] arr = step1(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int step2(int[][] arr) {
        int sum;
        int totalSum = 0;
        int count;
        int index;

        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr.length; j++) {   //перебираем строку массива
                if (arr[i][j] >= 0) {                     //и находим первое положительное число
                    count = 0;
                    index = ++j;
                    //проверяем есть ли второе положительное число
                    while (index < arr.length) {
                        if (arr[i][index] >= 0) {
                            count++;
                        }
                        index++;
                    }
                /* если второе положительное число есть - запускаем цикл для счёта суммы до тех пор
                  пока следующее число не будет положительным */
                    if (count > 0) {
                        while (j < arr.length) {
                            if (arr[i][j] < 0) {
                                sum += arr[i][j];
                            } else {
                                break;
                            }
                            j++;
                        }
                    }
                    break;
                }
            }
            System.out.println(sum);
            totalSum += sum;
        }
        return totalSum;
    }
}
