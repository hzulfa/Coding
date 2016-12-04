package com.pie.c3;

/**
 * Created by ummehunn on 11/17/2016.
 */
public class ReturnMax {
    /* Returns the largest value in an array of non-negative integers */
    /* return -1 if empty array */
    public int retMax(int[] a){
        int max = -1;
        if(a.length > 0){
            max = a[0];
            for(int i = 1; i<a.length; i++){
                if(max < a[i]){
                    max = a[i];
                }
            }
        }
        return max;
    }
}
