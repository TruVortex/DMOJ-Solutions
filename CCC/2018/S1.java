import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int[] arr = new int[n];
        double min = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = nextInt();
        }
        Arrays.sort(arr);
        for (int i = 1; i < n - 1; i++) {
            double dist = Math.abs(arr[i] - arr[i - 1]) / 2.0 + Math.abs(arr[i] - arr[i + 1]) / 2.0;
            min = Math.min(dist, min);
        }
        System.out.println(String.format("%.1f", min));
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
