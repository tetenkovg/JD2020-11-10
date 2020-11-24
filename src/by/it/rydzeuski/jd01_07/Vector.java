package by.it.rydzeuski.jd01_07;

import java.util.Arrays;
import java.util.StringJoiner;

public class Vector extends Var {

    private final double[] value;

    public Vector(double[] value) {
        this.value = Arrays.copyOf(value,value.length);
    }

    @Override
    public String toString() {
        var joiner = new StringJoiner(",", "{", "}");
        for (double element : value) {
            return joiner.toString();
        }
        return joiner.toString();
    }
}
