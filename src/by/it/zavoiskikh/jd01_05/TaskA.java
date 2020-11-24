package by.it.zavoiskikh.jd01_05;

import java.lang.Math.*;

public class TaskA {

    public static void main(String[] args) {
        calcA1();
        calcA2();
    }

       public static void calcA1 () {
        double a = 756.13;
        double x=0.3;
        double z = Math.cos (Math.pow((x*x+Math.PI/6),5)) - Math.sqrt(x*a*a*a)-Math.log(Math.abs ((a-1.12*x)/4));
        System.out.println("z="+z);
        double c=Math.cos (Math.pow((x*x+Math.PI/6),5));
        double k=Math.sqrt(x*a*a*a);
        double n=Math.log(Math.abs ((a-1.12*x)/4));
        double z1=c-k-n;
        System.out.println("z="+z1);

    }

    public static void calcA2 () {
        double a = 1.21;
        double b=0.371;
        double y =Math.tan(Math.pow((a+b),2))-Math.cbrt((a+1.5))+a*Math.pow((b),5)-b/Math.log(Math.pow(a,2));
        System.out.println("y="+y);

    }


}
