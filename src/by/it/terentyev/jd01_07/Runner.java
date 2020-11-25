package by.it.terentyev.jd01_07;

public class Runner {

    public static void main(String[] args) {
        Var var1 = new Scalar(3.145);
        Var var2 = new Scalar("4.145");
        Var var3 = new Scalar((Scalar)var1);
        double[] vecValue = {1,2,3,4,5};
        Var var4 = new Vector(vecValue);


        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
    }
}
