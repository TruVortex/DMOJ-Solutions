import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String s = nextLine();
        int newr = 0, newc = 0, movements = 0;	
        int r = 1, c = 1;
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (letter >= 'A' && letter <= 'Z') {
                int x = letter - 'A' + 1;
                newr = (x - 1) / 6 + 1;
                newc = (x - 1) % 6 + 1;	
            } else if (letter == ' ') {
                newr = 5;
                newc = 3;
            } else if (letter == '-'){
                newr = 5;
                newc = 4;
            } else if (letter == '.') {
                newr = 5;
                newc = 5;
            }
            movements = movements + Math.abs(newr - r) + Math.abs(newc - c);
            r = newr;
            c = newc;
        }
        movements = movements + Math.abs(newr - 5) + Math.abs(newc - 6);
        System.out.println(movements);
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
