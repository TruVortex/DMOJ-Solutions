import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String str1 = next();
        String str2 = next();
        int counter = 0;
        int tests = str1.length();
        for (int i = 0; i < tests; i++) {
            String character = String.valueOf(str2.charAt(i));
            if (character.equals("*")) {
                counter++;
                continue;
            }
            int n = str1.length();
            str1 = str1.replaceFirst(character, "");
            if (n == str1.length()) {
                System.out.println("N");
                System.exit(0);
            }
        }
        if (counter == str1.length()) {
            System.out.println("A");
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
