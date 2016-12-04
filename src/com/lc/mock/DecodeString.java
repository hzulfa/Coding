package com.lc.mock;

import java.util.Stack;

/**
 * Created by ummehunn on 11/17/2016.
 * 1. Two stack solution
 * 2.one stack solution
 * 3.recursive solution
 * 4.regex solution
 */
public class DecodeString {

    public String decodeString(String s) {
        if(s.length() == 0){
            return "";
        }
        String decode = "";
        Stack<Integer> repeat = new Stack<>();
        Stack<String> str = new Stack<>();
        String d ="";
        str.push("");
        for(int i =0; i< s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                int k = i;
                while(Character.isDigit(s.charAt(k))){
                    k++;
                }
                repeat.push(Integer.parseInt(s.substring(i,k)));
                i = k-1;
            } else if(s.charAt(i) == '['){
                str.push("");
            } else if(Character.isAlphabetic(s.charAt(i))){
                String s1 = "";
                if(!str.empty())
                    s1= str.pop();
                s1 = s1 + Character.toString(s.charAt(i));
                str.push(s1);
            } else {
                int r = repeat.pop();
                String s2 = "";
                String s3 = "";
                if(!str.empty())
                    s3 = str.pop();
                for(int j=0; j<r; j++){
                   s2 = s2.concat(s3);
                }
                String s1 = "";
                if(!str.empty() && !repeat.empty()){
                    s1 = str.pop();
                    str.push(s1.concat(s2));
                } else if(!str.empty()){
                    s1 = str.pop();
                    str.push(s1.concat(s2));
                }
                   // decode = decode+s2;

            }
        }

        return str.pop();
    }





}
