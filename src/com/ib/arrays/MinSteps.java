package com.ib.arrays;

import java.util.ArrayList;

/**
 * Created by ummehunn on 11/3/2016.
 */
public class MinSteps {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int moves = 0;
        for(int i=0; i<X.size()-1; i++){
            moves += pointDistance(X.get(i), Y.get(i), X.get(i+1), Y.get(i+1));
        }
        return moves;
    }
    public int pointDistance(int x1, int y1, int x2, int y2){
        int distance = 0;
        int x = 0, y= 0;
        x = Math.abs(x1-x2);
        y = Math.abs(y1-y2);
        if(x>y){
            distance = x;
        }else
            distance = y;

        return distance;
    }
}
