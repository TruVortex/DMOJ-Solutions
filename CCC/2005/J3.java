import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String[] arr = new String[5];
        String[] arr2 = new String[5];
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = next();
            arr2[i] = next();
            if (arr2[i].equals("SCHOOL")) {
                break;
            }
            cnt++;
        }
        for (int i = 0; i <= cnt; i++) {
            if (arr[i].equals("R")) {
                arr[i] = "LEFT";
            } else {
                arr[i] = "RIGHT";
            }
        }
        for (int i = cnt - 1; i >= 0; i--) {
            System.out.println("Turn " + arr[i + 1] + " onto " + arr2[i] + " street.");
        }
        System.out.println("Turn " + arr[0] + " into your HOME.");
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
