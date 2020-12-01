package by.it.soldatenko.jd01_10;

public class Bean {
    @Param(a=2,b=5)
    double sum(int a,int b){
        return a+b;
    }
    @Param(a=2,b=5)
    double avg(int a,int b){
        return (a+b)/2.0;
    }
    @SuppressWarnings("ManualMaxMinCalculator")
    double max(int a,int b){
        return a>b ? a:b;
    }
    double min(int a,int b){
        return Math.min(a,b);
    }
}
