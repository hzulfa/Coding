package com.ib.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ummehunn on 11/11/2016.
 */
public class FindDuplicateInArray {

    public int repeatedNumber(final List<Integer> a) {
        int n = a.size();
        ArrayList<Integer> b = new ArrayList<Integer>(n-1);
        for(int i = 0; i<n-1; i++){
            b.add(i, 0);
        }
        for(int i = 0; i<n; i++){
            b.set(a.get(i)-1, b.get(a.get(i)-1)+1);
            if(b.get(a.get(i)-1) > 1)
                return a.get(i);
        }
        return -1;

    }
}
