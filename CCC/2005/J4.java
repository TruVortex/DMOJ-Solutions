import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        while (true) {
            String str = next();
            if (str.equals("X")) {
                System.exit(0);
            }
            System.out.println(isMonkeyLang(str) ? "YES" : "NO");
        }
    }

    public static boolean isMonkeyLang(String str) {
        if (str.length() > 0) {
            int idx = str.indexOf("N");
            if (idx >= 0) {
                boolean result = false;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 'N') {
                        result = result || (isWord(str.substring(0, i)) && isMonkeyLang(str.substring(i + 1)));
                        if (result) {
                            break;
                        }
                    }
                }
                if (!result) {
                    return isWord(str);
                }
                return result;
            } else {
                return isWord(str);
            }
        }
        return false;
    }

    public static boolean isWord(String str) {
        if (str.length() > 0) {
            int indxS = str.lastIndexOf("S");
            if (str.equals("A")) {
                return true;
            }
            if (str.startsWith("B") && str.endsWith("S")) {
                return isMonkeyLang(str.substring(1, indxS));
            }
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
