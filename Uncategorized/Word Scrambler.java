import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        char[] arr = next().toCharArray();
        Arrays.sort(arr);
        while (true) {
            System.out.println(arr);
            int i = arr.length - 1;
            while (i > 0 && arr[i - 1] >= arr[i]) {
                i--;
            }
            if (i <= 0) {
                break;
            }
            int j = arr.length - 1;
            while (arr[j] <= arr[i - 1]) {
                j--;
            }
            int temp = arr[i - 1];
            arr[i - 1] = arr[j];
            arr[j] = (char) temp;
            j = arr.length - 1;
            while (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = (char) temp;
                i++;
                j--;
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
