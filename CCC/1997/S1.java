import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int a = nextInt();
        for (int cases = 0; cases < a; cases++) {
            int b = nextInt();
            int c = nextInt();
            int d = nextInt();
            String[] arr1 = new String[b];
            String[] arr2 = new String[c];
            String[] arr3 = new String[d];
            for (int i = 0; i < b; i++) {
                arr1[i] = nextLine();
            }
            for (int i = 0; i < c; i++) {
                arr2[i] = nextLine();
            }
            for (int i = 0; i < d; i++) {
                arr3[i] = nextLine();
            }
            for (int i = 0; i < b; i++) {
                for (int j = 0; j < c; j++) {
                    for (int k = 0; k < d; k++) {
                        System.out.println(arr1[i] + " " + arr2[j] + " " + arr3[k] + ".");
                    }
                }
            }
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
