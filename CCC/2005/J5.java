import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        while (true) {
            String str = next();
            if (str.equals("X")) {
                break;
            }
            System.out.println(isAWord(str) ? "YES" : "NO");
        }
    }
    
    static boolean isAWord(String str) {
        if (str.length() == 0) {
            return false;
        }
        if (str.contains("N")) {
            boolean flag = false;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'N') {
                    flag = (secondCheck(str.substring(0, i)) && isAWord(str.substring(i + 1)));
                    if (flag) {
                        break;
                    }
                }
            }
            return flag ? true : secondCheck(str);
        } else {
            return secondCheck(str);
        }
    }
    
    static boolean secondCheck(String str) {
        if (str.equals("A")) {
            return true;
        }
        if (str.startsWith("B") && str.endsWith("S")) {
            return isAWord(str.substring(1, str.length() - 1));
        }
        return false;
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
