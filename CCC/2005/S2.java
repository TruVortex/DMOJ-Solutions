import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int c = nextInt();
        int r = nextInt();
        int a = nextInt();
        int b = nextInt();
        int x = 0;
        int y = 0;
        while (a != 0 || b != 0) {
            x = Math.max(0, Math.min(c, x + a));
            y = Math.max(0, Math.min(r, y + b));
            System.out.println(x + " " + y);
            a = nextInt();
            b = nextInt();
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
