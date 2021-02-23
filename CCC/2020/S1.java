import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer, Integer> speeds = new TreeMap();
        for (int i = 0; i < n; i++) {
            speeds.put(sc.nextInt(), sc.nextInt());
        }
        double ans = 0;
        Object[] speedTime = speeds.keySet().toArray();
        Object[] speed = speeds.values().toArray();
        for (int i = 1; i < n; i++) {
            ans = Math.max(ans, Math.abs((int) speed[i] - (int) speed[i - 1]) * 1.0 / ((int) speedTime[i] - (int) speedTime[i - 1]) * 1.0);
        }
        System.out.println(ans);
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
