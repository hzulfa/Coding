package com.pie.c3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by ummehunn on 11/21/2016.
 */
public class Anagrams {
    public static List<Integer> getAnagramIndices(String haystack, String needle){
        if(haystack.length()==0 || needle.length() == 0 || haystack.length() < needle.length())
            return null;
        List<Integer> indices = new ArrayList<>();
        int needleLength = needle.length();

        for(int i=0; i< haystack.length()-needleLength; i++){
            if(checkAnagram(haystack.substring(i, i + needleLength), needle)){
                indices.add(i);
            }
        }
        return indices;
    }

    public static boolean checkAnagram(String s1, String needle){
        boolean result = true;
        HashMap<Character, Integer> c = new HashMap<Character, Integer>();
        for(int i=0; i<needle.length(); i++){
            if(c.get(needle.charAt(i)) != null ){
                c.put(needle.charAt(i), c.get(needle.charAt(i)+1));
            } else {
                c.put(needle.charAt(i), 1);
            }
        }
        for(int i=0; i<s1.length(); i++){
            if(c.get(s1.charAt(i)) != null){
                int times = c.get(s1.charAt(i));
                times--;
                if(times == 0){
                    c.remove(s1.charAt(i));
                } else {
                    c.put(s1.charAt(i), times);
                }

            } else{
                return false;
            }
        }
        return result;
    }
}
