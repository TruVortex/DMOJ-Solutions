import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        for (int i = 1000; i <= 9999; i++) {
            if (perfect(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 100; i <= 999; i++) {
            String n = String.valueOf(i);
            if (Math.pow(n.charAt(0) - '0', 3) + Math.pow(n.charAt(1) - '0', 3) + Math.pow(n.charAt(2) - '0', 3) == i) {
                System.out.print(i + " ");
            }
        }
    }
    
    static boolean perfect(int n) {
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i == Math.sqrt(n)) {
                    sum += i;
                } else {
                    sum += i;
                    sum += n / i;
                }
            }
        }
        return sum == n;
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
