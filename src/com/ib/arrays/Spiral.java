package com.ib.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ummehunn on 10/30/2016.
 */
public class Spiral {

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

    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        // Populate result;
        int direction = 0; // right=0, down=1, left=2, up=3

        int minCol = 0, maxCol = a.get(0).size()-1;
        int minRow = 0, maxRow = a.size()-1;
        int i = minRow, j = minCol;
        int elemPrinted = 0;
        int totalElement = (maxCol+1)*(maxRow+1);
        while(elemPrinted < totalElement){
            switch(direction){
                case 0: //right
                    if (j<=maxCol){
                        result.add(elemPrinted, a.get(i).get(j));
                        elemPrinted++;
                        j++;
                    }else{
                        i++;
                        j--;
                        minRow++;
                        direction++;
                    }
                    break;
                case 1: //down
                    if (i<=maxRow){
                        result.add(elemPrinted, a.get(i).get(j));
                        elemPrinted++;
                        i++;
                    } else{
                        i--;
                        j--;
                        maxCol--;
                        direction++;
                    }
                    break;
                case 2: //left
                    if (j>=minCol){
                        result.add(elemPrinted, a.get(i).get(j));
                        elemPrinted++;
                        j--;
                    } else {
                        j++;
                        i--;
                        maxRow--;
                        direction++;
                    }
                    break;
                case 3: //up
                    if (i>=minRow){
                        result.add(elemPrinted, a.get(i).get(j));
                        elemPrinted++;
                        i--;
                    } else {
                        i++;
                        j++;
                        minCol++;
                        direction=0;
                    }
                    break;
            }
        }
        return result;
    }
}
