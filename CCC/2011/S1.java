import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int lines = nextInt();
        int t = 0;
        int s = 0;
        for (int i = 0; i < lines; i++) {
            String line = nextLine().toLowerCase();
            for (int j = 0; j < line.length(); j++) {
                if ((char) line.charAt(j) == 't') {
                    t++;
                } else if ((char) line.charAt(j) == 's') {
                    s++;
                }
            }
        }
        if (t > s) {
            System.out.println("English");  
        } else {
            System.out.println("French");
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
