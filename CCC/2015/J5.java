import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int k = nextInt();
        System.out.println(pi(n - k, k));
    }
    
    static int[][] arr = new int[250][250];
    
    static int pi(int n, int k) {
        if (n < 0 || (k == 0 && n != 0)) {
            return 0;
        } else if (n == 0 && k != 0) {
            return 1;
        } else if (arr[n][k] != 0) {
            return arr[n][k];
        }
        return arr[n][k] = pi(n, k - 1) + pi(n - k, k);
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
