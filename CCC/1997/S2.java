import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        loop:
        for (int i = nextInt(); i > 0; i--) {
            ArrayList<Integer> sums = new ArrayList();
            ArrayList<Integer> diffs = new ArrayList();
            int n = nextInt();
            for (int j = 1; j <= Math.sqrt(n); j++) {
                if (n % j == 0) {
                    int m = n / j;
                    sums.add(j + m);
                    diffs.add(m - j);
                }
            }
            for (int sum : sums) {
                if (diffs.contains(sum)) {
                    System.out.println(n + " is nasty");
                    continue loop;
                }
            }
            System.out.println(n + " is not nasty");            
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
