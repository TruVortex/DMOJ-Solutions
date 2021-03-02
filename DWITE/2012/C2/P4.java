import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        for (int cases = 0; cases < 5; cases++) {
            int n = nextInt();
            int[] cards = new int[n];
            boolean possible = true;
            ArrayList<Integer> cardList = new ArrayList();
            for (int i = n; i > 0; i--) {
                cardList.add(i);
            }
            for (int i = 0; i < n; i++) {
                int x = nextInt();
                if (cardList.size() - x <= 0) {
                    possible = false;
                    break;
                }
                cards[i] = cardList.get(x);
                cardList.remove(x);
            }
            if (possible) {
                for (int card : cards) {
                    System.out.print(card + " ");
                }
                System.out.println();
            } else {
                System.out.println("IMPOSSIBLE");
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
