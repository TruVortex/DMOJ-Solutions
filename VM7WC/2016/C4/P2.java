import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int l = nextInt();
        ArrayList<ArrayList<String>> chars = new ArrayList();
        for (int i = 0; i < n; i++) {
            int m = nextInt();
            ArrayList<String> temp = new ArrayList();
            for (int j = 0; j < m; j++) {
                temp.add(next());
            }
            chars.add(temp);
        }
        ArrayList<String> all = new ArrayList();
        for (String str : chars.get(0)) {
            all.add(str);
        }
        for (int i = 1; i <= 25; i++) {
            if (n > i) {
                ArrayList<String> temp = new ArrayList(all);
                for (String str : chars.get(i)) {
                    for (String str2 : temp) {
                        if ((str2 + str).length() <= l) {
                            all.add(str2 + str);
                        }
                    }
                }
            }
        }
        Collections.sort(all);
        for (String str : all) {
            System.out.println(str);
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
