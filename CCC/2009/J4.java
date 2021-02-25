import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String[] words = {"WELCOME", "TO", "CCC", "GOOD", "LUCK", "TODAY"};
        int w = nextInt();
        int i = 1;
        String s = words[0];
        while (i <= 5) {
            while (i <= 5 && s.length() + words[i].length() + 1 <= w) {
                s += "." + words[i];
                i++;
            }
            System.out.println(fill(s, w));
            if (i <= 5) {
                s = words[i];
            } else {
                 s = "";
            }
            i++;
        }
        if (s.length() > 0) {
            System.out.println(fill(s, w));
        }
    }

    public static String fill(String s, int w) {
        String t = s;
        int i = 0;
        if (t.indexOf(".") > 0) {
            while (t.length() != w) {
                while (t.charAt(i) != '.') {
                    i++;
                    if (i > t.length() - 1) {
                        i = 0;
                    }
                }
                t = t.substring(0, i) + "." + t.substring(i, t.length());
                while (t.charAt(i) == '.') {
                    i++;
                    if (i > t.length() - 1) {
                        i = 0;
                    }
                }
            }
        } else {
            while (t.length() != w) {
                t += ".";
            }
        }
        return t;
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
