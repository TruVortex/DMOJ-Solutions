import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        while (n != 0) {
            int[] arr = new int[n - 1];
            int a = nextInt();
            for (int i = 0; i < n - 1; i++) {
                int b = nextInt();
                arr[i] = b - a;
                a = b;
            }
            if (arr.length == 0) {
                System.out.println(0);
                n = nextInt();
                continue;
            }
            int i = 1;
            loop:
            for (; i < arr.length; i++) {
                for (int j = i; j < arr.length; j++) {
                    if (arr[j - i] != arr[j]) {
                        continue loop;
                    }
                }
                break;
            }
            System.out.println(i);
            n = nextInt();
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
