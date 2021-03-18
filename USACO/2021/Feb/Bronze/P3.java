import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        for (int i = 0; i < n; i++) {
            char[] moves = next().toCharArray();
            int dir = 0;
            for (int j = 1; j <= moves.length; j++) {
                dir += findDir(moves[j % moves.length], moves[j - 1]);
            }
            System.out.println(dir == 360 ? "CW" : "CCW");
        }
    }

    static int findDir(char ch, char lastCh) {
        if (ch == 'N') {
            if (lastCh == 'E') {
                return -90;
            } else if (lastCh == 'W') {
                return 90;
            }
        }
        if (ch == 'E') {
            if (lastCh == 'S') {
                return -90;
            } else if (lastCh == 'N') {
                return 90;
            }
        }
        if (ch == 'S') {
            if (lastCh == 'W') {
                return -90;
            } else if (lastCh == 'E') {
                return 90;
            }
        }
        if (ch == 'W') {
            if (lastCh == 'N') {
                return -90;
            } else if (lastCh == 'S') {
                return 90;
            }
        }
        return 0;
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
