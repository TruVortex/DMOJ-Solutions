import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = nextInt();
        for (int k = 0; k < t; k++) {
            row = nextInt();
            col = nextInt();
            maze = new char[row][col];
            grid = new int[row][col];
            for (int i = 0; i < row; i++) {
                String str = next();
                for (int j = 0; j < col; j++) {
                    maze[i][j] = str.charAt(j);
                }
            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    grid[i][j] = 99999;
                }
            }
            traverse(0, 0, 1);
            if (grid[row - 1][col - 1] > 0 && grid[row - 1][col - 1] < 99999) {
                System.out.println(grid[row - 1][col - 1]);
            } else {
                System.out.println(-1);
            }
        }
    }

    public static char[][] maze;
    public static int[][] grid;
    public static int row, col;

    public static void traverse(int r, int c, int x) {
        if (r >= 0 && r < row && c >= 0 && c < col) {
            if (grid[r][c] >= 0 && x < grid[r][c]) {
                switch (maze[r][c]) {
                    case '*':
                        grid[r][c] = -1;
                        break;
                    case '+':
                        grid[r][c] = x;
                        traverse(r - 1, c, x + 1);
                        traverse(r + 1, c, x + 1);
                        traverse(r, c - 1, x + 1);
                        traverse(r, c + 1, x + 1);
                        break;
                    case '|':
                        grid[r][c] = x;
                        traverse(r - 1, c, x + 1);
                        traverse(r + 1, c, x + 1);
                        break;
                    case '-':
                        grid[r][c] = x;
                        traverse(r, c - 1, x + 1);
                        traverse(r, c + 1, x + 1);
                        break;
                }
            }
        }
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char nextChar() throws IOException {
        return next().charAt(0);
    }

    static String nextLine() throws IOException {
        return br.readLine().trim();
    }
}
