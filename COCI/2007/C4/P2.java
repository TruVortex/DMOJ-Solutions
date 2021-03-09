import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        char[] arr1 = String.valueOf(n).toCharArray();
        Arrays.sort(arr1);
        for (int i = n + 1; i < 999999; i++) {
            char[] arr2 = String.valueOf(i).toCharArray();
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)) {
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println(0);
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
