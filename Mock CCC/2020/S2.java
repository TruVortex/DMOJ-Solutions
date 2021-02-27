import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = nextInt();
            }
        }
        int ans = 0;
        ArrayList<String> list = new ArrayList();
        for (int i = 0; i < n; i++) {
            if (arr[0][i] == 1) {
                ans++;
                list.add("C " + (i + 1));
                for (int j = 0; j < n; j++) {
                    arr[j][i] ^= 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == 1) {
                ans++;
                list.add("R " + (i + 1));
                for (int j = 0; j < n; j++) {
                    arr[i][j] ^= 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(ans);
        for (String move : list) {
            System.out.println(move);
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
