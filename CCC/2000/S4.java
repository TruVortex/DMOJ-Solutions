import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int d = nextInt();
        int c = nextInt();
        int[] club = new int[c + 1];
        int[] dist = new int[5400];
        for (int i = 0; i < d + 1; i++) {
            dist[i] = 1000000;
        }
        for (int i = 0; i < c; i++) {
            club[i] = nextInt();
            dist[club[i]] = 1;
        }
        for (int i = 0; i < d; i++) {
            if ((dist[i] ^ 1000000) != 0) {
                for (int j = 0; j < c; j++) {
                    if (dist[i] + 1 < dist[i + club[j]]) {
                        dist[i + club[j]] = dist[i] + 1;
                    }
                }
            }
        }
        if (dist[d] == 1000000) {
            System.out.println("Roberta acknowledges defeat.");
        } else {
            System.out.println("Roberta wins in " + dist[d] + " strokes.");
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
