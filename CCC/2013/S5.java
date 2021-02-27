import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int cost = 0;
        while (n > 1) {
            int r = (int) (Math.sqrt(n)) + 1;
            int f = 2;
            while (f <= r && n % f != 0) {
                f++;
            }
            if (f < n && n % f == 0) {
                int x = n / f;
                n -= x;
                cost += n / x;
            } else {
                n--;
                cost += n;
            }
        }
        System.out.println(cost);
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
