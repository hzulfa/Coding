package com.ib.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by ummehunn on 11/9/2016.
 */
public class MergeOverlappingInterval {

    // provided
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        Collections.sort(intervals, new IntervalComp());
        ArrayList<Interval> res;
        Interval inter;
        int n = intervals.size();
        res = new ArrayList<>();

        for (int i = 0; i < n;) {

            inter = new Interval(intervals.get(i).start, intervals.get(i).end);
            Interval next;
            i++;

            while (i < n) {
                next = intervals.get(i);
                if (overlap(inter, next)) {
                    inter.end = Math.max(inter.end, next.end);
                    i++;
                } else {
                    break;
                }
            }

            res.add(inter);

        }

        return res;
    }

    private class IntervalComp implements Comparator<Interval> {

        @Override
        public int compare(Interval interval1, Interval interval2) {
            int cmp =  Integer.compare(interval1.start, interval2.start);
            if (cmp != 0)
                return cmp;
            cmp = Integer.compare(interval1.end, interval2.end);
            return cmp;
        }

    }

    private boolean overlap(Interval int1, Interval int2) {

        if (int1.end >= int2.start && int1.start <= int2.end)
            return true;

        return false;

    }

    public ArrayList<Interval> merge1(ArrayList<Interval> intervals) {
        ArrayList<Interval> mo = new ArrayList<Interval>();
        sortIntervalByStart(intervals, 0, intervals.size()-1);
        for(int i =0; i< intervals.size(); i++){
            Interval a = intervals.get(i);
            int j = i+1;
            for(; j<intervals.size() && intervals.get(i).end >= intervals.get(j).start; j++){
                if(a.end < intervals.get(j).end){
                    a.end = intervals.get(j).end;
                }
            }
            mo.add(a);
            i = j-1;
        }
        return mo;
    }

    public void sortIntervalByStart(ArrayList<Interval> intervals, int start, int end){
        if(start< end){
            int pIndex = partition(intervals, start, end);
            sortIntervalByStart(intervals, start, pIndex-1);
            sortIntervalByStart(intervals, pIndex, end);
        }
    }

    public int partition(ArrayList<Interval> intervals, int start, int end){
        int pIndex = start;
        int pivot = intervals.get(end).start;
        for(int i= start; i<end; i++){
            if(intervals.get(i).start <=pivot){
                swap(intervals, i, pIndex);
                pIndex++;
            }
        }
        swap(intervals, pIndex, end);
        return pIndex;
    }

    public void swap(ArrayList<Interval> a, int i, int j){
        Interval temp =  a.get(i);
        a.set(i, a.get(j));
        a.set(j, temp);
    }


}
