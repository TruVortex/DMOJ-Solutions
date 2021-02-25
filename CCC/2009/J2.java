import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int troutPoints = nextInt();
        int pikePoints = nextInt();
        int pickerelPoints = nextInt();
        int total = nextInt();
        int count = 0;
        for (int i = 0; i <= total / pickerelPoints + 1; i++) {
            for (int j = 0; j <= total / pikePoints + 1; j++) {
                for (int k = 0; k <= total / troutPoints + 1; k++) {
                    if ((i > 0 || j > 0 || k > 0) && (i * pickerelPoints + j * pikePoints + k * troutPoints <= total)) {
                        count++;
                        System.out.println(k + " Brown Trout, " + j + " Northern Pike, " + i + " Yellow Pickerel");
                    }
                }
            }
        }
        System.out.println("Number of ways to catch fish: " + count);
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
