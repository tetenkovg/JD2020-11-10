package by.it.kglushchenko.Test;

public class Mytest {
    public static void main(String[] args) {
        int[][] a1 = new int[5][2];// двумерный массив с 5 строками
        a1[0] = new int[1];
        a1[1] = new int[2];
        a1[2] = new int[3];
        a1[3] = new int[4];
        a1[4] = new int[5];
        int[][] matrixA = new int[2][3];
        matrixA[0][0] = 1;
        matrixA[0][1] = -2;
        matrixA[0][2] = 3;
        matrixA[1][0] = 4;
        matrixA[1][1] = 1;
        matrixA[1][2] = 7;

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }
        //
        System.out.println();
        /*
        System.out.println(matrixA.length);
        System.out.println(matrixA[0].length);
        System.out.println(a1[3].length);*/
        //

        for (int j = 0; j < matrixA[0].length; j++) {
            for (int i = matrixA.length-1; i >=0; i--) {
                //for (int j = 0; j < matrixA[0].length; j++) {

                System.out.print(matrixA[i][j] + " ");
                //}
                //System.out.println();
            }
            System.out.println();
        }
    }
}
