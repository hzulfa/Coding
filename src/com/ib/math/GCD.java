package com.ib.math;

/**
 * Created by ummehunn on 11/24/2016.
 */
public class GCD {
    public int gcd(int a, int b) {
        if( a ==0 || b== 0){
            return Math.max(a,b);
        }
        int m, n;
        if( a > b){
            m= a;
            n= b;
        } else{
            m= b;
            n = a;
        }
        while((m%n) != 0){
            int temp = m %n;
            m = n;
            n = temp;
        }
        return n;
    }



}
