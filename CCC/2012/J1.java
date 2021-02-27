import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int limit = nextInt();
        int over = nextInt() - limit;
        if (over >= 1 && over <= 20) {
            System.out.println("You are speeding and your fine is $100.");
        } else if (over >= 21 && over <= 30) {
            System.out.println("You are speeding and your fine is $270.");
        } else if (over >= 31) {
            System.out.println("You are speeding and your fine is $500.");
        } else {
            System.out.println("Congratulations, you are within the speed limit!");
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
