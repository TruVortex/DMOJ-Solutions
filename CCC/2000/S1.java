import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int coins = nextInt();
        int a = nextInt();
        int b = nextInt();
        int c = nextInt();
        int ans = 0;
        while (coins != 0) {
            coins--;
            ans++;
            a++;
            if (a == 35) {
                a = 0;
                coins += 30;
            }
            if (coins == 0) {
                break;
            }
            coins--;
            ans++;
            b++;
            if (b == 100) {
                b = 0;
                coins += 60;
            }
            if (coins == 0) {
                break;
            }
            coins--;
            ans++;
            c++;
            if (c == 10) {
                c = 0;
                coins += 9;
            }
        }
        System.out.println("Martha plays " + ans + " times before going broke.");
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
