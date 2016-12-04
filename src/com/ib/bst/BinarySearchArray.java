package com.ib.bst;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ummehunn on 12/2/2016.
 */
public class BinarySearchArray {
    public int binarySerachArray(ArrayList<Integer> a, int val){
        int index = -1;
        if(a.size() == 0){
            return index;
        }
        int start =0, end = a.size()-1;
        int mid;
        while(start<=end){
            mid = (int)Math.floor((end + start)/2);
            if(a.get(mid) == val){
                return mid;
            } else if(a.get(mid) < val){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }

    public int sqrt(int a){
        if(a <= 0){
            return 0;
        } else if(a == 1){
            return 1;
        }
        int start = 0, end = a;
        int mid =0;
        while(start <= end){
            mid = (int)Math.floor((start+end)/2);
            if(Math.pow(mid, 2) == a){
                return mid;
            } else if(Math.pow(mid, 2) > a){
                end = mid-1;
            } else {
                start = mid +1;
            }
        }
        return end;
    }

    public int findCount(final List<Integer> a, int b) {
        if(a.size() == 0){
            return 0;
        }
        int count = 0;
        int start=0, end = a.size()-1;
        int mid = 0;
        while(start <= end){
            mid = (int)Math.floor((start+end)/2);
            if(a.get(mid) == b){
                for(int i=mid; i<a.size() && a.get(i) ==b; i++){
                    count ++;
                }
                for(int i= mid-1; i>=0 && a.get(i) == b; i--){
                    count ++;
                }
                return count;
            } else if(a.get(mid)> b){
                end = mid -1;
            } else{
                start = mid +1;
            }
        }
        return count;
    }

    public int findMin(final List<Integer> a) {
        if(a.size() == 0){
            return 0;
        }
        int rp = a.get(0);
        int start= 1, end = a.size()-1;
        int mid = 0;
        int minimum = rp;
        while(start <= end){
            mid = (int) Math.floor((start+end)/2);
            if(a.get(mid) > rp){
                start = mid +1;
            } else {
                end = mid -1;
                minimum = a.get(mid);
            }
        }
        return minimum;
    }

    public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(-1);
        result.add(-1);
        if(a.size() == 0){
            return result;
        }
        if(a.size() == 1 && a.get(0)== b){
            result.set(0, 0);
            result.set(1, 0);
            return result;
        }

        int start=0, end = a.size()-1;
        int mid = 0;

        while(start <= end){
            mid = (int)Math.floor((start+end)/2);
            if((a.get(mid) == b && (mid-1)>=0 && a.get(mid-1) < b) || (a.get(mid) == b && mid == 0)){
                result.set(0,mid);
                break;
            } else if(a.get(mid)>= b){
                end = mid -1;
            } else{
                start = mid +1;
            }
        }

        start = 0;
        end = a.size()-1;
        mid =0;
        while(start <= end){
            mid = (int)Math.floor((start+end)/2);
            if((a.get(mid) == b && (mid+1) < a.size() && a.get(mid+1) > b) || (a.get(mid) == b && mid == a.size()-1)){
                result.set(1,mid);
                break;
            } else if(a.get(mid) <= b){
                start = mid +1;

            } else{
                end = mid -1;
            }
        }

        return result;
    }

    public int pow1_not_working(int x, int n, int d) {
        int value = x;
        for(int i = 1; i<n; i++){
            value=value*x;
        }
        if((value < 0 && d >=0)){
           int divisor = d;
           while((value + divisor)<0){
               divisor+=divisor;
           }

           return value+divisor;
        }
        return value%d;
    }

    public int pow(int x, int n, int d){
        return 1;
    }

    public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        if(a.size() == 0 && b.size() != 0){
            return findMedian(b);
        } else if(b.size() == 0 && a.size() != 0){
            return findMedian(a);
        } else if(a.size() == 0 && b.size() == 0){
            return 0;
        }
        int end_a = a.size()-1;
        int end_b = b.size()-1;
        int start_a =0, start_b =0;
        float a_median = findMedian(a);
        float b_median = findMedian(b);
        while(a_median != b_median){
            if(a_median > b_median){
                end_a = ((end_a +start_a)/2);
                a_median = findMedian(a.subList(start_a, end_a));
                start_b = ((end_b+start_b)/2);
                b_median = findMedian(b.subList(start_b, end_b));
            } else {
                start_a = ((end_a +start_a)/2);
                a_median = findMedian(a.subList(start_a, end_a));
                end_b = ((end_b+start_b)/2);
                b_median = findMedian(b.subList(start_b, end_b));
            }
        }
        return a_median;
    }

    public float findMedian(final List<Integer> a){
        if(a.size()%2 == 1){
            return a.get((a.size()-1)/2);
        } else {
            float r = ((float)a.get((a.size()-1)/2)+ (float)a.get(((a.size()-1)/2)+1))/2;
            return r;
        }
    }

}
