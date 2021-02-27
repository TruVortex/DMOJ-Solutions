import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int[] count = new int[100001];
        int[] height = new int[100001];
        int num1, num2;
        int temp = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            count[nextInt()]++;
        }
        for (int i = 1; i <= 2000; i++) {
            for (int j = i; j <= 2000; j++) {
                num1 = i + j;
                if (i == j) {
                    num2 = count[i] >> 1;
                } else {
                    num2 = Math.min(count[i], count[j]);
                }
                height[num1] += num2;
            }
        }
        for (int i = 0; i < 4002; i++) {
            if (height[i] == temp) {
                cnt++;
            }
            if (height[i] > temp) {
                temp = height[i];
                cnt = 1;
            }
        }
        System.out.println(temp + " " + cnt);
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
