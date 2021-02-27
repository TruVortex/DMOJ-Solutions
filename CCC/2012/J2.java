import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int one = nextInt();
        int two = nextInt();
        int three = nextInt();
        int four = nextInt();
        if (one < two && two < three && three < four) {
            System.out.println("Fish Rising");
        } else if (one > two && two > three && three > four) {
            System.out.println("Fish Diving");
        } else if (one == two && two == three && three == four) {
            System.out.println("Fish At Constant Depth");
        } else{
            System.out.println("No Fish");
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
