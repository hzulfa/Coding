package com.ib.arrays;

import java.util.ArrayList;

/**
 * Created by ummehunn on 11/7/2016.
 */
public class MaxSet {
    public ArrayList<Integer> maxset(ArrayList<Integer> a) {

        int size = a.size();
        ArrayList<ArrayList<Integer>> b = new ArrayList<ArrayList<Integer>>(size);
        int start = 0, end = 0;
        long max = -1;
        int i = 0;
        while(i<a.size()){
            long sum = -1;
            int j;
            for(j = i; j<a.size() && a.get(j)>=0; j++){
                if(sum == -1){
                    sum = 0;
                }
                sum = sum + a.get(j);
            }
            if(sum> max){
                start = i;
                end = j-1;
                max = sum;
            } else if(sum == max){
                if((end-start)<(j-1-i)){
                    start = i;
                    end = j-1;
                }
            }
            if(i<j)
                i = j;
            else
                i++;
        }

        ArrayList<Integer> c = new ArrayList<>(0);
        for(int k=start; k<a.size() && k<=end && max >= 0; k++){
            c.add(a.get(k));
        }

        return c;
    }
}
