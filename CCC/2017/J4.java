import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int D = nextInt();
        int ans = 31 * (D / 720);
        int time = 1200;
        for (int i = 0, size = D % 720; i < size; i++) {
            time++;
            int mins = time % 100;
            int hrs = time / 100;
            if (mins >= 60) {
                hrs++;
                mins -= 60;
            }
            if (hrs > 12) {
                hrs -= 12;
            }
            time = 100 * hrs + mins;
            if (time >= 1000) {
                int a = time / 1000;
                int b = (time % 1000) / 100;
                int c = (time % 100) / 10;
                int d = time % 10;
                if (a - b == b - c && b - c == c - d) {
                    ans++;
                }
            } else {
                int a = time / 100;
                int b = (time % 100) / 10;
                int c = time % 10;
                if (a - b == b - c) {
                    ans++;
                }
            }
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
