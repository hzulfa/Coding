package com.ib.math;

import java.util.ArrayList;

/**
 * Created by ummehunn on 11/24/2016.
 */
public class ReArrangeArray {
    public void arrange(ArrayList<Integer> a) {

       int n = a.size();
       for(int i =0 ; i<n; i++){
           a.set(i, a.get(i)+ ((a.get(a.get(i))%n)*n));
       }
        for(int i =0 ; i<n; i++){
            a.set(i, a.get(i)/n);
        }
    }
}
