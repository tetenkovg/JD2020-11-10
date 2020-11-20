package by.it.arekhava.jd01_02;

import java.util.Scanner;

public class TaskC {

    public static int[][] step1(int n)
    {
        int[][] arr = new int[n][n];


        while (true) {

            boolean isN = false;
            boolean isNegativeN = false;

            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {

                    int randomNumber = (int)(Math.random()*(2*n+1))-n;

                    if (n == randomNumber)
                    {
                        isN = true;
                    }
                    if (-n == randomNumber)
                    {
                        isNegativeN = true;
                    }
                    arr[i][j] = randomNumber;
                }
            }
            if (isN && isNegativeN)
            {
                break;
            }
        }

        return arr;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner (System.in);
        int n = scan.nextInt();

        int[][] arr = step1(n);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
    }
    public static void step2(int[][] arr) {


        for (int i = 0; i < arr.length; i++) {
            {

                for (int j = 0; j < arr[i].length; j++) {
                    int sum = 0;
                    int counter = 0;

                    if (arr[i][j] > 0) {
                        sum += arr[i][j];
                        counter++;
                        if (counter == 2) {
                            break;
                        }
                    }
                }
            }
        }
    }

}
