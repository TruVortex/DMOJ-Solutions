import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        while (true) {
            String str = next();
            if ("CU".equals(str)) {
                System.out.println("see you");
            } else if (":-)".equals(str)) {
                System.out.println("I'm happy");
            } else if (":-(".equals(str)) {
                System.out.println("I'm unhappy");
            } else if (";-)".equals(str)) {
                System.out.println("wink");
            } else if (":-P".equals(str)) {
                System.out.println("stick out my tongue");
            } else if ("(~.~)".equals(str)) {
                System.out.println("sleepy");
            } else if ("TA".equals(str)) {
                System.out.println("totally awesome");
            } else if ("CCC".equals(str)) {
                System.out.println("Canadian Computing Competition");
            } else if ("CUZ".equals(str)) {
                System.out.println("because");
            } else if ("TY".equals(str)) {
                System.out.println("thank-you");
            } else if ("YW".equals(str)) {
                System.out.println("you're welcome");
            } else if ("TTYL".equals(str)) {
                System.out.println("talk to you later");
                break;
            } else {
                System.out.println(str);
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
