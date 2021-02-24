import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int m = nextInt();
        String[] adj = new String[n];
        String[] noun = new String[m];
        for (int i = 0; i < n; i++) {
            adj[i] = next();
        }
        for (int i = 0; i < m; i++) {
            noun[i] = next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(adj[i] + " as " + noun[j]);
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
