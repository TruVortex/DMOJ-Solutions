import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int antennae = nextInt();
        int eyes = nextInt();
        if (antennae >= 3 && eyes <= 4) {
            System.out.println("TroyMartian");
        }
        if (antennae <= 6 && eyes >= 2) {
            System.out.println("VladSaturnian");
        }
        if (antennae <= 2 && eyes <= 3) {
            System.out.println("GraemeMercurian");
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
