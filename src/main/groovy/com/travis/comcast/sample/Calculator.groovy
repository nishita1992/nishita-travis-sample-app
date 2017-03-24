package com.travis.comcast.sample

/**
 * Created by nishita.kheur on 3/23/17.
 */
public class Calculator {
    double add(double a, double b) {
        if (a==null ||b==null)
            return -1;
        double answer = a+b;
        return answer;
    }

    double subtract(double a, double b) {

        if (a==null ||b==null)
            return -1;
        double answer = a-b;
        return answer;
    }

    double multiply(double a, double b) {
        if (a==null ||b==null)
            return -1;
        double answer = a*b;
        return answer;
    }

    double divide(double a, double b) {
        if (a==null ||b==null)
            return -1;
        if(b==0)
            return -1;
        double answer = a/b;
        return answer;
    }

    double power(double a, double b){
        if (a==null ||b==null)
            return -1;
        return Math.pow(a,b);
    }

}
