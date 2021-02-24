import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int k = nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];
        Arrays.fill(arr1, 1);
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                arr2[j] += nextInt();
            }
            for (int j = 0; j < n; j++) {
                int m = 1;
                for (int kk = 0; kk < n; kk++) {
                    if (arr2[kk] > arr2[j]) {
                        m++;
                    }
                }
                if (m > arr1[j]) {
                    arr1[j] = m;
                }
                arr3[j] = m;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr3[i] == 1) {
                System.out.println("Yodeller " + (i + 1) + " is the TopYodeller: score " + arr2[i] + ", worst rank " + arr1[i]);
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
