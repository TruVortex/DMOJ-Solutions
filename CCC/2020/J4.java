import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String longString = next();
        String takeOut = next();
        for (int i = 0; i <= longString.length() - takeOut.length(); i++) {
            String sub = longString.substring(i, takeOut.length() + i);
            if (IsCyclicWord(takeOut, sub)) {
                System.out.println("yes");
                System.exit(0);
            }
        }
        System.out.println("no");
    }

    public static boolean IsCyclicWord(String s1, String s2) {
        return s1.length() == s2.length() && (s1 + s1).contains(s2);
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
