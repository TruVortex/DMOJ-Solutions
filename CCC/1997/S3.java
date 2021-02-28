import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        for (int i = nextInt(); i > 0; i--) {
            int a = nextInt();
            int b = 0;
            int c = 0;
            int round = 0;
            while (b != 1 || a != 1) {
                System.out.println("Round " + round + ": " + a + " undefeated, " + b + " one-loss, " + c + " eliminated");
                c += b / 2;
                b = (int) Math.ceil(b / 2.0);
                b += a / 2;
                a = (int) Math.ceil(a / 2.0);
                round++;
            }
            System.out.println("Round " + round + ": " + a + " undefeated, " + b + " one-loss, " + c + " eliminated");
            a--;
            b++;
            round++;
            System.out.println("Round " + round + ": " + a + " undefeated, " + b + " one-loss, " + c + " eliminated");
            b--;
            c++;
            round++;
            System.out.println("Round " + round + ": " + a + " undefeated, " + b + " one-loss, " + c + " eliminated");
            System.out.println("There are " + round + " rounds.");
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
