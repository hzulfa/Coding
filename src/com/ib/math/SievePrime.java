package com.ib.math;

import java.util.ArrayList;

/**
 * Created by ummehunn on 11/23/2016.
 */
public class SievePrime {
    public ArrayList<Integer> sieve(int a) {
        ArrayList<Integer> primes = new ArrayList<>();
        if(a == 0 || a == 1){
            return primes;
        }
        boolean[] isPrime = new boolean[a+1];
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2; i< a+1; i++){
            isPrime[i] = true;
        }

        for(int i=2 ; i< Math.sqrt(a); i++){
            if(isPrime[i]){
                for(int j = 2; i*j<=a ; j++){
                    isPrime[i*j] = false;
                }
            }
        }
        for(int i = 0; i<=a; i++){
            if(isPrime[i]){
                primes.add(i);
            }
        }
        return primes;

    }
}
