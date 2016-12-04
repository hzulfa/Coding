package com.pie.c3;

/**
 * Created by ummehunn on 11/21/2016.
 */
public class Combinations {
    final String in;
    StringBuilder out = new StringBuilder();

    public Combinations(String in) {
        this.in = in;
    }

    public void combine(){
        combine(0);
    }

    public void combine(int start){
        for(int i=0; i<in.length(); i++){
            out.append(in.charAt(i));
            System.out.println(out);
            if(i<in.length()){
                combine(i+1);
            }
            out.setLength(out.length()-1);
        }

    }
}
