package by.it.evstratov.jd01_08;


import java.util.Arrays;
import java.util.StringJoiner;

class Vector extends Var{

    private final double[] value;

    public Vector(double[] value) {
        this.value = Arrays.copyOf(value, value.length);
    }

    public Vector(Vector otherVector) {
        this.value = otherVector.value;
    }

    public Vector(String strVector) {
        String str = strVector.replaceAll("[{}]","");
        String[] arrayStrings = str.split(",");
        this.value = new double[arrayStrings.length];
        for (int i = 0; i < value.length; i++) {
            value[i] = Double.parseDouble(arrayStrings[i].trim());
        }

    }

    @Override
    public Var add(Var other) {
        if (other instanceof Scalar){
            double otherValue = ((Scalar) other).getValue();
            double[] arr = Arrays.copyOf(value, value.length);
            for (int i = 0; i < arr.length; i++) {
                arr[i]+=otherValue;
            }
            return new Vector(arr);
        }
        else if (other instanceof Vector){
            double[] arr = Arrays.copyOf(value, value.length);
            for (int i = 0; i < arr.length; i++) {
                arr[i]+=((Vector) other).value[i];
            }
            return new Vector(arr);
        }
        return super.add(other);
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "{", "}");
        for (double v : value) {
            stringJoiner.add(Double.toString(v));
        }
        return stringJoiner.toString();
    }
}
