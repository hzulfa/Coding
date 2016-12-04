package com.ib.math;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ummehunn on 11/24/2016.
 */
public class IsPower {
    public boolean isPower(int a) {
        if(a == 1 || a == -1){
            return true;
        }

        if(a<0){
           return false;
        }
        ArrayList<Integer> factors = allFactors(a);
        for(int i=0; i<factors.size(); i++){
            for(int j = 2;  Math.pow(factors.get(i), j)  <= a; j++){
                    if(Math.pow(factors.get(i), j) == a){
                        return true;
                    }
            }
        }
        return false;
    }
    public ArrayList<Integer> allFactors(int a) {
        ArrayList<Integer> factors = new ArrayList<>();
        if(a == 0){
            return factors;
        }
        //factors.add(1);
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
        //factors.add(a);
        Collections.sort(factors);
        return factors;
    }

}
