import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int rows = nextInt();
        int cols = nextInt();
        int[][] sheet = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sheet[i][j] = nextInt();
            }
        }
        int n = nextInt();
        for (int i = 0; i < n; i++) {
            int col = nextInt() - 1;
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < rows - 1 - j; k++) {
                    if (sheet[k][col] > sheet[k + 1][col]) {
                        for (int l = 0; l < cols; l++) {
                            int tmp = sheet[k][l];
                            sheet[k][l] = sheet[k + 1][l];
                            sheet[k + 1][l] = tmp;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sheet[i][j] + " ");
            }
            System.out.println();
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
