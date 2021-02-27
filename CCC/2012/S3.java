import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int[] mode1 = new int[1001];
        int[] mode2 = new int[1001];
        for (int i = nextInt(); i > 0; i--) {
            int r = nextInt();
            mode1[r]++;
            mode2[r]++;
        }
        Arrays.sort(mode1);
        int first = mode1[1000];
        int second = mode1[999];
        if (first == second) {
            ArrayList<Integer> list = new ArrayList();
            for (int i = 1; i <= 1000; i++) {
                if (mode2[i] == first) {
                    list.add(i);
                }
            }
            System.out.println(list.get(list.size() - 1) - list.get(0));
        } else {
            ArrayList<Integer> list = new ArrayList();
            int n = 0;
            for (int i = 1; i <= 1000; i++) {
                if (mode2[i] == first) {
                    n = i;
                } else if (mode2[i] == second) {
                    list.add(i);
                }
            }
            int n1 = Math.abs(n - list.get(0));
            int n2 = Math.abs(n - list.get(list.size() - 1));
            if (n1 >= n2) {
                System.out.println(n1);
            } else {
                System.out.println(n2);
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
