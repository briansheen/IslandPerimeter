package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(islandPerimeter(grid));
    }

    public static int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[i].length; ++j) {
                if (i == 0) {
                    if (grid[i][j] == 1 && j > 0 && j < (grid[i].length - 1)) {
                        perimeter += 1;
                        if (j - 1 < 0 || grid[i][j - 1] == 0) {
                            perimeter += 1;
                        }
                        if (j + 1 >= grid[i].length || grid[i][j + 1] == 0) {
                            perimeter += 1;
                        }
                        if (i + 1 >= grid.length || grid[i + 1][j] == 0) {
                            perimeter += 1;
                        }
                    }
                    if (grid[i][j] == 1 && j == 0) {
                        perimeter += 2;
                        if (j + 1 >= grid[i].length || grid[i][j + 1] == 0) {
                            perimeter += 1;
                        }
                        if (i + 1 >= grid.length || grid[i + 1][j] == 0) {
                            perimeter += 1;
                        }
                    }
                    if (grid[i][j] == 1 && j == (grid[i].length - 1) && grid[i].length != 1) {
                        perimeter += 2;
                        if (j - 1 < 0 || grid[i][j - 1] == 0) {
                            perimeter += 1;
                        }
                        if (i + 1 >= grid.length || grid[i + 1][j] == 0) {
                            perimeter += 1;
                        }
                    }
                } else if (i == grid.length - 1) {
                    if (grid[i][j] == 1 && j > 0 && j < (grid[i].length - 1)) {
                        perimeter += 1;
                        if (j - 1 < 0 || grid[i][j - 1] == 0) {
                            perimeter += 1;
                        }
                        if (j + 1 >= grid[i].length || grid[i][j + 1] == 0) {
                            perimeter += 1;
                        }
                        if (i - 1 < 0 || grid[i - 1][j] == 0) {
                            perimeter += 1;
                        }
                    }
                    if (grid[i][j] == 1 && j == 0) {
                        perimeter += 2;
                        if (j + 1 >= grid[i].length || grid[i][j + 1] == 0) {
                            perimeter += 1;
                        }
                        if (i - 1 < 0 || grid[i - 1][j] == 0) {
                            perimeter += 1;
                        }
                    }
                    if (grid[i][j] == 1 && j == (grid[i].length - 1) && grid[i].length != 1) {
                        perimeter += 2;
                        if (j - 1 < 0 || grid[i][j - 1] == 0) {
                            perimeter += 1;
                        }
                        if (i - 1 < 0 || grid[i - 1][j] == 0) {
                            perimeter += 1;
                        }
                    }
                } else {
                    if (grid[i][j] == 1 && j > 0 && j < (grid[i].length - 1)) {
                        if (j - 1 < 0 || grid[i][j - 1] == 0) {
                            perimeter += 1;
                        }
                        if (j + 1 >= grid[i].length || grid[i][j + 1] == 0) {
                            perimeter += 1;
                        }
                        if (i + 1 >= grid.length || grid[i + 1][j] == 0) {
                            perimeter += 1;
                        }
                        if (i - 1 < 0 || grid[i - 1][j] == 0) {
                            perimeter += 1;
                        }
                    }
                    if (grid[i][j] == 1 && j == 0) {
                        perimeter += 1;
                        if (j + 1 >= grid[i].length || grid[i][j + 1] == 0) {
                            perimeter += 1;
                        }
                        if (i + 1 >= grid.length || grid[i + 1][j] == 0) {
                            perimeter += 1;
                        }
                        if (i - 1 < 0 || grid[i - 1][j] == 0) {
                            perimeter += 1;
                        }
                    }
                    if (grid[i][j] == 1 && j == (grid[i].length - 1) && grid[i].length != 1) {
                        perimeter += 1;
                        if (j - 1 < 0 || grid[i][j - 1] == 0) {
                            perimeter += 1;
                        }
                        if (i + 1 >= grid.length || grid[i + 1][j] == 0) {
                            perimeter += 1;
                        }
                        if (i - 1 < 0 || grid[i - 1][j] == 0) {
                            perimeter += 1;
                        }
                    }
                }
                System.out.println("{" + i + "," + j + "} [" + grid[i][j] + "]: " + perimeter);
            }
        }
        return perimeter;
    }

}
