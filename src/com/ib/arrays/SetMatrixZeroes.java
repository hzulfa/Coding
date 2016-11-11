package com.ib.arrays;

import java.util.ArrayList;

/**
 * Created by ummehunn on 11/11/2016.
 */
public class SetMatrixZeroes {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();
        int m = a.size();
        int n = a.get(0).size();
        for(int i= 0; i<m; i++){
            for(int j=0; i<n; j++){
                if(a.get(i).get(j) == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int i =0; i< rows.size() ; i++){
            for(int j=0; j<n; j++){
                a.get(rows.get(i)).set(j, 0);
            }
        }

        for(int i =0; i< cols.size() ; i++) {
            for (int j = 0; j < m; j++) {
                a.get(j).set(cols.get(i), 0);
            }
        }
     }
}
