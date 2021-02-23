import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        TreeMap<Integer, String> auctions = new TreeMap();
        for (int i = 0; i < n; i++) {
            String str = next();
            int m = nextInt();
            if (!auctions.containsKey(m)) {
                auctions.put(m, str);
            }
        }
        System.out.println(auctions.values().toArray()[auctions.values().toArray().length - 1]); // creating an array of the auction values would be smart
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
