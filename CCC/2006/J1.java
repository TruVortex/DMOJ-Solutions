import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int[] burger = {461, 431, 420, 0};
        int[] side = {100, 57, 70, 0};
        int[] drink = {130, 160, 118, 0};
        int[] dessert = {167, 266, 75, 0};
        System.out.print("Your total Calorie count is " + (burger[nextInt() - 1] + side[nextInt() - 1] + drink[nextInt() - 1] + dessert[nextInt() - 1]) + ".");
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
