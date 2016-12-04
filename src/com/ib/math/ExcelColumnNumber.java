package com.ib.math;

/**
 * Created by ummehunn on 11/24/2016.
 */
public class ExcelColumnNumber {
    public int titleToNumber(String a) {
        int number = 0;
        int position = 0;
        for(int i=a.length()-1; i>=0; i--){
            number = number + getLetterValue(a.charAt(i))* (int)Math.pow(26,position);
            position++;
        }
        return number;
    }

    public int getLetterValue(char c){
        return c-'A'+1;
    }
}
