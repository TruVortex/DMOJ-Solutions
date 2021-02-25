import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int peopleNum = nextInt();
        int[] people = new int[peopleNum];
        for (int i = 0; i < peopleNum; i++) {
            people[i] = 1;
        }
        for (int i = 0; i < peopleNum - 1; i++) {
            int invitation = nextInt();
            people[invitation - 1] *= (people[i] + 1);
        }
        System.out.println(people[peopleNum - 1]);
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
