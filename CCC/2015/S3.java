import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int g = nextInt();
        int p = nextInt();
        int[] planes = new int[g + 1];
        int count = 0;
        int i = 0;
        while (i < p) {
            int plane = nextInt();
            while (plane > 0 && planes[plane] > 0) {
                int t = planes[plane];
                planes[plane]++;
                plane -= t;
            }
            if (plane <= 0) {
                break;
            } else {
                planes[plane] = 1;
                count++;
            }
            i++;
        }
        System.out.println(count);
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
