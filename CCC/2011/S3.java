import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = nextInt();
        for (int i = 0; i < t; i++) {
            int m = nextInt();
            int x = nextInt();
            int y = nextInt();
            if (y < squaresOverX(m, x)) {
                System.out.println("crystal");
            } else {
                System.out.println("empty");
            }
        }
    }

    static int squaresOverX(int m, int x) {
        if (m == 0) {
            return 0;
        }
        int blockSide = (int) Math.pow(5, m - 1);
        int grid = x / blockSide;
        switch (grid) {
            case 0:
            case 4:
                return 0;
            case 1:
            case 3:
                return blockSide + squaresOverX(m - 1, x % blockSide);
            default:
                return blockSide * 2 + squaresOverX(m - 1, x % blockSide);
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
