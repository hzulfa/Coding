package com.ib.arrays;

import java.util.ArrayList;

/**
 * Created by ummehunn on 12/1/2016.
 */
public class PrettyPrint {
    public ArrayList<ArrayList<Integer>> prettyPrint(int a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(a<=0){
            return result;
        }

        for(int i=0; i<2*a-1; i++){
            result.add(new ArrayList<Integer>());
            for(int j=0; j< 2*a-1; j++){
                result.get(i).add(0);
            }
        }

        int rowStart, colStart, rowEnd, colEnd;
        for(int i=0; i<a; i++){
            rowStart = colStart = i;
            rowEnd = colEnd = 2*a-2-i;
            for(int j = colStart; j<=colEnd; j++){
                result.get(rowStart).set(j, a-i);
                result.get(rowEnd).set(j, a-i);
            }
            for(int j= rowStart+1; j<rowEnd; j++){
                result.get(j).set(colStart, a-i);
                result.get(j).set(colEnd, a-i);
            }
        }

        return  result;


    }
}
