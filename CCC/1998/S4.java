import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        for (int i = 0; i < n; i++) {
            String str = nextLine();
            int x = 0;
            while (x < str.length()) {
                while (x < str.length() && str.charAt(x) != 'X') {
                    x++;
                }
                if (x < str.length()) {
                    str = left(str, x);
                    str = right(str, x + 1);
                }
                x += 2;
            }
            x = 0;
            while (x < str.length()) {
                while (x < str.length() && !(str.charAt(x) == '+' || str.charAt(x) == '-')) {
                    x++;
                }
                if (x < str.length()) {
                    str = left(str, x);
                    str = right(str, x + 1);
                }
                x += 2;
            }
            System.out.println(str.substring(1, str.length() - 1) + "\n");
        }
    }

    static String left(String str, int x) {
        x -= 2;
        if (str.charAt(x) == ')') {
            int cnt = 1;
            x--;
            while (cnt != 0) {
                if (str.charAt(x) == ')') {
                    cnt++;
                } else if (str.charAt(x) == '(') {
                    cnt--;
                }
                x--;
            }
        } else {
            while (x >= 0 && str.charAt(x) != ' ') {
                x--;
            }
        }
        if (x == -1) {
            str = "(" + str;
        } else {
            str = str.substring(0, x + 1) + "(" + str.substring(x + 1);
        }
        return str;
    }

    static String right(String str, int x) {
        x += 2;
        if (str.charAt(x) == '(') {
            int cnt = 1;
            x++;
            while (cnt != 0) {
                if (str.charAt(x) == '(') {
                    cnt++;
                } else if (str.charAt(x) == ')') {
                    cnt--;
                }
                x++;
            }
        } else {
            while (x < str.length() && str.charAt(x) != ' ') {
                x++;
            }
        }
        if (x == str.length()) {
            str += ")";
        } else {
    	    str = str.substring(0, x) + ")" + str.substring(x);
        }
        return str;
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
