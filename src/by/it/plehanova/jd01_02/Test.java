package by.it.plehanova.jd01_02;

public class Test {
    public static void main(String[] args) {
        double[] array = {3, 4, 6, 8, 9, 2, 5, 7};

        sort(array);

        for (double re : array) {
            System.out.print(re + "  ");
        }


    }

    static void sort(double[] array) {

        int left = 0;
        int right = array.length;
        mergeSort(array,left,right);


    }

    private static double[] mergeSort(double[] array, int left, int right) {

        if (array.length < 2) {
            return array;
        }
        left = 0;
        right = array.length;
        int average = array.length/ 2;

        double[] arr1 = new double[average];
        double[] arr2 = new double[array.length - arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = array[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = array[i + average];
        }
        mergeSort(arr1, left, right);
        mergeSort(arr2, left, right);

        array = merge(arr1, arr2);

        return array;
    }


    private static double[] merge(double[] part1, double[] part2) {
        int indexPart1 = 0;
        int indexPart2 = 0;

        double[] array = new double[part1.length + part2.length];

        for (int i = 0; i < array.length; i++) {
            System.out.println();
            if (indexPart1 == part1.length) {
                array[i] = part2[indexPart2];
                indexPart2++;

            } else if (indexPart2 == part2.length) {
                array[i] = part1[indexPart1];
                indexPart1++;

            } else if (part1[indexPart1] < part2[indexPart2]) {
                array[i] = part1[indexPart1];
                indexPart1++;

            } else {
                array[i] = part2[indexPart2];
                indexPart2++;
            }
        }
        return array;
    }
}
