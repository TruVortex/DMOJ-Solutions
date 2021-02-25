import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int students = nextInt();
        Map<Integer, Integer> friends = new HashMap();
        for (int i = 0; i < students; i++) {
            friends.put(nextInt(), nextInt());
        }
        while (true) {
            int p1 = nextInt();
            int p2 = nextInt();
            int counter = 0;
            int p1Logic = p1;
            if (p1 == 0 && p2 == 0) {
                return;
            }
            while (!(p1 == 0 && p2 == 0)) {
                if (friends.get(p1Logic) == p2) {
                    System.out.println("Yes " + counter);
                    break;
                } else if (friends.get(p1Logic) == p1) {
                    System.out.println("No");
                    break;
                } else {
                    p1Logic = friends.get(p1Logic);
                    counter++;
                }
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
