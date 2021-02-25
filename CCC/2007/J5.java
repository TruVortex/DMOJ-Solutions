import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> motels = new ArrayList(Arrays.asList(0, 990, 1010, 1970, 2030, 2940, 3060, 3930, 4060, 4970, 5030, 5990, 6010, 7000));
        int a = nextInt();
        int b = nextInt();
        int m = nextInt();
        for (int i = 0; i < m; i++) {
            motels.add(nextInt());
        }
        long dp[] = new long[motels.size()];
        dp[0] = 1;
        Collections.sort(motels);
        for (int i = 1; i < motels.size(); i++) {
            for (int j = 0; j < i; j++) {
                int dist = motels.get(i) - motels.get(j);
                if (dist >= a && dist <= b) {
                    dp[i] += dp[j];
                }
            }
        }
        System.out.println(dp[motels.size() - 1]);
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
