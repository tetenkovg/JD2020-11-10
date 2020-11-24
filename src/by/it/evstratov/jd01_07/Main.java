package by.it.evstratov.jd01_07;

public class Main {

    public static void main(String[] args) {

        Var var1 = new Scalar("12");
        Var var2 = new Vector(new double[]{1.0, 2.2, 3.1});
        Var var3 = new Matrix();

        System.out.println(var1.toString());
        //System.out.println(var2.toString());
        System.out.println(var3.toString());

    }

}
