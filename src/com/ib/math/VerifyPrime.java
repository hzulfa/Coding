package com.ib.math;

/**
 * Created by ummehunn on 11/23/2016.
 */
public class VerifyPrime {
    public int isPrime(int a) {
        for(int i = 2; i<= Math.sqrt(a); i++){
            if(a%i == 0){
                return 0;
            }
        }
        return 1;
    }

}
