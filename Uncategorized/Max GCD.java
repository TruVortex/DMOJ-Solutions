import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = nextInt();
        }
        int[] gcdBefore = new int[n + 1];
        int[] gcdAfter = new int[n + 1];
        gcdBefore[1] = arr[1];
        gcdAfter[n] = arr[n];
        for (int i = 2; i <= n; i++) {
            gcdBefore[i] = gcd(gcdBefore[i - 1], arr[i]);
            gcdAfter[n - i + 1] = gcd(gcdAfter[n - i + 2], arr[n - i + 1]);
        }
        gcdAfter[0] = gcdAfter[1];
        int gcd = 0;
        for (int i = 1; i < n; i++) {
            gcd = Math.max(gcd, gcd(gcdBefore[i - 1], gcdAfter[i + 1]));
        }
        System.out.println(gcd);
    }

    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
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
