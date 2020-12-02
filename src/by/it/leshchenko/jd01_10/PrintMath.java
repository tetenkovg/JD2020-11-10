package by.it.leshchenko.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {
    public static void main(String[] args) {
        Class<Math> mathClass = Math.class;
        Method[] declaredMethods = mathClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            if ((declaredMethod.getModifiers() & Modifier.STATIC) != Modifier.STATIC) {
                System.out.println(declaredMethod);
            }
        }
    }
}
