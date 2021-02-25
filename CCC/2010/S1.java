import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        if (n > 1) {
            ArrayList<String> names = new ArrayList();
            ArrayList<Integer> RAM = new ArrayList();
            ArrayList<Integer> CPU = new ArrayList();
            ArrayList<Integer> memory = new ArrayList();
            for (int i = 0; i < n; i++) {
                names.add(next());
                RAM.add(nextInt());
                CPU.add(nextInt());
                memory.add(nextInt());
            }
            int best = 0;
            int best2 = 1;
            for (int i = 1; i < n; i++) {
                int performance = 2 * RAM.get(i) + 3 * CPU.get(i) + memory.get(i);
                int bestPerformance = 2 * RAM.get(best) + 3 * CPU.get(best) + memory.get(best);
                int bestPerformance2 = 2 * RAM.get(best2) + 3 * CPU.get(best2) + memory.get(best2);
                if (performance > bestPerformance) {
                    best2 = best;
                    best = i;
                } else if (performance == bestPerformance && names.get(i).compareTo(names.get(best)) < 0) {
                    best2 = best;
                    best = i;
                } else if (performance > bestPerformance2) {
                    best2 = i;
                }
                if (performance == bestPerformance2 && !names.get(i).equals(names.get(best))) {
                    if (names.get(i).compareTo(names.get(best2)) < 0) {
                        best2 = i;
                    }
                }
            }
            System.out.println(names.get(best) + "\n" + names.get(best2));
        } else if (n == 1) {
            System.out.println(next());
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
