import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        long n = nextLong();
        if (n == 1000000000000000000L) {
            n--;
        }
        TreeSet<Long> nums = new TreeSet(Arrays.asList(2L, 3L));
        for (int i = 1; i < String.valueOf(n).length(); i++) {
            ArrayList<Long> temp = new ArrayList(nums);
            for (long m : temp) {
                nums.add(m * 10 + 2);
            }
            for (long m : temp) {
                nums.add(m * 10 + 3);
            }
        }
        int idx = nums.size();
        Object[] numsArr = nums.toArray();
        while (Long.valueOf(String.valueOf(numsArr[--idx])) > n) {}
        System.out.println(idx + 1);
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
