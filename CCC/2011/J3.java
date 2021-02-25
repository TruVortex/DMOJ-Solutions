import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n1 = nextInt();
        int n2 = nextInt();
        int count = 2;
        while (true) {
            if (n1 >= n2 && count % 2 == 0) {
                n1 -= n2;
                count++;
                continue;
            } else if (n2 >= n1 && count % 2 == 1) {
                n2 -= n1;
                count++;
                continue;
            }
            break;
        }
        System.out.println(count);
    }

    static String n1() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static long nextLong() throws IOException {
        return Long.parseLong(n1());
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(n1());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(n1());
    }

    static char nextChar() throws IOException {
        return n1().charAt(0);
    }

    static String nextLine() throws IOException {
        return br.readLine().trim();
    }
}
