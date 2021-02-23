import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String str = next();
        int l = str.length() - str.replaceAll("L", "").length();
        int m = str.length() - str.replaceAll("M", "").length();
        int tmpL = l;
        int tmpM = m;
        int mInL = 0;
        int lInM = 0;
        for (int i = 0; i < l; i++) {
            if (str.charAt(i) == 'M') {
                mInL++;
            } else if (str.charAt(i) == 'L') {
                tmpL--;
            }
        }
        for (int i = l; i < l + m; i++) {
            if (str.charAt(i) == 'L') {
                lInM++;
            } else if (str.charAt(i) == 'M') {
                tmpM--;
            }
        }
        System.out.println(tmpL + tmpM - Math.min(mInL, lInM)); // why does this work; why not Math.max(...)
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
