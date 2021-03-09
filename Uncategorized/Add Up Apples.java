import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        n = nextInt();
        for (int i = 1; i <= n / 2; i++) {
            find(i, i, n + "=" + i);
        }
        System.out.println("total=" + ans);
    }
    
    static int n;
    static int ans = 0;

    static void find(int last, int sum, String str) {
        if (sum == n) {
            ans++;
            System.out.println(str);
            return;
        }
        for (int i = last; i + sum <= n; i++) {
            find(i, sum + i, str + "+" + i);
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
