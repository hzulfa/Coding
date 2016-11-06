package com.ib.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ummehunn on 11/5/2016.
 */
public class MaxSubArray1 {
    public int maxSubArray1(final List<Integer> a) {
        int max = Integer.MIN_VALUE;
            for(int i = 0; i< a.size(); i++){
                int sum = 0;
                for(int k = 0; k+i<a.size(); k++){
                    sum = sum + a.get(i+k);
                    if(sum>max)
                        max= sum;
                }

            }

        return max;

    }
    public int maxSubArray2(final List<Integer> a) {

        int max = Integer.MIN_VALUE;
        int size = a.size();
        ArrayList<ArrayList<Integer>> b = new ArrayList<ArrayList<Integer>>(size);

        for(int i= 0; i<size; i++){
            int value = a.get(i);
            b.add(i, new ArrayList<Integer>(size));
            for(int k=0; k<i; k++){
                b.get(i).add(0);
            }
            b.get(i).add(value);
            if(value>max)
                max= value;
        }
        for(int i = 0; i< size; i++){
            for(int j=i+1; j<size; j++){
                int value = b.get(i).get(j-1)+ a.get(j);
                if(value>max)
                    max = value;
                b.get(i).add(j, value);
            }
        }
        return max;

    }
    public int maxSubArray(final List<Integer> a) {
        // dynamic programming
        // we do not need to store all the values of all the subarrays
        // we can exclude those previous subarrays that are negative, since they cannot contribute to the current max

        int sum = Integer.MIN_VALUE;
        int last = 0;


        for (int i=0; i<a.size(); i++) {
            last += a.get(i);
            sum = Math.max(sum, last);
            // whenever a negative value is the sum of a sub array then that cannot be included in the max value. therefore last is neutralized each time.
            if (last < 0)
                last = 0;
        }

        return sum;
    }
}
