import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int x = nextInt();
            int y = nextInt();
            for (int j = 0; j < 4; j++) {
                if (isValid(x + xArr[j], y + yArr[j])) {
                    count -= isComfortable(x + xArr[j], y + yArr[j]);
                }
            }
            fieldFull[x][y] = true;
            count += isComfortable(x, y);
            for (int j = 0; j < 4; j++) {
                if (isValid(x + xArr[j], y + yArr[j])) {
                    count += isComfortable(x + xArr[j], y + yArr[j]);
                }
            }
            System.out.println(count);
        }
    }
    
    static boolean[][] fieldFull = new boolean[1001][1001];
    static int[] xArr = {-1, 1, 0, 0};
    static int[] yArr = {0, 0, -1, 1};
    
    static int isComfortable(int x, int y) {
        if (!fieldFull[x][y]) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (isValid(x + xArr[i], y + yArr[i]) && fieldFull[x + xArr[i]][y + yArr[i]]) {
                count++;
            }
        }
        return count == 3 ? 1 : 0;
    }
    
    static boolean isValid(int x, int y) {
        return x >= 0 && x < 1001 && y >= 0 && y < 1001;
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
