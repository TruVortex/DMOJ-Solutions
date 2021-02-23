import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int m = nextInt();
        int n = nextInt();
        String[] names = new String[n];
        int[] time = new int[n];
        for (int i = 0; i < n; i++) {
            names[i] = nextLine();
            time[i] = nextInt();
        }
        int[] best = new int[n + 1];
        int[] group = new int[n + 1];
        Arrays.fill(best, 1000000);
        Arrays.fill(group, -1);
        best[0] = 0;
        group[0] = 0;
        for (int i = 0; i < n + 1; i++) {
            int cur = 0;
            for (int j = 1; j <= m && i + j - 1 < n; j++) {
                cur = Math.max(cur, time[i + j - 1]);
                if (best[i] + cur < best[i + j]) {
                    best[i + j] = best[i] + cur;
                    group[i + j] = j;
                }
            }
        }
        System.out.println("Total Time: " + best[n]);
        int[] lines = new int[n + 1];
        int k = n;
        int x = 0;
        while (group[k] != 0) {
            lines[x++] = group[k];
            k = k - group[k];
        }
        int z = 0;
        for (int i = x - 1; i >= 0; i--) {
            for (int j = 0; j < lines[i]; j++) {
                System.out.print(names[z++] + " ");
            }
            System.out.println();
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
