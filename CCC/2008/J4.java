import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        while (true) {
            String prefix = nextLine().replaceAll(" ", "");
            if (prefix.equals("0")) {
                break;
            }
            Stack<String> stack = new Stack();
            for (int i = prefix.length() - 1; i >= 0; i--) {
                if (Character.isDigit(prefix.charAt(i))) {
                    stack.push(prefix.charAt(i) + "");
                } else {
                    String str1 = stack.pop();
                    String str2 = stack.pop();
                    stack.push(str1 + str2 + prefix.charAt(i));
                }
            }
            String result = stack.peek();
            for (int i = 0; i < result.length() - 1; i++) {
                System.out.print(result.charAt(i) + " ");
            }
            System.out.print(result.charAt(result.length() - 1) + "\n");
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
