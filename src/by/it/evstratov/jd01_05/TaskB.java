package by.it.evstratov.jd01_05;

import static java.lang.Math.*;

public class TaskB {

    public static void main(String[] args) {

        step1();
        step2();
    }

    private static void step1() {

        double y = 0;

        for (double a = 0; a <= 2; a += 0.2) {
            for (int x = 1; x <= 6; x++) {
                y += pow(7,a) - cos(x);
            }
            System.out.println(y);
        }



    }

    private static void step2(){

        for (double x = -5.5; x < 2; x = x + 0.5) {
            double alpha = 0;
            double beta = 0;
            if(x/2 > -2 && x/2 <= -1){
                beta = sin(x*x);
                alpha = log(abs(beta+2.74));
                System.out.println("alfa = "+alpha+", beta = "+beta);
            }else if(x/2 > -1 && x/2 < 0.2){
                beta = cos(x*x);
                alpha = log(abs(beta+2.74));
                System.out.println("alfa = "+alpha+", beta = "+beta);
            }else if(x/2 == 0.2){
                beta = 1/(tan(x*x));
                alpha = log(abs(beta+2.74));
                System.out.println("alfa = "+alpha+", beta = "+beta);
            }else {
                System.out.println("Вычисления не определены");
            }

        }

    }


}
