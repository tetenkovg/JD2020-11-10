package by.it.leshchenko.jd01_05;

import static java.lang.Math.cbrt;

public class TaskC {
    public static void main(String[] args) {
        Task6();
    }

    private static void Task6() {
        int n = (int) (Math.random() * (20 + 1)) + 20; // 20-40 элементов
        double[] arrayA = new double[n];
        double start = 5.33;
        double stop = 9;
        double step = (stop - start) / (n - 1);
        for (int i = 0; i < n; i++) {
            arrayA[i] = cbrt(start * start + 4.5);
            start += step;
        }
        System.out.println("Массив A[]");
        for (int i = 0, l = arrayA.length; i < l; i++) {
            System.out.printf("A[%3d] = %f    ", i, arrayA[i]);
            if ((i + 1) % 5 == 0 || i == l - 1) {
                System.out.println();
            }
        }
        System.out.println();

        int count = 0;
        for (double v : arrayA) {
            if (3.5 < v) {
                count++;
            }
        }
        double[] arrayB = new double[count];
        count = 0;
        for (double v : arrayA) {
            if (3.5 < v) {
                arrayB[count] = v;
                count++;
            }
        }
        System.out.println("Массив B[] из элементов массива A > 3.5");
        for (int i = 0, l = arrayB.length; i < l; i++) {
            System.out.printf("B[%3d] = %f    ", i, arrayB[i]);
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
    }
}
