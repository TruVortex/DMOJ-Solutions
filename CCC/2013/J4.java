import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int time = nextInt();
        int[] tasks = new int[nextInt()];
        for (int i = 0; i < tasks.length; i++) {
            tasks[i] = nextInt();
        }
        Arrays.sort(tasks);
        int chores = 0;
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] <= time) {
                time -= tasks[i];
                chores++;
            } else {
                break;
            }
        }
        System.out.println(chores);
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
