import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt(), size, newSize;
        int[][] hand, newHand;
        for (int i = 0; i < n; i++) {
            newHand = new int[1][4];
            newHand[0][0] = nextInt();
            newHand[0][1] = nextInt();
            newHand[0][2] = nextInt();
            newHand[0][3] = nextInt();
            newSize = 1;
            for (int k = 4; k > 1; k--) {
                size = newSize;
                hand = newHand;
                newHand = new int[10000][3];
                newSize = 0;
                for (int j = 0; j < size; j++) {
                    newSize = doOperations(hand[j], k, newHand, newSize);
                }
            }
            size = newSize;
            int biggest = 0;
            for (int j = 0; j < size && biggest < 24; j++) {
                if (newHand[j][0] > biggest && newHand[j][0] <= 24) {
                    biggest = newHand[j][0];
                }
            }
            System.out.println(biggest);
        }
    }

    public static int doOperations(int[] hand, int handSize, int[][] newHand, int k) {
        for (int i = 0; i < handSize; i++) {
            for (int j = 0; j < handSize; j++) {
                if (i != j) {
                    newHand[k][0] = hand[i] + hand[j];
                    int q = 1;
                    for (int p = 0; p < handSize; p++) {
                        if (!(p == i || p == j)) {
                            newHand[k][q++] = hand[p];
                        }
                    }
                    k++;
                    newHand[k][0] = hand[i] - hand[j];
                    q = 1;
                    for (int p = 0; p < handSize; p++) {
                        if (!(p == i || p == j)) {
                            newHand[k][q++] = hand[p];
                        }
                    }
                    k++;
                    newHand[k][0] = hand[i] * hand[j];
                    q = 1;
                    for (int p = 0; p < handSize; p++) {
                        if (!(p == i || p == j)) {
                            newHand[k][q++] = hand[p];
                        }
                    }
                    k++;
                    if (hand[j] != 0 && hand[i] % hand[j] == 0) {
                        newHand[k][0] = hand[i] / hand[j];
                        q = 1;
                        for (int p = 0; p < handSize; p++) {
                            if (!(p == i || p == j)) {
                                newHand[k][q++] = hand[p];
                            }
                        }
                        k++;
                    }
                }
            }
        }
        return k;
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
