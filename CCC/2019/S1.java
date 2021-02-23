import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        char[] flips = next().toCharArray();
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        for (int i = 0; i < flips.length; i++) {
            if (flips[i] == 'H') {
                int temp = one;
                one = three;
                three = temp;
                temp = two;
                two = four;
                four = temp;
            } else {
                int temp = one;
                one = two;
                two = temp;
                temp = three;
                three = four;
                four = temp;
            }
        }
        System.out.println(one + " " + two + "\n" + three + " " + four);
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
