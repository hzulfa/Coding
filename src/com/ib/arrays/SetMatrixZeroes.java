package com.ib.arrays;

import java.util.ArrayList;

/**
 * Created by ummehunn on 11/11/2016.
 */
public class SetMatrixZeroes {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        int m = a.size();
        int n = a.get(0).size();

        int rowZero = 1, colZero= 1;
        for(int i=0; i<n; i++){
            if(a.get(0).get(i) == 0){
                rowZero =0;
                break;
            }

        }

        for(int i=0; i<m; i++){
            if(a.get(i).get(0) == 0){
                colZero =0;
                break;
            }

        }

        for(int i= 1; i<m; i++){
            for(int j=1; j<n; j++){
                if(a.get(i).get(j) == 0){
                    a.get(0).set(j, 0);
                    a.get(i).set(0, 0);

                }
            }
        }
        for(int i =1; i<m ; i++){
            for(int j=1; j<n; j++){
                if(a.get(i).get(0) == 0){
                    a.get(i).set(j, a.get(i).get(0));
                }

            }
        }

        for(int i =1; i< n ; i++) {
            for (int j = 1; j < m; j++) {
                if(a.get(0).get(i) == 0){
                    a.get(j).set(i, a.get(0).get(i));
                }

            }
        }

        if(rowZero == 0){
            for(int i=0; i<n; i++){
                a.get(0).set(i, rowZero);
            }
        }

        if(colZero == 0){
            for(int i=0; i<m; i++){
                a.get(i).set(0, colZero);
            }
        }



     }

    public void setZeroes1(ArrayList<ArrayList<Integer>> a) {


        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();
        int m = a.size();
        int n = a.get(0).size();
        for(int i= 1; i<m; i++){
            for(int j=1; j<n; j++){
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
