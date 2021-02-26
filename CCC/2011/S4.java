import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 8; i++) {
            arr1[i] = nextInt();
        }
        for (int i = 0; i < 8; i++) {
            arr2[i] = nextInt();
        }
        System.out.println(get(0, 0) + get(1, 1) + get(0, 1) + get(2, 2) + get(0, 2) + get(4, 4) + get(0, 4) + get(3, 3) + get(2, 3) + get(1, 3) + get(0, 3) + get(5, 5)
                + get(4, 5) + get(1, 5) + get(0, 5) + get(6, 6) + get(4, 6) + get(2, 6) + get(0, 6) + get(7, 7) + get(6, 7) + get(5, 7) + get(4, 7) + get(3, 7) + get(2, 7)
                + get(1, 7) + get(0, 7));
    }

    static int[] arr1 = new int[8];
    static int[] arr2 = new int[8];

    static int get(int n1, int n2) {
        int min = Math.min(arr1[n1], arr2[n2]);
        arr1[n1] -= min;
        arr2[n2] -= min;
        return min;
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
