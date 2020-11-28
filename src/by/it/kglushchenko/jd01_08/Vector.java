package by.it.kglushchenko.jd01_08;

import java.util.Arrays;
import java.util.StringJoiner;

class Vector extends Var {
    private final double[] value;


    public Vector(double[] value) {
        this.value = Arrays.copyOf(value, value.length);
    }

    public Vector(String strValue) {
        this.value = Arrays.copyOf(number(strValue), number(strValue).length);
    }

    public Vector(Vector otherVector) {
        this.value = Arrays.copyOf(otherVector.value, otherVector.value.length);   //otherVector.value;
    }


    @Override
    public Var add(Var other) {
        if (other instanceof Vector) {
            // Result: Vector + Vector
            double[] sum = new double[this.value.length];
            for (int i = 0; i < this.value.length; i++) {
                sum[i] += this.value[i] + ((Vector) other).value[i];
            }
            // Возвращаемый тип должен быть Var или его потмком
            return new Vector(sum);
        } else
            // если other Scalar -> Scalar.add
            // если other Matrix -> Matrix.add
            return other.add(this);
    }


    @Override
    public Var sub(Var other) {
        if (other instanceof Vector) {
            // Result: Vector - Vector
            double[] sub = new double[this.value.length];
            for (int i = 0; i < this.value.length; i++) {
                sub[i] += this.value[i] - ((Vector) other).value[i];
            }
            // Возвращаемый тип должен быть Var или его потмком
            return new Vector(sub);
        } else
            // если other Scalar -> Scalar.add
            // если other Matrix -> Matrix.add
            return other.sub(this);
    }

    @Override
    public Var mul(Var other) {
        if (other instanceof Vector) {
            // Result: Vector * Vector
            // Умножение вектора на вектор
            double[] sum = new double[this.value.length];
            for (int i = 0; i < this.value.length; i++) {
                sum[i] += this.value[i] * ((Vector) other).value[i];
            }
            // Возвращаемый тип должен быть Var или его потмком
            return new Vector(sum);
        }
        // если other Scalar -> Scalar.mul
        // если other Matrix -> Matrix.mul
        return other.mul(this);
    }

    @Override
    public Var div(Var other) {
        if (other instanceof Vector) {
            // Result: Vector / Scalar:
            double[] div = new double[this.value.length];
            for (int i = 0; i < this.value.length; i++) {
                div[i] = this.value[i] / ((Vector)(other)).value[i];
            }

            // Возвращаемый тип должен быть Var или его потмком
            return new Vector(div);
        } else
            // если other vector -> vector.div
            // если other matrix -> matrix.div
            return other.div(this);
    }



    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{", "}");
        for (double element : value) {
            joiner.add(Double.toString(element));
        }
        return joiner.toString();
    }

    private static double[] number(String line) {

        String[] number = line.replaceAll("[{}]", "").trim().split(",");
        double[] arrayOfNumber = new double[number.length];

        for (int i = 0; i < arrayOfNumber.length; i++) {
            arrayOfNumber[i] = Double.parseDouble(number[i]);
        }
        return arrayOfNumber;
    }
}

