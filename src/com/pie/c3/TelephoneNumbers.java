package com.pie.c3;

/**
 * Created by ummehunn on 11/21/2016.
 */
public class TelephoneNumbers {

    private int[] number;
    private int PHONE_NUMBER_LENGTH = 7;
    private char[] words = new char[PHONE_NUMBER_LENGTH];
    public TelephoneNumbers(int[] number){
        this.number = number;
    }
    public void printWords(){
        printWords(0);
    }

    public void printWords(int start){
        if(start >= PHONE_NUMBER_LENGTH){
            System.out.println(new String(words));
            return;
        }
        for(int i=0; i< 3; i++){
            words[start]= getCharKey(i, number[start]);
            printWords(start +1);
            if(words[start] == '1' || words[start] == '0')
                return;
        }
    }

    public char getCharKey(int i, int number){
        char a = 'A';
        if(number == 0)
            return '0';
        else if(number == 1)
            return '1';
        else
        {
            a = (char) (a+(number-2)*3+i);
            return a;
        }

    }


}
