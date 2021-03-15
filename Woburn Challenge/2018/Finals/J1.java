import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        ArrayList<Integer> widths = new ArrayList();
        ArrayList<Integer> people = new ArrayList();
        for (int i = 0; i < n; i++) {
            int w = nextInt();
            if (widths.contains(w)) {
                people.set(widths.indexOf(w), people.get(widths.indexOf(w)) + 1);
            } else {
                widths.add(w);
                people.add(1);
            }
        }
        Collections.sort(people);
        System.out.println((people.size() > 1 ? people.get(people.size() - 2) : 0) + people.get(people.size() - 1));
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
