import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                char[] arr = next().toCharArray();
                ArrayList<Integer> nums = new ArrayList<>();
                for (char c : arr) {
                    nums.add(c - '0');
                }
                int len = nums.size() + 1;
                for (int checkDigit = 0; checkDigit <= 9; checkDigit++) {
                    int ans = checkDigit;
                    for (int k = len - 2; k >= 0; k--) {
                        if ((len - k) % 2 == 0) {
                            ans += sum(nums.get(k) * 2);
                        } else {
                            ans += nums.get(k);
                        }
                    }
                    if (ans % 10 == 0) {
                        System.out.print(checkDigit);
                        break;
                    }
                }
            }
            System.out.println();
        }
    }

    static int sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
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
