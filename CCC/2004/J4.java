import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String key = nextLine();
        String code = nextLine().replaceAll("[^a-zA-Z]", "");
        int itr = 0;
        for (int i = 0; i < code.length(); i++) {
            int n = (int) code.charAt(i) - (int) 'A' + (int) key.charAt(itr);
            if (n > (int) 'Z') {
                n = (int) 'A' + n - (int) 'Z' - 1;
            }
            System.out.print((char) n);
            itr++;
            if (itr > key.length() - 1) {
                itr = 0;
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
