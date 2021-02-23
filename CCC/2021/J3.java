import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String last = "";
        while (true) {
            String str = next();
            if (str.equals("99999")) {
                break;
            }
            if (Integer.valueOf(str.substring(0, 1)) + Integer.valueOf(str.substring(0, 2)) == 0) {
                System.out.println(last + str.substring(2));
            } else if ((Integer.valueOf(str.substring(0, 1)) + Integer.valueOf(str.substring(0, 2))) % 2 == 0) {
                last = "right ";
                System.out.println(last + str.substring(2));
            } else {
                last = "left ";
                System.out.println(last + str.substring(2));
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
