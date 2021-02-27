import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        for (int j = 0; j < n; j++) {
            if (j != 0) {
                System.out.println();
            }
            String num = next();
            int numLength = num.length();
            int[] arr = new int[numLength];
            for (int i = 0; i < numLength; i++) {
                arr[i] = num.charAt(i) - '0';
            }
            while (true) {
                for (int i = 0; i < numLength; i++) {
                    System.out.print(arr[i]);
                }
                System.out.println();
                if (numLength <= 2) {
                    break;
                }
                int digit = arr[numLength - 1];
                numLength--;
                for (int i = numLength - 1; i >= 0; i--) {
                    if (digit > arr[i]) {
                        arr[i] += 10;
                        arr[i - 1]--;
                    }
                    arr[i] -= digit;
                    digit = 0;
                }
                if (arr[0] == 0) {
                    numLength--;
                    for (int i = 0; i < numLength; i++) {
                        arr[i] = arr[i + 1];
                    }
                }
            }
            if (numLength < 2) {
                System.out.println("The number " + num + " is not divisible by 11.");
            } else if (arr[0] == arr[1]) {
                System.out.println("The number " + num + " is divisible by 11.");
            } else {
                System.out.println("The number " + num + " is not divisible by 11.");
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
