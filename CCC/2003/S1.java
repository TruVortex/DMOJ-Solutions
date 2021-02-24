import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int place = 1;
        while (true) {
            int n = nextInt();
            if (n != 0) {
                if (place + n <= 100) {
                    place += n;
                }
                switch (place) {
                    case 9:
                        place = 34;
                        break;
                    case 40:
                        place = 64;
                        break;
                    case 67:
                        place = 86;
                        break;
                    case 99:
                        place = 77;
                        break;
                    case 90:
                        place = 48;
                        break;
                    case 54:
                        place = 19;
                        break;
                }
                System.out.println("You are now on square " + place);
            }
            if (n == 0 || place == 100) {
                break;
            }
        }
        if (place == 100) {
            System.out.println("You Win!");
        } else {
            System.out.println("You Quit!");
        }
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
