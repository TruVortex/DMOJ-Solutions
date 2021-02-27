import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int year = nextInt() + 1;
        while (true) {
            String[] digits = String.valueOf(year).split("");
            Arrays.sort(digits);
            if (digits.length == 1) {
                System.out.println(year);
                break;
            }
            boolean distinct = true;
            for (int i = 1; i < digits.length; i++) {
                if (digits[i - 1].equals(digits[i])) {
                    distinct = false;
                    break;
                }
            }
            if (distinct) {
                System.out.println(year);
                break;
            }
            year++;
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
