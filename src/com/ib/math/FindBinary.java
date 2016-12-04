package com.ib.math;

/**
 * Created by ummehunn on 11/24/2016.
 */
public class FindBinary {
    public String findDigitsInBinary(int a) {
        String binary = "";
        int i = a;
        while(i > 0){
            binary = binary.concat(Integer.toString(i%2));
            i = a/2;
        }
        binary = binary.concat(Integer.toString(a%2));
        return binary;
    }
}
