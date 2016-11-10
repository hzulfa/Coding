package com.ib.arrays;

import java.util.ArrayList;

/**
 * Created by ummehunn on 11/8/2016.
 */
public class Sort {
    /*
     Complexity:
     1. Time: O(n^2)
     2. Space: Can be in place or in another array, both versions
     3. Stability: depends on the find min function
     4. Internal/external ?
     5. Non-recursive
     6. Slow algorithm
     7. avg case, worst case:

     */
    public ArrayList<Integer> selectionSort(ArrayList<Integer> a){
        for(int i = 0; i<a.size()-1; i++){
            int minIndex = i;
            for(int j=i+1; j<a.size(); j++){
                if(a.get(j)< a.get(minIndex)){
                    minIndex = j;
                }
            }
            int temp = a.get(i);
            a.set(i,a.get(minIndex));
            a.set(minIndex, temp);
        }

        return a;
    }

    /*
     Complexity:
     1. Time: O(n^2)
         avg case, worst case: O(n^2)
         best case , when array is sorted O(n)
     2. Space: in place
     3. Stability: stable
     4. Internal/external ?
     5. Non-recursive
     6. slow sorting algorithm

     */
    public ArrayList<Integer> bubbleSort(ArrayList<Integer> a){
        for(int i = 0; i<a.size()-1; i++){
            int flag = 0;
            for(int j=0;j<a.size()-i-1;j++){
                if(a.get(j)> a.get(j+1)){
                    flag = 1;
                    int temp = a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j+1, temp);
                }
            }
            if(flag == 0){
                break;
            }
        }
        return a;
    }


    /*
     Complexity:
     1. Time:
         avg case, worst case: O(n^2)
         best case , when array is sorted O(n)
     2. Space: in place
     3. Stability: stable
     4. Internal/external   ?
     5. Non-recursive
     6. slow sorting algorithm but better than selection and bubble sort

     */

    public ArrayList<Integer> insertionSort(ArrayList<Integer> a){
        for(int i = 1; i<a.size(); i++){
            int j = 0;
            for(j = i-1; j>0 && a.get(j)> a.get(i); j--){
                a.set(j+1, a.get(j));
            }
            a.set(j, a.get(i));
        }
        return a;
    }

    /*
     Complexity:
     1. Time:
         theta n log n
         avg case, worst case:
         best case ,
     2. Space: not in place algorithm n log n / if left right cleared, it wilbe theta n
     3. Stability: stable preserves the relative order
     4. Internal/external   ?
     5. recursive

     */

    public ArrayList<Integer> mergeSort(ArrayList<Integer> a){
        int n = a.size();
        if(n<2)
            return a;
        else {
            int mid = (int)Math.floor(n/2);
            ArrayList<Integer> left = new ArrayList<Integer>();
            for(int i=0;i<mid; i++){
                left.add(a.get(i));
            }
            ArrayList<Integer> right = new ArrayList<Integer>();
            for(int i=mid;i<n; i++){
                right.add(a.get(i));
            }
            left = mergeSort(left);
            right = mergeSort(right);
            a = merge(left, right, a);
        }
        return a;
    }

    public ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right, ArrayList<Integer> a){
        int i=0, j=0, k=0;
        while(i<left.size() && j<right.size()){
            if(left.get(i)<right.get(j)){
                a.set(k, left.get(i));
                i++;
                k++;
            }else{
                a.set(k, right.get(j));
                j++;
                k++;
            }
        }
        if(i != left.size()){
            for(; i<left.size(); i++){
                a.set(k,left.get(i));
                k++;
            }
        }
        if(j != right.size()){
            for(; j<right.size(); j++){
                a.set(k, right.get(j));
                k++;
            }
        }
        return a;
    }

    /*
     Complexity:
     1. Time:
        Design and conquere algorithm
         avg case,
         best case , O(nlogn)
         worst case: O(n^2) (totally sorted array, unbalanced partitioning)
     2. Space:in place, avg: O(logn), worst case O(n)
     3. Stability: not stable
     4. Internal/external
     5. recursive

     */
    public void quickSort(ArrayList<Integer> a, int start, int end ){
        if(start<end){
            int pivotIndex = partition(a, start, end);
            quickSort(a, start, pivotIndex-1);
            quickSort(a, pivotIndex, end);
        }
    }

    public int partition(ArrayList<Integer> a, int start, int end){
        int pivotIndex = start;
        int pivot =  a.get(end);
        for(int i= start ; i<end; i++){
            if(a.get(i) <= pivot){
                int temp = a.get(i);
                a.set(i, a.get(pivotIndex));
                a.set(pivotIndex, temp);
                pivotIndex++;
            }
        }
        a.set(end, a.get(pivotIndex));
        a.set(pivotIndex, pivot);
        return pivotIndex;
    }

    public int randomizedPartition(ArrayList<Integer> a, int start, int end){
        int pivotIndex = (int)Math.random()%(end-start) +start;
        int pivot =  a.get(end);
        for(int i= start ; i<end; i++){
            if(a.get(i) <= pivot){
                int temp = a.get(i);
                a.set(i, a.get(pivotIndex));
                a.set(pivotIndex, temp);
                pivotIndex++;
            }
        }
        a.set(end, a.get(pivotIndex));
        a.set(pivotIndex, pivot);
        return pivotIndex;
    }





}
