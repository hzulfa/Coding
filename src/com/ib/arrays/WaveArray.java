package com.ib.arrays;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ummehunn on 11/9/2016.
 */
public class WaveArray {
    public ArrayList<Integer> wave(ArrayList<Integer> a) {
        if(a.size() < 2){
            return a;
        }
        Collections.sort(a);
        ArrayList<Integer> b = new ArrayList<>(a.size());
        for(int i = 0; i< a.size()-1; i++){
            b.add(i, a.get(i+1));
            b.add(i+1, a.get(i));
            i++;
        }
        if(a.size()%2 ==1){
            b.add(a.get(a.size()-1));
        }


        return b;
    }
}
