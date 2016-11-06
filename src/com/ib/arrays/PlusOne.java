package com.ib.arrays;
import java.util.ArrayList;

/**
 * Created by ummehunn on 11/5/2016.
 */
public class PlusOne {
    public ArrayList<Integer> plusOneWrong(ArrayList<Integer> a) {
        Integer value = 0;
        for(int i = 0; i < a.size(); i++){
            value = a.get(i)+ value*10;
        }
        value =  value +1 ;
        ArrayList<Integer> B = new  ArrayList<Integer>(0);
        while(value/10 > 0){
            int m =  value%10;
            B.add(m);
            value = value/10;
        }
        B.add(value);
        ArrayList<Integer> C = new  ArrayList<Integer>(0);
        for(int i=0; i< B.size(); i++){
            C.add(B.get(B.size()-1 - i));
        }
        return C;
    }
    public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
        ArrayList<Integer> b = new  ArrayList<Integer>(0);
        int i = a.size()-1;
        int j = 0;

        int nines = 0, zeros=0, others = 0;

        while(i>=0 && a.get(i) == 9) {
            i--;
            nines++;
        }

        while( j < a.size() && a.get(j) == 0){
            zeros++;
            j++;
        }


        others = a.size() - nines - zeros;

        if(others == 0){ // all nines
            b.add(1);
            for(int k=0;k<nines;k++){
                b.add(0);
            }
        } else {
            for(int k=0; k<others-1; k++){
                b.add(a.get(zeros+k));
            }
            b.add(a.get(zeros+b.size())+1);
            for(int k=0;k<nines;k++){
                b.add(0);
            }
        }
        return b;


    }
}
