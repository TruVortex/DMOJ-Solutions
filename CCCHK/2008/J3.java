import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        String[] names = new String[n];
        ArrayList<Integer> nums = new ArrayList();
        for (int i = 0; i < n; i++) {
            names[i] = next();
            nums.add(nextInt());
        }
        int d = nextInt();
        int[] count = new int[n];
        for (int i = 0; i < d; i++) {
            count[nums.indexOf(nextInt())]++;
        }
        int[] temp = count.clone();
        Arrays.sort(temp);
        int max = temp[temp.length - 1];
        ArrayList<Integer> arr = new ArrayList();
        for (int i = 0; i < n; i++) {
            if (count[i] == max) {
                arr.add(nums.get(i));
            }
        }
        Collections.sort(arr);
        System.out.println(names[nums.indexOf(arr.get(0))]);
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
