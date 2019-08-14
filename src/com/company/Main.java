// package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String flips;

        int[][] grid = new int[2][2];
        int[][] newGrid = new int[2][2];

        // Fill in the grid
        grid[0][0] = 1;
        grid[0][1] = 2;
        grid[1][0] = 3;
        grid[1][1] = 4;

        flips = s.nextLine();

        for (int i = 0; i < flips.length(); i++) {

            if (flips.charAt(i) == 'H') {

                newGrid[0][0] = grid[1][0];
                newGrid[0][1] = grid[1][1];
                newGrid[1][0] = grid[0][0];
                newGrid[1][1] = grid[0][1];

            } else if (flips.charAt(i) == 'V') {

                newGrid[0][0] = grid[0][1];
                newGrid[0][1] = grid[0][0];
                newGrid[1][0] = grid[1][1];
                newGrid[1][1] = grid[1][0];

            }

            grid[0][0] = newGrid[0][0];
            grid[0][1] = newGrid[0][1];
            grid[1][0] = newGrid[1][0];
            grid[1][1] = newGrid[1][1];
        }

        System.out.print(grid[0][0]);
        System.out.println(grid[0][1]);
        System.out.print(grid[1][0]);
        System.out.println(grid[1][1]);














    }
}
