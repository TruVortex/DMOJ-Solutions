import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int friendNum = nextInt();
        ArrayList<Integer> friends = new ArrayList();
        int len = nextInt();
        int[] rounds = new int[len];
        for (int i = 0; i < friendNum; i++) {
            friends.add(i + 1);
        }
        for (int i = 0; i < len; i++) {
            rounds[i] = nextInt();
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < friends.size(); j++) {
                if ((j + 1) % rounds[i] == 0) {
                    friends.set(j, 0);
                }
            }
            for (int j = 0; j < friends.size();) {
                if (friends.get(j) == 0) {
                    friends.remove(j);
                } else {
                    j++;
                }
            }
        }
        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i) != 0) {
                System.out.println(friends.get(i));
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
