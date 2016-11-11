package com.example.helloworld;

import com.ib.arrays.Interval;
import com.ib.arrays.SetMatrixZeroes;

import java.util.ArrayList;

/**
 * Created by ummehunn on 10/28/2016.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Testing interviewBits Problems");
    }


    public void testSetMatrixZeroes(){
        SetMatrixZeroes smz = new SetMatrixZeroes();
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();

    }

    public void testMinStepsProblem(){
        /*
        MinSteps Problem
         */
    }

    public void testSpiralProbelm(){
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
    }

    public void testOnePlusProbelm(){
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
        }*/
    }

    public void testMaxSubArray(){
             /*Testing max subArray*/
        /*System.out.println("Max sub array");
        MaxSubArray1 m = new MaxSubArray1();
        List<Integer> in1 = new ArrayList<>();
        in1.add(-2);
        in1.add(-1);
        in1.add(-3);
        in1.add(-4);
        int out1 = m.maxSubArray(in1);
        System.out.println(out1);*/
    }

    public void testMaxSet(){
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
    }

    public void testMatrixRotate(){
        /* Testing matrix rotate */
        /*RotateMatrix m = new RotateMatrix();
        ArrayList<ArrayList<Integer>> a = m.populateArrayWithSampleData(2);
        m.rotate(a);
        for(int i = 0; i<a.size(); i++){
            for(int j= 0; j<a.size(); j++){
                System.out.println(a.get(i).get(j));
            }

        }*/
    }

    public void testWaveArray(){
        /*ArrayList<Integer> a2 = new ArrayList<Integer>(Arrays.asList(45,61));
        WaveArray w = new WaveArray();
        a2 = w.wave(a2);
        Utility.printArray(a2);*/
    }

    public void testSorting(){
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
       /* ArrayList<Integer> a2 = new ArrayList<Integer>(Arrays.asList(3,9,0,2,4,7,8, -1));
        Sort s2 = new Sort();
        s2.quickSort(a2, 0, 7);
        Utility.printArray(a2);*/
    }

    public void testMergeOverlappingInterval(){
        ArrayList<Interval> intervals = new ArrayList<Interval>();
        /*intervals.add(new Interval(4, 100));
        intervals.add(new Interval(48, 94));
        intervals.add(new Interval(16, 21));
        intervals.add(new Interval(58, 71));
        intervals.add(new Interval(36, 53));
        intervals.add(new Interval(49, 68));
        intervals.add(new Interval(18, 42));
        intervals.add(new Interval(37, 90));
        intervals.add(new Interval(68, 75));
        intervals.add(new Interval(6, 57));
        intervals.add(new Interval(25, 78));

        intervals.add(new Interval(58, 79));

        intervals.add(new Interval(18, 29));
        intervals.add(new Interval(69, 94));
        intervals.add(new Interval(5, 31));
        intervals.add(new Interval(10, 87));
        intervals.add(new Interval(21, 35));
        intervals.add(new Interval(1, 32));
        intervals.add(new Interval(7, 24));
        intervals.add(new Interval(17, 85));
        intervals.add(new Interval(30, 95));
        intervals.add(new Interval(5, 63));
        intervals.add(new Interval(1, 17));
        intervals.add(new Interval(67, 100));
        intervals.add(new Interval(53, 55));
        intervals.add(new Interval(30, 63));
        intervals.add(new Interval(7, 76));
        intervals.add(new Interval(33, 51));
        intervals.add(new Interval(62, 68));
        intervals.add(new Interval(78, 83));
        intervals.add(new Interval(12, 24));
        intervals.add(new Interval(31, 73));
        intervals.add(new Interval(64, 74));
        intervals.add(new Interval(33, 40));
        intervals.add(new Interval(51, 63));
        intervals.add(new Interval(17, 31));
        intervals.add(new Interval(14, 29));
        intervals.add(new Interval(9, 15));
        intervals.add(new Interval(39, 70));
        intervals.add(new Interval(13, 67));
        intervals.add(new Interval(27, 100));
        intervals.add(new Interval(10, 71));
        intervals.add(new Interval(18, 47));
        intervals.add(new Interval(48, 79));
        intervals.add(new Interval(70, 73));
        intervals.add(new Interval(44, 59));
        intervals.add(new Interval(68, 78));
        intervals.add(new Interval(24, 67));
        intervals.add(new Interval(32, 70));
        intervals.add(new Interval(29, 94));
        intervals.add(new Interval(45, 90));
        intervals.add(new Interval(10, 76));
        intervals.add(new Interval(12, 28));
        intervals.add(new Interval(31, 78));
        intervals.add(new Interval(9, 44));
        intervals.add(new Interval(29, 83));
        intervals.add(new Interval(21, 35));
        intervals.add(new Interval(46, 93));
        intervals.add(new Interval(66, 83));
        intervals.add(new Interval(21, 72));
        intervals.add(new Interval(29, 37));
        intervals.add(new Interval(6, 11));
        intervals.add(new Interval(56, 87));
        intervals.add(new Interval(10, 26));
        intervals.add(new Interval(11, 12));
        intervals.add(new Interval(15, 88));
        intervals.add(new Interval(3, 13));
        intervals.add(new Interval(56, 70));
        intervals.add(new Interval(40, 73));
        intervals.add(new Interval(25, 62));
        intervals.add(new Interval(63, 73));
        intervals.add(new Interval(47, 74));
        intervals.add(new Interval(8, 36));*/

        //(1, 10), (2, 9), (3, 8), (4, 7), (5, 6), (6, 6)

        /*intervals.add(new Interval(1, 10));
        intervals.add(new Interval(2,9));
        intervals.add(new Interval(3,8));
        intervals.add(new Interval(4,7));
        intervals.add(new Interval(5,6));
        intervals.add(new Interval(6,6));*/

        /*intervals.add(new Interval(5, 28));
        intervals.add(new Interval(7, 70));
        intervals.add(new Interval(54, 93));
        intervals.add(new Interval(5, 98));
        intervals.add(new Interval(46, 70));
        intervals.add(new Interval(42, 63));
        intervals.add(new Interval(5, 91));
        intervals.add(new Interval(30, 49));
        intervals.add(new Interval(36, 57));
        intervals.add(new Interval(31, 95));
        intervals.add(new Interval(86, 88));
        intervals.add(new Interval(9, 90));
        intervals.add(new Interval(5, 53));
        intervals.add(new Interval(42, 62));
        intervals.add(new Interval(14, 100));
        intervals.add(new Interval(59, 75));
        intervals.add(new Interval(32, 100));
        intervals.add(new Interval(5, 79));
        intervals.add(new Interval(31, 31));
        intervals.add(new Interval(7, 42));
        intervals.add(new Interval(13, 47));
        intervals.add(new Interval(44, 87));
        intervals.add(new Interval(61, 83));
        intervals.add(new Interval(100, 100));
        intervals.add(new Interval(96, 98));
        intervals.add(new Interval(47, 51));
        intervals.add(new Interval(34, 44));
        intervals.add(new Interval(6, 53));
        intervals.add(new Interval(30, 92));
        intervals.add(new Interval(50, 64));
        intervals.add(new Interval(37, 57));
        intervals.add(new Interval(49, 67));
        intervals.add(new Interval(2, 67));
        intervals.add(new Interval(36, 50));
        intervals.add(new Interval(55, 100));
        intervals.add(new Interval(54, 78));
        intervals.add(new Interval(58, 70));
        intervals.add(new Interval(2, 37));
        intervals.add(new Interval(13, 54));
        intervals.add(new Interval(7, 60));
        intervals.add(new Interval(16, 79));
        intervals.add(new Interval(35, 78));
        intervals.add(new Interval(17, 57));
        intervals.add(new Interval(16, 84));
        intervals.add(new Interval(60, 80));
        intervals.add(new Interval(10, 54));
        intervals.add(new Interval(54, 59));
        intervals.add(new Interval(62, 85));
        intervals.add(new Interval(7, 37));
        intervals.add(new Interval(31, 99));
        intervals.add(new Interval(40, 41));
        intervals.add(new Interval(4, 99));
        intervals.add(new Interval(28, 45));
        intervals.add(new Interval(27, 71));
        intervals.add(new Interval(14, 64));*/

        /*(58, 79),(18, 29), (69, 94), (5, 31),(10, 87),(21, 35), (1, 32), (7, 24), (17, 85), (30, 95), (5, 63), (1, 17), (67, 100), (53, 55), (30, 63), (7, 76), (33, 51), (62, 68), (78, 83), (12, 24), (31, 73), (64, 74), (33, 40), (51, 63), (17, 31), (14, 29), (9, 15), (39, 70), (13, 67), (27, 100),
        (10, 71),(18, 47),(48, 79),(70, 73),(44, 59),(68, 78),(24, 67), (32, 70), (29, 94), (45, 90), (10, 76), (12, 28), (31, 78), (9, 44), (29, 83), (21, 35), (46, 93), (66, 83), (21, 72), (29, 37), (6, 11), (56, 87), (10, 26), (11, 12), (15, 88), (3, 13), (56, 70), (40, 73), (25, 62), (63, 73), (47, 74), (8, 36) ]
        /*intervals.add(new Interval(2,6));
        intervals.add(new Interval(1,3));
        intervals.add(new Interval(8,10));
        intervals.add(new Interval(15, 18));*/

        /*MergeOverlappingInterval m = new MergeOverlappingInterval();
        m.sortIntervalByStart(intervals, 0, intervals.size()-1);
        intervals = m.merge(intervals);
        for(int i =0;i<intervals.size(); i++){
            System.out.println("[ "+intervals.get(i).start + " , " + intervals.get(i).end + " ]");
        }*/
    }

    public void testSpiralMatrix(){

    }



}
