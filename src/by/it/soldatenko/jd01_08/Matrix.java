package by.it.soldatenko.jd01_08;

import java.util.Arrays;

class Matrix extends Var {
    private double[][] value;

    Matrix(double[][] value) {
        this.value = value;
    }

    Matrix(Matrix matrix) {
        this.value = matrix.value;
    }

    Matrix(String strMatrix) {
        String a = strMatrix.replaceAll("[\\{\\}\\ ]", "");
        String[] str = a.split(",");
        double[][] d = new double[(int)Math.sqrt(str.length)][(int)Math.sqrt(str.length)];
        int count = 0;
        for (int i = 0; i < (int)Math.sqrt(str.length); i++) {
            for (int j = 0; j < (int)Math.sqrt(str.length); j++) {
                d[i][j] = Double.parseDouble(str[count]);
                count++;
            }
        }
        this.value = d;

    }

    @Override
    public Var add(Var other) {
                if(other instanceof Scalar){
            double[][] res = Arrays.copyOf(value,value.length);
            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < res.length; j++) {

                    res[i][j] = res[i][j] + ((Scalar)other).getValue();
                    System.out.println(((Scalar)other).getValue()) ;
                }
            }

            return new Matrix(res);
        }
        else if(other instanceof Matrix){
            double[][] res = Arrays.copyOf(value,value.length);
            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < res.length; j++) {

                    res[i][j] = res[i][j] + ((Matrix)other).value[i][j];
                }
            }

            return new Matrix(res);
        }


        return super.add(other);

    }

    @Override
    public Var sub(Var other) {
        if(other instanceof Scalar){
            double[][] res = Arrays.copyOf(value,value.length);
            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < res.length; j++) {
//                    System.out.print(res[i][j] + " ");

                    res[i][j] = res[i][j] - ((Scalar)other).getValue();
//                    System.out.println(res[i][j] + " " +((Scalar)other).getValue()) ;
                }
            }

            return new Matrix(res);
        }
        else if(other instanceof Matrix){
            double[][] res = Arrays.copyOf(value,value.length);
            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < res.length; j++) {

                    res[i][j] = res[i][j] - ((Matrix)other).value[i][j];
                }
            }

            return new Matrix(res);
        }


        return super.add(other);

    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < value.length; i++) {
            sb.append("{");
            String delimiter = "";
            for (int j = 0; j < value.length; j++) {
                sb.append(delimiter).append(value[i][j]);
                delimiter = ", ";
            }
            sb.append("}");
            if( i< (value.length-1)){
            sb.append(delimiter);
            }
        }
        sb.append("}");
        return sb.toString();

    }
}
