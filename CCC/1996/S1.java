import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int cases = nextInt();
        for (int i = 0; i < cases; i++) {
            int num = nextInt();
            int sum = 0;
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    sum += j;
                }
            }
            int dnum = num * 2;
            if (dnum > sum) {
                System.out.println(num + " is a deficient number.");
            } else if (dnum < sum) {
                System.out.println(num + " is an abundant number.");
            } else {
                System.out.println(num + " is a perfect number.");
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
