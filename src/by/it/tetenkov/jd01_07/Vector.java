package by.it.tetenkov.jd01_07;

import java.util.Arrays;
import java.util.StringJoiner;

public class Vector extends Var{

    private final double[] value;

    public Vector(double[] value) {
        this.value = Arrays.copyOf(value, value.length);
    }

    /*public Vector(Vector otherVector) {
        this.value = Arrays.copyOf(otherVector, );
    }*/

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{", "}");
        for (double elements : value) {
            joiner.add(Double.toString(elements));
            
        }
        return joiner.toString();
    }
}
