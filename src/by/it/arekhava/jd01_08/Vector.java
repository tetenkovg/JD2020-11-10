package by.it.arekhava.jd01_08;

import java.util.Arrays;

class Vector extends Var {


    private double[] array;



    Vector(double[] value) {
        this.array = Arrays.copyOf(value, value.length);
    }

    Vector(String strVector) {
        this.array = Arrays.copyOf(number(strVector), number(strVector).length);
    }

    Vector(Vector vector) {
        this.array = Arrays.copyOf(vector.array, vector.array.length);
    }


        private static double[] number(String line) {

          String[] number = line.replaceAll("[{}]", "").trim().split(",");
            double[] arrayOfNumber = new double[number.length];

            for (int i = 0; i < arrayOfNumber.length; i++) {
                arrayOfNumber[i] = Double.parseDouble(number[i]);
            }
            return arrayOfNumber;
        }

    @Override
    public Var add(Var other) {
        if (other instanceof Scalar) {
            double otherValue = ((Scalar) other).getValue();
            double[] arr = Arrays.copyOf(array, array.length);
            for (int i = 0; i < arr.length; i++) {
                arr[i] += otherValue;

            }
            return new Vector(arr);

        }
        else if (other instanceof Vector){

            double[] arr=Arrays.copyOf(array, array.length);
            for (int i = 0; i < arr.length; i++) {
                arr[i]+=((Vector) other).array[i];

            }
            return new Vector(arr);

        }
        return super.add(other);
    }
    public Var sub(Var other) {
        if (other instanceof Scalar) {
            double otherValue = ((Scalar) other).getValue();
            double[] arr = Arrays.copyOf(array, array.length);
            for (int i = 0; i < arr.length; i++) {
                arr[i] -= otherValue;

            }
            return new Vector(arr);

        }
        else if (other instanceof Vector){

            double[] arr=Arrays.copyOf(array, array.length);
            for (int i = 0; i < arr.length; i++) {
                arr[i]-=((Vector) other).array[i];

            }
            return new Vector(arr);

        }
        return super.add(other);
    }



        public String toString() {
            StringBuilder sb=new StringBuilder( "{");
            String delimiter="";
            for (double element : array) {
                sb.append(delimiter).append(element);
                delimiter=", ";

            }
            sb.append("}");
            return sb.toString();
        }
}
