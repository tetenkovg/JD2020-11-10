package by.it.evstratov.jd01_10;

public class Bean {

    @Param(a = 2, b = 4)
    double sum(int a, int b){
        return a + b;
    }

    @Param(a = 2, b = 4)
    static double avg(int a, int b){
        return (a + b)/2.0;
    }

    @Param(a = 2, b = 4)
    double max(int a, int b){
        return a > b ? a : b;
    }

    static double min(int a, int b){
        return a < b ? a : b;
    }

}
