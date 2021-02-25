import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int day = nextInt();
        int eve = nextInt();
        int week = nextInt();
        double costA = 25 * (day - 100);
        double costB = 45 * (day - 250);
        if (costA < 0) {
            costA = 0;
        }
        if (costB < 0) {
            costB = 0;
        }
        costA += (15 * eve + 20 * week);
        costB += (35 * eve + 25 * week);
        costA /= 100;
        costB /= 100;
        System.out.println("Plan A costs " + costA);
        System.out.println("Plan B costs " + costB);
        if (costA > costB) {
            System.out.println("Plan B is cheapest.");
        } else if (costA < costB) {
            System.out.println("Plan A is cheapest.");
        } else {
            System.out.println("Plan A and B are the same price.");
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
