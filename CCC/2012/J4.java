import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int shift = nextInt();
        String word = next();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] letters = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            int charPosition = alphabet.indexOf(letters[i]) - 3 * (i + 1) - shift;
            while (charPosition < 0) {
                charPosition += 26;
            }
            System.out.print(alphabet.charAt(charPosition));
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
