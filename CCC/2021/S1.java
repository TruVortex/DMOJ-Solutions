import java.text.DecimalFormat;
import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        ArrayList<Integer> heights = new ArrayList();
        for (int i = 0; i <= n; i++) {
            heights.add(nextInt());
        }
        double ans = 0;
        for (int i = 0; i < n; i++) {
            ans += (heights.get(i) + heights.get(i + 1)) * nextInt();
        }
        DecimalFormat thing = new DecimalFormat("#.#");
        System.out.println(thing.format(ans / 2));
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
