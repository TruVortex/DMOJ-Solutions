import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        ArrayList<Double> list = new ArrayList();
        while (n-- != 0) {
            list.add((double) nextInt());
        }
        int x = nextInt();
        while (x != 77) {
            if (x == 88) {
                int a = nextInt() - 1;
                list.set(a, list.get(a) + list.get(a + 1));
                list.remove(a + 1);
            } else if (x == 99) {
                int a = nextInt() - 1;
                double b = (double) nextInt();
                list.add(a + 1, list.get(a) * (100 - b) / 100.0);
                list.set(a, list.get(a) * (b / 100.0));
            }
            x = nextInt();
        }
        list.forEach((i) -> { // fancy lambda just because
            System.out.print(Math.round(i) + " ");
        });
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
