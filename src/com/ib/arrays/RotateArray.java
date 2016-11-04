package com.ib.arrays;

import java.util.ArrayList;

/**
 * Created by ummehunn on 11/3/2016.
 */
public class RotateArray {
    public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            ret.add( A.get( Math.floorMod((i + B), A.size())));
        }
        return ret;
    }
}
