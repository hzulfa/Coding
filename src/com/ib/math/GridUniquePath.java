package com.ib.math;

import com.ib.arrays.Utility;

import java.util.ArrayList;

/**
 * Created by ummehunn on 11/25/2016.
 */
public class GridUniquePath {
    public int uniquePaths(int a, int b) {
       if(a == 1 || b==1){
           return 1;
       }
       if( a<=0 || b<=0){
           return 0;
       }
       ArrayList<ArrayList<Integer>> grid = new ArrayList<>(a);
       for(int i= 0; i<a; i++){
           ArrayList<Integer> sub = new ArrayList<Integer>();
           for(int j= 0; j< b; j++){
               sub.add(0);
           }
           grid.add(i, sub);
       }
       //grid.get(a-1).set(b-1, 0);
       for(int i=0; i<a; i++){
           grid.get(i).set(b-1, 1);
       }
        for(int i=0; i<b; i++){
            grid.get(a-1).set(i, 1);
        }
        Utility.printArray2D(grid);
        for(int i= a-2; i>=0; i--){
            for(int j= b-2; j>=0; j--){
                grid.get(i).set(j, grid.get(i+1).get(j) + grid.get(i).get(j+1));
            }
        }
        return grid.get(0).get(0);
    }
}
