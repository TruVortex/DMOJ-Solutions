import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        while (true) {
            String str = next();
            if (str.equals("halt")) {
                break;
            }
            System.out.println(sec(str) + pause(str));
        }
    }

    public static int sec(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            switch (c1) {
                case 'a':
                case 'd':
                case 'g':
                case 'j':
                case 'm':
                case 'p':
                case 't':
                case 'w':
                    sum++;
                    break;
                case 'b':
                case 'e':
                case 'h':
                case 'k':
                case 'n':
                case 'q':
                case 'u':
                case 'x':
                    sum += 2;
                    break;
                case 'c':
                case 'f':
                case 'i':
                case 'l':
                case 'o':
                case 'r':
                case 'v':
                case 'y':
                    sum += 3;
                    break;
                default:
                    sum += 4;
                    break;
            }
        }
        return sum;
    }

    public static int pause(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);
            if ((c1 == 'a' || c1 == 'b' || c1 == 'c') && (c2 == 'a' || c2 == 'b' || c2 == 'c')) {
                sum += 2;
            } else if ((c1 == 'd' || c1 == 'e' || c1 == 'f') && (c2 == 'd' || c2 == 'e' || c2 == 'f')) {
                sum += 2;
            } else if ((c1 == 'g' || c1 == 'h' || c1 == 'i') && (c2 == 'g' || c2 == 'h' || c2 == 'i')) {
                sum += 2;
            } else if (c1 == 'j' || c1 == 'k' || c1 == 'l' && (c2 == 'j' || c2 == 'k' || c2 == 'l')) {
                sum += 2;
            } else if ((c1 == 'm' || c1 == 'n' || c1 == 'o') && (c2 == 'm' || c2 == 'n' || c2 == 'o')) {
                sum += 2;
            } else if ((c1 == 'p' || c1 == 'q' || c1 == 'r' || c1 == 's') && (c2 == 'p' || c2 == 'q' || c2 == 'r' || c2 == 's')) {
                sum += 2;
            } else if ((c1 == 't' || c1 == 'u' || c1 == 'v') && (c2 == 't' || c2 == 'u' || c2 == 'v')) {
                sum += 2;
            } else if ((c1 == 'w' || c1 == 'x' || c1 == 'y' || c1 == 'z') && (c2 == 'w' || c2 == 'x' || c2 == 'y' || c2 == 'z')) {
                sum += 2;
            }
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
