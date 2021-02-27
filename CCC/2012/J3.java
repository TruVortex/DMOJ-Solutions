import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int multiply = nextInt();
        String icon = "*x*"
                     + " xx"
                     + "* *";
        for (int i = 0; i < multiply; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < multiply; k++) {
                    System.out.print(icon.charAt(j));
                }
            }
            System.out.println();
        }
        for (int i = 0; i < multiply; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < multiply; k++) {
                    System.out.print(icon.charAt(j + 3));
                }
            }
            System.out.println();
        }
        for (int i = 0; i < multiply; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < multiply; k++) {
                    System.out.print(icon.charAt(j + 6));
                }
            }
            System.out.println();
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
