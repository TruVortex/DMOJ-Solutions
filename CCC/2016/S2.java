import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int test = nextInt();
        int bikes = nextInt();
        int totalSpeed = 0;
        int[] speed1 = new int[bikes];
        int[] speed2 = new int[bikes];
        for (int i = 0; i < bikes; i++) {
            speed1[i] = nextInt();
        }
        for (int i = 0; i < bikes; i++) {
            speed2[i] = nextInt();
        }
        Arrays.sort(speed1);
        Arrays.sort(speed2);
        if (test == 1) {
            for (int i = 0; i < bikes; i++) {
                if (speed1[i] > speed2[i]) {
                    totalSpeed += speed1[i];
                } else {
                    totalSpeed += speed2[i];
                }
            }
        } else {
            for (int i = 0; i < bikes; i++) {
                if (speed1[i] > speed2[speed2.length - (1 + i)]) {
                    totalSpeed += speed1[i];
                } else {
                    totalSpeed += speed2[speed2.length - (1 + i)];
                }
            }
        }
        System.out.println(totalSpeed);
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
