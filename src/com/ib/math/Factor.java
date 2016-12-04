package com.ib.math;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ummehunn on 11/23/2016.
 */
public class Factor {
    public ArrayList<Integer> allFactors(int a) {
        ArrayList<Integer> factors = new ArrayList<>();
        if(a == 0){
            return factors;
        }
        factors.add(1);
        if(a==1){
            return factors;
        }
        int c;
        for(int i = 2; i<= Math.sqrt(a); i++){
            if(a%i == 0){
                factors.add(i);
                if(i != Math.sqrt(a)){
                    factors.add(a/i);
                }
            }
        }
        factors.add(a);
        Collections.sort(factors);
        return factors;
    }
}
