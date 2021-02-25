import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 31; i++) {
            for (int j = 0; j < 31; j++) {
                for (int k = 0; k < 31; k++) {
                    for (int l = 0; l < 31; l++) {
                        winningPosition[i][j][k][l] = false;
                    }
                }
            }
        }
        for (int i = 0; i < 31; i++) {
            for (int j = 0; j < 31; j++) {
                for (int k = 0; k < 31; k++) {
                    for (int l = 0; l < 31; l++) {
                        for (int m = 0; m < 5; m++) {
                            if (loosingPosition(i - moves[m][0], j - moves[m][1], k - moves[m][2], l - moves[m][3])) {
                                winningPosition[i][j][k][l] = true;
                            }
                        }
                    }
                }
            }
        }
        int n = nextInt();
        for (int i = 0; i < n; i++) {
            if (winningPosition[nextInt()][nextInt()][nextInt()][nextInt()]) {
                System.out.println("Patrick");
            } else {
                System.out.println("Roland");
            }
        }
    }
    
    static boolean[][][][] winningPosition = new boolean[31][31][31][31];
    static int[][] moves = {{2, 1, 0, 2}, {1, 1, 1, 1}, {0, 0, 2, 1}, {0, 3, 0, 0}, {1, 0, 0, 1}};

    static boolean loosingPosition(int a, int b, int c, int d) {
        if (a < 0 || b < 0 || c < 0 || d < 0) {
            return false;
        } else {
            return !winningPosition[a][b][c][d];
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
