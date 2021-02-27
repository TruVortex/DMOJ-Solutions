import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int m = nextInt();
        int[] arr1 = new int[101];
        int[] arr2 = new int[101];
        int time = 0;
        boolean flag = false;
        for (int i = 0; i < m; i++) {
            char c = nextChar();
            int x = nextInt();
            switch (c) {
                case 'R':
                    if (!flag) {
                        time++;
                    }
                    flag = false;
                    arr1[x] = time;
                    break;
                case 'S':
                    if (!flag) {
                        time++;
                    }
                    flag = false;
                    arr2[x] += time - arr1[x];
                    arr1[x] = 0;
                    break;
                default:
                    time += x;
                    flag = true;
                    break;
            }
        }
        for (int i = 1; i < arr2.length; i++) {
            if (arr1[i] != 0) {
                System.out.printf("%d -1\n", i);
            } else {
                if (arr2[i] != 0) {
                    System.out.printf("%d %d\n", i, arr2[i]);
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
