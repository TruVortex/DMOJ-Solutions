import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        String[] str = new String[3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                str[j] = next();
            }
            System.out.println(check(str) ? "Yes" : "No");
        }
    }
    
    public static boolean check(String str[]) {
        return !(str[0].startsWith(str[1]) || str[0].startsWith(str[2]) || str[1].startsWith(str[2]) || str[1].startsWith(str[0]) || str[2].startsWith(str[1])
                 || str[2].startsWith(str[0]) || str[0].endsWith(str[1]) || str[0].endsWith(str[2]) || str[1].endsWith(str[2]) || str[1].endsWith(str[0])
                 || str[2].endsWith(str[1]) || str[2].endsWith(str[0]));
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
