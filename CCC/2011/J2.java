import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int humidity = nextInt();
        int time = nextInt();
        for (int i = 1; i <= time; i++) {
            if (-6 * Math.pow(i, 4) + humidity * Math.pow(i, 3) + 2 * Math.pow(i, 2) + i <= 0) {
                System.out.println("The balloon first touches ground at hour:\n" + i);
                break;
            } else if (i == time) {
                System.out.println("The balloon does not touch ground in the given time.");
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
