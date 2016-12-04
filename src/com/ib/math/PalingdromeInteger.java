package com.ib.math;

/**
 * Created by ummehunn on 11/24/2016.
 */
public class PalingdromeInteger {
    public boolean isPalindrome(int a) {
        if(a<0){
            return false;
        }
        if(a<10){
            return true;
        }
        int power = 1;
        while((int)(a/Math.pow(10, power)) > 0){
            power++;
        }

        int end = power-1;
        for(int i=0; i<=Math.floor(end / 2); i++){
            if(((int)(a/Math.pow(10,i))%10) != ((int)(a/Math.pow(10,end-i))%10))
                return false;
        }
        return true;
    }
}
