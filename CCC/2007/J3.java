import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int casesOpened = nextInt();
        int[] money = {100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000};
        for (int i = 0; i < casesOpened; i++) {
            money[nextInt() - 1] = 0;
        }
        int average = (money[0] + money[1] + money[2] + money[3] + money[4] + money[5] + money[6] + money[7] + money[8] + money[9]) / (10 - casesOpened);
        if (average > nextInt()) {
            System.out.println("no deal");
        } else {
            System.out.println("deal");
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
