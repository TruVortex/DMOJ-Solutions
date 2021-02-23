import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int m = nextInt();
        int n = nextInt();
        int k = nextInt();
        int[] col = new int[n];
        int[] row = new int[m];
        int oddC = 0;
        int evenC = 0;
        int oddR = 0;
        int evenR = 0;
        for (int i = 0; i < k; i++) {
            if (next().equals("R")) {
                row[nextInt() - 1]++;
            } else {
                col[nextInt() - 1]++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (col[i] % 2 == 0) {
                evenC++;
            } else {
                oddC++;
            }
        }
        for (int i = 0; i < m; i++) {
            if (row[i] % 2 == 0) {
                evenR++;
            } else {
                oddR++;
            }
        }        
        System.out.println(oddC * evenR + evenC * oddR);
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
