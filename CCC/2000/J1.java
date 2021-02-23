import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int a = nextInt();
        int b = nextInt();
        System.out.println("Sun Mon Tue Wed Thr Fri Sat");
        for (int c = 4 * (a - 1); c > 0; c--) {
            System.out.print(" ");
        }
        String ans = "";
        for (int c = 1; c <= b; c++, a++) {
            if (a == 8) {
                System.out.println(ans.replaceAll("\\s+$", ""));
                ans = "";
                a = 1;
            }
            if (c <= 9) {
                ans += "  " + String.valueOf(c) + " ";
            } else {
                ans += " " + String.valueOf(c) + " ";
            }
        }
        System.out.print(ans.replaceAll("\\s+$", "") + "\n");
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
