package by.it.plehanova.jd01_04;

/*С1. Повторите полностью в этом классе задание A2 (скопируйте в TaskC готовый
    метод static void buildOneDimArray(String line) и вызовите его из main, но
    сортировку переделайте (т.е. замените) из пузырьковой в более быструю
    сортировку слиянием с O-сложностью не выше, чем O(n log n).

      Метод для сортировки должен находиться в классе TaskC и иметь сигнатуру:
    static void mergeSort(double[ ] array)

     Подсказки: удобно предусмотреть также наличие второй копии этого метода для
    возможности рекурсивного вызова, например, с такой сигнатурой
    private static void mergeSort(double[ ] array, int left, int right)
    метод для слияния двух массивов разработайте самостоятельно, его сигнатура
    может быть, например, вот такой
    private static double[ ] merge(double[ ] part1, double[ ] part2)

    С2. Также при повторе задания A2 выполните вычисление новых (после
    сортировки) индексов первого и последнего элемента исходного массива с
    помощью собственного алгоритма двоичного (бинарного) поиска, который
    должен находиться в классе TaskC и иметь сигнатуру:
    static int binarySearch(double[ ] array, double value)
 */

import java.util.Arrays;
import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        buildOneDimArray(line);

    }

    static void buildOneDimArray(String line) {
        double[] array = InOut.getArray(line);
        InOut.printArray(array, "V", 5);

        double first = array[0];
        double last = array[array.length - 1];

        Helper.sort(array);

        InOut.printArray(array, "V", 4);

        int indexOfFirst = binarySearch(array, first);
        int indexOfLast = binarySearch(array, last);

        System.out.printf("Index of first element=%d\n", indexOfFirst);
        System.out.printf("Index of last element=%d\n", indexOfLast);
    }

    static int binarySearch(double[] array, double value) {

        int left = 0;
        int right = array.length - 1;
        int index = -1;
        int average;

        while (left <= right) {
            average = (left + right) / 2;
            if (value == array[average]) {
                index = average;
                break;
            } else if (value > array[average]) {
                left = average + 1;
            } else {
                right = average - 1;
            }
        }
        if (index == -1) {
            System.out.println("Элемент в массиве не найден");
        }
        return index;
    }


}
