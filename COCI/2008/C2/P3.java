import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        n = nextInt();
        sourFood = new int[n];
        bitterFood = new int[n];
        for (int i = 0; i < n; i++) {
            sourFood[i] = nextInt();
            bitterFood[i] = nextInt();
        }
        System.out.println(ans(1, 0, 0, 1000000001));
    }
    
    static int n;
    static int[] sourFood;
    static int[] bitterFood;
    
    static int ans(int sour, int bitter, int idx, int min) {
        if (idx == n) {
            return Math.min(min, bitter == 0 ? min : Math.abs(sour - bitter));
        } else {
            min = ans(sour, bitter, idx + 1, min);
            min = ans(sour * sourFood[idx], bitter + bitterFood[idx], idx + 1, min);
        }
        return min;
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
