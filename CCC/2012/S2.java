import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String[] nums = next().split("");
        String roman = "IVXLCDM";
        int sum = 0;
        for (int i = 1; i < nums.length; i += 2) {
            boolean negative = false;
            if (i != nums.length - 1 && roman.indexOf(nums[i]) < roman.indexOf(nums[i + 2])) {
                negative = true;
            }
            int num = Integer.valueOf(nums[i - 1]);
            switch (roman.indexOf(nums[i])) {
                case 0:
                    if (negative == false) {
                        sum += num;
                    } else {
                        sum -= num;
                    }
                    break;
                case 1:
                    if (negative == false) {
                        sum += num * 5;
                    } else {
                        sum -= num * 5;
                    }
                    break;
                case 2:
                    if (negative == false) {
                        sum += num * 10;
                    } else {
                        sum -= num * 10;
                    }
                    break;
                case 3:
                    if (negative == false) {
                        sum += num * 50;
                    } else {
                        sum -= num * 50;
                    }
                    break;
                case 4:
                    if (negative == false) {
                        sum += num * 100;
                    } else {
                        sum -= num * 100;
                    }
                    break;
                case 5:
                    if (negative == false) {
                        sum += num * 500;
                    } else {
                        sum -= num * 500;
                    }
                    break;
                case 6:
                    if (negative == false) {
                        sum += num * 1000;
                    } else {
                        sum -= num * 1000;
                    }
                    break;
            }
        }
        System.out.println(sum);
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
