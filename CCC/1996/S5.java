import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int testCases = nextInt();
        for (int i = 0; i < testCases; i++) {
            int currentMax = 0;
            int n = nextInt();
            String[] x = nextLine().split(" ");
            String[] y = nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                int low = 0;
                int high = n - 1;
                int mid = 0;
                while (low <= high) {
                    mid = (low + high) / 2;
                    if (Integer.valueOf(y[mid]) >= Integer.valueOf(x[j])) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
                currentMax = Math.max(currentMax, mid - j);
            }
            System.out.println("The maximum distance is " + currentMax);
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
