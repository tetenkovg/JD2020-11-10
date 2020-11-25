package by.it.kglushchenko.jd01_07;

public class Runner {
    public static void main(String[] args) {

        Var var1 = new Scalar(12);
        Var var2 = new Scalar("14");
        Var var3 = new Scalar((Scalar) var1);

        Var var4 = new Vector(new double[]{1, 2, 3, 4, 5});
        Var var5 = new Vector("1 2 3");
        Var var6 = new Vector((Vector)var4);

        System.out.println(var1.toString());
        System.out.println(var2.toString());
        System.out.println(var3.toString());
        System.out.println(var4.toString());
        System.out.println(var5.toString());
        System.out.println(var6.toString());
    }
}
