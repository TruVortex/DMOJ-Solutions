import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        boolean[][] adj = new boolean[26][26];
        String[] roads = new String[1000];
        String str = next();
        int a, b;
        int n = 0;
        int count = 0;
        while (!str.equals("**")) {
            roads[n++] = str;
            str = next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 26; j++) {
                for (int k = 0; k < 26; k++) {
                    if (j == k) {
                        adj[j][k] = true;
                    } else {
                        adj[j][k] = false;
                    }
                }
            }
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    a = roads[j].charAt (0) - 'A';
                    b = roads[j].charAt (1) - 'A';
                    adj[a][b] = true;
                    adj[b][a] = true;
                }
            }
            function(adj);
            if (!adj[0][1]) {
                System.out.println(roads[i]);
                count++;
            }
        }
        System.out.println ("There are " + count + " disconnecting roads.");
    }
    
    public static void function(boolean[][] arr) {
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                if (arr[j][i]) {
                    for (int k = 0 ; k < 26 ; k++) {
                        if (arr[i][k]) {
                            arr[j][k] = true;
                        }
                    }
                }
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
