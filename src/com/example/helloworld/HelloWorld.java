package com.example.helloworld;

import com.ib.arrays.Sort;
import com.ib.arrays.Utility;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ummehunn on 10/28/2016.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello");

        /*
        Spiral Problem
         */
        /*System.out.println("Testing Spiral problem:");
        Spiral spiral = new Spiral();
        ArrayList a = spiral.populateArrayWithSampleData(3);
        ArrayList result = spiral.spiralOrder(a);
        for(int i = 0; i<result.size(); i++){
            System.out.println(result.get(i));
        }*/

        /*
        MinSteps Problem
         */

        /*
        OnePlus Problem
         */
        /* System.out.println("Testing OnePlus Problem");
        PlusOne a =  new PlusOne();
        ArrayList in = new ArrayList();
        in.add(0);
        in.add(1);
        in.add(2);
        in.add(3);
        in.add(9);
        in.add(9);
        in.add(9);
        in.add(9);
        in.add(9);


        in.add(0);
        in.add(3);
        in.add(7);
        in.add(6);
        in.add(4);
        in.add(0);
        in.add(5);
        in.add(5);
        in.add(5);

        ArrayList out = a.plusOne(in);
        for(int i = 0; i<out.size(); i++){
            System.out.println(out.get(i));
        }

        /*Testing max subArray*/
        /*System.out.println("Max sub array");
        MaxSubArray m = new MaxSubArray();
        List<Integer> in1 = new ArrayList<>();
        in1.add(-2);
        in1.add(-1);
        in1.add(-3);
        in1.add(-4);
        int out1 = m.maxSubArray(in1);
        System.out.println(out1);*/

        /* Testing max Set*/
        /*MaxSet m = new MaxSet();
        ArrayList<Integer> in1 = new ArrayList<>(0);
        //1, 2, 5, -7, 2, 5
        *//*in1.add(1);
        in1.add(2);
        in1.add(5);
        in1.add(-7);
        in1.add(2);
        in1.add(5);*//*
        in1.add(0);
        in1.add(-1);
        in1.add(0);
        in1.add(0);
        ArrayList<Integer> out = m.maxset(in1);
        for(int i = 0; i<out.size(); i++){
            System.out.println(out.get(i));
        }*/

        /* Testing matrix rotate */
        /*RotateMatrix m = new RotateMatrix();
        ArrayList<ArrayList<Integer>> a = m.populateArrayWithSampleData(2);
        m.rotate(a);
        for(int i = 0; i<a.size(); i++){
            for(int j= 0; j<a.size(); j++){
                System.out.println(a.get(i).get(j));
            }

        }*/

        /* Testing selection sort */
//        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(3,9,0,2,4,7,8, -1));
//        Sort s = new Sort();
//        a = s.selectionSort(a);
//        Utility.printArray(a);

        /* Testing selection sort */
/*
        ArrayList<Integer> a1 = new ArrayList<Integer>(Arrays.asList(3,9,0,2,4,7,8, -1));
        Sort s1 = new Sort();
        a1 = s.bubbleSort(a1);
        Utility.printArray(a1);
*/

        /* Testing insertion sort */
        /*ArrayList<Integer> a2 = new ArrayList<Integer>(Arrays.asList(3,9,0,2,4,7,8, -1));
        Sort s2 = new Sort();
        a2 = s2.bubbleSort(a2);
        Utility.printArray(a2);*/

        /* Testing merge sort */
        ArrayList<Integer> a2 = new ArrayList<Integer>(Arrays.asList(3,9,0,2,4,7,8, -1));
        Sort s2 = new Sort();
        s2.quickSort(a2, 0, 7);
        Utility.printArray(a2);

    }

}
