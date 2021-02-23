import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int p = nextInt();
        int g = nextInt();
        int r = nextInt();
        int o = nextInt();
        int m = nextInt();
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= m / p; i++) {
            for (int j = 0; j <= m / g; j++) {
                for (int k = 0; k <= m / r; k++) {
                    for (int l = 0; l <= m / o; l++) {
                        if (i * p + j * g + k * r + l * o == m) {
                            if (min > i + j + k + l) {
                                min = i + j + k + l;
                            }
                            System.out.println("# of PINK is "+ i + " # of GREEN is "+ j + " # of RED is "+ k + " # of ORANGE is "+ l);
                            sum++;
                        }
                    }
                }
            }
        }
        System.out.println("Total combinations is "+ sum + ".");
        System.out.println("Minimum number of tickets to print is "+ min + ".");
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
