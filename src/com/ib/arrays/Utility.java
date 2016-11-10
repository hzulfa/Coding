package com.ib.arrays;

import java.util.ArrayList;

/**
 * Created by ummehunn on 11/8/2016.
 */
public class Utility {
    public static void printArray(ArrayList<?> a){
        for(int i = 0; i<a.size(); i++){
            System.out.println(a.get(i));
        }
    }
}
