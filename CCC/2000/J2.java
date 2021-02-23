import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int m = nextInt();
        int count = 0;
        for (int i = n; i <= m; i++) {
            if (isRotatable(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isRotatable(int n) {
        int[] arr = new int[7];
        int i = 0;
        while (n != 0) {
            i++;
            arr[i] = n % 10;
            n /= 10;
        }
        boolean flag = true;
        for (int j = 1; j <= i; j++) {
            if (!((arr[j] == 0 && arr[i - j + 1] == 0) || (arr[j] == 1 && arr[i - j + 1] == 1) || (arr[j] == 8 && arr[i - j + 1] == 8) || (arr[j] == 9 && arr[i - j + 1] == 6) || (arr[j] == 6 && arr[i - j + 1] == 9))) {
                flag = false;
                break;
            }
        }
        return flag;
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
