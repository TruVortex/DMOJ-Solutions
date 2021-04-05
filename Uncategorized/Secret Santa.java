import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> weight = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(nextInt());
            weight.add(nextInt());
        }
        System.out.println(ans(100, list, weight, true) + sum(weight) * 2);
    }
    
    static long ans(int floor, ArrayList<Integer> list, ArrayList<Integer> weight, boolean down) {
        if (list.isEmpty()) {
            return 0;
        }
        if (floor == 0 || floor == 101) {
            return Integer.MAX_VALUE;
        }
        long min = Integer.MAX_VALUE;
        if (list.contains(floor)) {
            int idx = list.indexOf(floor);
            int temp1 = list.get(idx);
            int temp2 = weight.get(idx);
            list.remove(idx);
            weight.remove(idx);
            min = Math.min(min, Math.min(ans(floor - 1, list, weight, true) + sum(weight) * 2, ans(floor + 1, list, weight, false) + sum(weight) * 2));
            list.add(idx, temp1);
            weight.add(idx, temp2);
        }
        return Math.min(min, ans(floor + (down ? -1 : 1), list, weight, down) + sum(weight));
    }
    
    static int sum(ArrayList<Integer> list) {
        int num = 0;
        for (int i : list) {
            num += i;
        }
        return num;
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
