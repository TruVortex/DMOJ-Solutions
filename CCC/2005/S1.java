import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int cases = nextInt();
        for (int i = 0; i < cases; i++) {
            String phone = next().replaceAll("-", "").substring(0, 10);
            phone = phone.replaceAll("[ABC]", "2");
            phone = phone.replaceAll("[DEF]", "3");
            phone = phone.replaceAll("[GHI]", "4");
            phone = phone.replaceAll("[JKL]", "5");
            phone = phone.replaceAll("[MNO]", "6");
            phone = phone.replaceAll("[PQRS]", "7");
            phone = phone.replaceAll("[TUV]", "8");
            phone = phone.replaceAll("[WXYZ]", "9");
            System.out.println(phone.substring(0, 3) + "-" + phone.substring(3, 6) + "-" + phone.substring(6, 10));
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
