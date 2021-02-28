import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int a = 0;
        int b = 0;
        String[] deck = new String[52];
        for (int i = 0; i < 52; i++) {
            deck[i] = next();
        }
        for (int i = 0; i < 52; i++) {
            int num = 0;
            switch (deck[i]) {
                case "jack":
                    num = 1;
                    break;
                case "queen":
                    num = 2;
                    break;
                case "king":
                    num = 3;
                    break;
                case "ace":
                    num = 4;
                    break;
            }
            int j = i + 1;
            for (; j <= i + num; j++) {
                if (j >= 52) {
                    break;
                }
                if (deck[j].equals("jack") || deck[j].equals("queen") || deck[j].equals("king") || deck[j].equals("ace")) {
                    break;
                }
            }
            if (j == i + num + 1 && num != 0) {
                if (i % 2 == 0) {
                    System.out.println("Player A scores " + num + " point(s).");
                    a += num;
                } else {
                    System.out.println("Player B scores " + num + " point(s).");
                    b += num;
                }
            }
        }
        System.out.println("Player A: " + a + " point(s).");
        System.out.println("Player B: " + b + " point(s).");
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
