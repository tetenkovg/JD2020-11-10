package by.it.soldatenko.jd01_05;
import static java.lang.Math.*;
public class TaskC {
    public static void main(String[] args) {
        Step1();

    }

    private static void Step1() {
        double deltaX =0.1468;
        int n = 26;
        double x = 5.33;
        double[] arr = new double[n];
        int count = 0;
        double value = (double)1/3;
        while (x<=9){
            x = (int)(x * 10000 + 0.5);
            x = x / 10000;
            arr[count]= pow((x * x + 4.5), value);
//            System.out.println(x);
//            System.out.println(count);
            x=x + deltaX;
            count++;
        }
        System.out.println("Массив V[]");
        printArray(arr, "V");
        count=0;
        for (double v : arr) {
            if (v > 3.5) {
                count++;
            }
        }
        double[] arr_3_5 = new double[count];
        count=0;
        for (double v : arr) {
            if (v > 3.5) {
                arr_3_5[count] = v;
                count++;
            }
        }
        System.out.println("Массив W[] из элементов массива A > 3.5");
        printArray(arr_3_5,"W");

        double mul= 1;
        for (double v : arr_3_5) {
            mul = mul * v;
        }
        value = 1/ (double)arr_3_5.length;
        double geom_mean = pow(mul,value);
        System.out.println("Среднее геометрическое " + geom_mean);
    }
    static void printArray(double[] arr, String name){

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s[% -3d]=%-10f", name, i, arr[i]);
            if ((i+1)% 5 ==0 || i+1 == arr.length){
                System.out.println();
            }
        }
    }
}
