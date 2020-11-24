package by.it.soldatenko.jd01_07;

public class Runner {
    public static void main(String[] args) {
        Scalar var1 = new Scalar(12);
        Var var2 = new Scalar("14");
        Var var3 = new Scalar(var1);
        Vector var4 = new Vector(new double[]{1, 2, 3, 4, 5});
        Vector var5 = new Vector(var4);
        Vector var6 = new Vector("{1.0,2.0,4.0}");
        System.out.println(var1.toString());
        System.out.println(var2.toString());
        System.out.println(var3.toString());
        System.out.println(var4.toString());
        System.out.println(var5.toString());
        System.out.println(var6.toString());

    }
}
