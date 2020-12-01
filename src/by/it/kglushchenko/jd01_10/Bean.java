package by.it.kglushchenko.jd01_10;

public class Bean {
    @Param(a=2,b=5)
    double sum(double a, double b){
        return a+b;
    }

    @Param(a=2,b=5)
    static double avg(double a, double b){
        return (a+b)/2.0;
    }

    static double min(double a, double b){
        return a+b;
    }

    @SuppressWarnings("ManualMinMaxCalculator")
    double max(double a, double b){
        return a+b;
    }
}
