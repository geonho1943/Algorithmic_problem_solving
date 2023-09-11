package org.problem.solving.BOJ.Java14940;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Java14940ChatGPT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];

        int startX = -1, startY = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
                if (grid[i][j] == 2) {
                    startX = i;
                    startY = j;
                }
            }
        }
        sc.close();

        int[][] distances = bfs(grid, startX, startY);

        for (int[] distanceRow : distances) {
            for (int distance : distanceRow) {
                System.out.print(distance + " ");
            }
            System.out.println();
        }
    }

    public static int[][] bfs(int[][] grid, int startX, int startY) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] distances = new int[n][m];

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(startX, startY));

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            for (int[] direction : directions) {
                int newX = current.x + direction[0];
                int newY = current.y + direction[1];

                if (isValid(grid, newX, newY, distances)) {
                    distances[newX][newY] = distances[current.x][current.y] + 1;
                    queue.add(new Point(newX, newY));
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    distances[i][j] = 0;
                } else if (grid[i][j] == 1 && distances[i][j] == 0) {
                    distances[i][j] = -1;
                }
            }
        }

        distances[startX][startY] = 0;
        return distances;
    }

    public static boolean isValid(int[][] grid, int x, int y, int[][] distances) {
        int n = grid.length;
        int m = grid[0].length;

        if (x < 0 || y < 0 || x >= n || y >= m) {
            return false;
        }

        if (grid[x][y] == 0 || distances[x][y] != 0) {
            return false;
        }

        return true;
    }
}