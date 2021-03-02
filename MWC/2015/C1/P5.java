import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String s1 = next().toLowerCase();
        String s2 = next().toLowerCase();
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            n1 = (n1 + qpow(s1.charAt(i) - 'a' + 1, i + 1)) % 10;
        }
        for (int i = 0; i < s2.length(); i++) {
            n2 = (n2 + qpow(s2.charAt(i) - 'a' + 1, i + 1)) % 10;
        }
        if (n1 == 0) {
            n1 = 10;
        }
        if (n2 == 0) {
            n2 = 10;
        }
        System.out.println(n1 + n2);
    }

    static int qpow(int n, int exp) {
        if (exp == 1) {
            return n;
        }
        int t = qpow(n, exp / 2);
        if (exp % 2 != 0) {
            return t * t * n % 10;
        } else {
            return t * t % 10;
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
