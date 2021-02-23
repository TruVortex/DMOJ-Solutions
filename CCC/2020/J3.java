import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int points = nextInt();
        int[] x = new int[points];
        int[] y = new int[points];
        for (int i = 0; i < points; i++) {
            String[] pointCoords = next().split(",");
            x[i] = Integer.parseInt(pointCoords[0]);
            y[i] = Integer.parseInt(pointCoords[1]);
        }
        Arrays.sort(x);
        Arrays.sort(y);
        System.out.println(x[0] - 1 + "," + (y[0] - 1));
        System.out.println(x[points - 1] + 1 + "," + (y[points - 1] + 1));
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
