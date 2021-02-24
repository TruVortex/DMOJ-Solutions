import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int x = nextInt();
        int y = nextInt();
        int z = nextInt();
        x = nextInt() - x;
        y = nextInt() - y;
        z = nextInt() - z;
        int dist = nextInt();
        char c = nextChar();
        int n = x - dist;
        int min = x * x + y * y + z * z;
        if (n * x < 0) {
            min = y * y + z * z;
        } else {
            min = Math.min(min, n * n + y * y + z * z);
        }
        while (c != 'E') {
            if (c == 'U') {
                x = z;
                z = -n;
            } else if (c == 'D') {
                x = -z;
                z = n;
            } else if (c == 'L') {
                x = y;
                y = -n;
            } else if (c == 'R') {
                x = -y;
                y = n;
            }
            dist = nextInt();
            c = nextChar();
            n = x - dist;
            if (n * x < 0) {
                min = Math.min(min, y * y + z * z);
            } else {
                min = Math.min(min, n * n + y * y + z * z);
            }
        }
        System.out.printf("%.2f", Math.sqrt(min));
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
