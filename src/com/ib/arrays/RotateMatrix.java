package com.ib.arrays;

import java.util.ArrayList;

/**
 * Created by ummehunn on 11/8/2016.
 */
public class RotateMatrix {

    public ArrayList<ArrayList<Integer>> populateArrayWithSampleData(int n){
        ArrayList<ArrayList<Integer>> a =  new ArrayList<ArrayList<Integer>>(n);
        int k = 1;
        for(int i=0; i<n; i++){
            ArrayList<Integer> b = new ArrayList<Integer>();
            for(int j=0 ;j<n ;j++){
                b.add(j,k);
                k++;
            }
            a.add(i, b);
        }
        return a;
    }
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        int temp = 0;
        int n = a.size();
        double f = Math.floor(((double) n) / 2);
        double c = Math.ceil(((double) n)/2);
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                temp = a.get(i).get(j);
                a.get(i).set(j, a.get(n-1-j).get(i));
                a.get(n - 1 - j).set(i, a.get(n - 1 - i).get(n - 1 - j));
                a.get(n - 1 - i).set(n - 1 - j, a.get(j).get(n-1-i));
                a.get(j).set(n-1-i, temp);
            }
        }
    }
}
