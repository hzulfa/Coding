package com.example.helloworld;

import com.ib.arrays.Spiral;

import java.util.ArrayList;

/**
 * Created by ummehunn on 10/28/2016.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello");

        /*
        Spiral Problem
         */
        System.out.println("Testing Spiral problem:");
        Spiral spiral = new Spiral();
        ArrayList a = spiral.populateArrayWithSampleData(3);
        ArrayList result = spiral.spiralOrder(a);
        for(int i = 0; i<result.size(); i++){
            System.out.println(result.get(i));
        }

        /*
        MinSteps Problem
         */

    }

}
