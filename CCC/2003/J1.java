import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = nextInt();
        int s = nextInt();
        int h = nextInt();
        for (int i = 0; i < t; i++) {
            System.out.print("*");
            for (int j = 0; j < s; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < s; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < 2 * s + 3; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= s; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
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
