import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
    	int t = nextInt();
    	for (int j = 0 ; j < t ; j++) {
            int n = nextInt();
            int k = nextInt();
            String str = "";
            for (int i = 0 ; i < k ; i++) {
                str += "1";
            }
            for (int i = k; i < n ; i++) {
                str += "0";
            }
            System.out.println ("The bit patterns are ");
            int idx = k - 1;
            while (idx >= 0) {
                System.out.println(str);
                StringBuilder b = new StringBuilder(str.substring(idx + 2));
                str = str.substring(0, idx) + "01" + b.reverse();
                idx = str.lastIndexOf("10");
            }
            System.out.println(str);
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
