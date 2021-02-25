import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int a = nextInt();
        int b = nextInt();
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (isRsa(i)) {
                cnt++;
            }
        }
        System.out.println("The number of RSA numbers between " + a + " and " + b + " is " + cnt);
    }
    
    static boolean isRsa(int n) {
        int factors = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors++;
            }
        }
        return factors == 4;
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
