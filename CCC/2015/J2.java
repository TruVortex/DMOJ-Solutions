import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String str = nextLine();
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals(":-)")) {
                count1++;
            } else if (str.substring(i, i + 3).equals(":-(")) {
                count2++;
            }
        }
        if (count1 == 0 && count2 == 0) {
            System.out.println("none");
        } else if (count1 > count2) {
            System.out.println("happy");
        } else if (count1 < count2) {
            System.out.println("sad");
        } else {
            System.out.println("unsure");
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
