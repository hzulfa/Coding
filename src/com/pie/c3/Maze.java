package com.pie.c3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

// Write a program to solve the maze
// [
//     [1,5,5,5,0],
//     [0,5,0,0,0],
//     [0,5,0,5,0],
//     [0,0,0,5,0],
//     [0,5,5,5,9]
// ]

// Output
// Log the coordinates as you go 0,0; 0,1 (Verify path is correct)
// When 9 return "Victory"
// If you cannot  find 9 return "Defeat"

public class Maze{

    public void solveMaze(ArrayList<ArrayList<Integer>> maze){
        ArrayList<Coordinate> path = new ArrayList<Coordinate>();
        HashMap<Coordinate, Boolean> visited =  new HashMap<Coordinate, Boolean>();
        Coordinate source = new Coordinate(0,0);
        int start = 1, end =9;
        Stack<Coordinate> stack = new Stack<>();
        stack.push(source);

        Coordinate c;
        while(true){
            c = stack.pop();
            visited.put(c,true);
            path.add(c);
            if(maze.get(c.x).get(c.y) == 9){

                printPath(path);
                System.out.println("Victory");
                return;
            }

            ArrayList<Coordinate> adjacents = findAdjacentAccessible(c, maze);
            if(adjacents.size() == 0){
                System.out.println("Defeat");
                return;

            } else{
                for(int i= 0; i< adjacents.size(); i++){
                    if(!visited.containsKey(adjacents.get(i)))
                        stack.push(adjacents.get(i));
                }
            }
        }
    }
    public ArrayList<Coordinate> findAdjacentAccessible(Coordinate a, ArrayList<ArrayList<Integer>> maze){
        ArrayList<Coordinate> adjacents = new ArrayList<Coordinate>();
        int mazeRows =  maze.size();
        int mazeColumns = 0;

        if(mazeRows > 0){
            mazeColumns = maze.get(0).size();
        }

        if(a.x -1 > 0 && maze.get(a.x-1).get(a.y) == 0){
            adjacents.add(new Coordinate(a.x -1, a.y));
        }
        if(a.x +1 < mazeRows && maze.get(a.x+1).get(a.y) == 0){
            adjacents.add(new Coordinate(a.x +1, a.y));
        }
        if(a.y -1 > 0 && maze.get(a.x).get(a.y-1) == 0){
            adjacents.add(new Coordinate(a.x, a.y-1));
        }
        if(a.y +1 < mazeColumns && maze.get(a.x).get(a.y+1) == 0){
            adjacents.add(new Coordinate(a.x, a.y+1));
        }
        return adjacents;
    }

    public void printPath(ArrayList<Coordinate> path){

        for(int i=0; i< path.size(); i++){
            System.out.print("("+ path.get(i).x + "," + path.get(i).y + ")");
        }
    }

    class Coordinate{
        public int x;
        public int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }



    }
}