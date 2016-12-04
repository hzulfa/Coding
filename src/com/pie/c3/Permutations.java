package com.pie.c3;

/**
 * Created by ummehunn on 11/21/2016.
 */
public class Permutations {
    private boolean used[];
    private StringBuilder out = new StringBuilder();
    private String in;

    public Permutations(String str) {
        this.in = str;
        this.used = new boolean[str.length()];
    }

    public void permute(){
        if(in.length() == out.length()){
            System.out.println(out);
            return;
        }
        for(int i =0; i<in.length(); i++){
            if(used[i]){
                continue;
            }else {
                out.append(in.charAt(i));
                used[i]=true;
                permute();
                used[i]=false;
                out.setLength(out.length()-1);
            }
        }
    }
}
