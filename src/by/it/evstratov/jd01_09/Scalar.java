package by.it.evstratov.jd01_09;

class Scalar extends Var {

    private final double value;

    public Scalar(double value) {
        this.value = value;
    }
    public Scalar(String strValue) {
        this.value = Double.parseDouble(strValue);
    }
    public Scalar(Scalar otherScalar) {
        this.value = otherScalar.value;
    }

     @Override
     public Var add(Var other) {
         if (other instanceof Scalar) {
             double otherValue = ((Scalar) other).value;
             double result = this.value + otherValue;
             return new Scalar(result);
         }
         else
             return other.add(this);
     }

     @Override
     public Var sub(Var other) {
         if (other instanceof Scalar) {
             double otherValue = ((Scalar) other).value;
             double result = this.value - otherValue;
             return new Scalar(result);
         }
         else
             return other.sub(this).mul(new Scalar(-1));
     }

     @Override
     public Var mul(Var other) {
         if (other instanceof Scalar) {
             double otherValue = ((Scalar) other).value;
             double result = this.value * otherValue;
             return new Scalar(result);
         }
         else
             return other.mul(this);
     }

     @Override
     public Var div(Var other) {
         if (other instanceof Scalar) {
             double otherValue = ((Scalar) other).value;
             if (otherValue==0){
                 System.out.println("Division by zero");
                 return null; //stub
             }
             double result = this.value / otherValue;
             return new Scalar(result);
         }
         else
             return super.div(other);
     }

    @Override
    public String toString() {
        return Double.toString(value);
    }

     public double getValue() {
         return value;
     }
 }
