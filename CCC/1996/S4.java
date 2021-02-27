import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        for (int i = 0; i < n; i++) {
            String line = next();
            int idx = line.indexOf("+");
            int ans = toDecimal(line.substring(0, idx)) + toDecimal(line.substring(idx, line.length() - 1));
            if (ans > 1000) {
                System.out.println(line + "CONCORDIA CUM VERITATE");
            } else {
                System.out.println(line + toRoman(ans));
            }
        }
    }

    public static int toDecimal(String s) {
        int t = 0;
        int v = 0;
        int old = 100000;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    v = 1;
                    break;
                case 'V':
                    v = 5;
                    break;
                case 'X':
                    v = 10;
                    break;
                case 'L':
                    v = 50;
                    break;
                case 'C':
                    v = 100;
                    break;
                case 'D':
                    v = 500;
                    break;
                case 'M':
                    v = 1000;
                    break;
            }
            if (v > old) {
                t = t + v - (2 * old);
            } else {
                t += v;
            }
            old = v;
        }
        return t;
    }

    public static String toRoman(int xx) {
        int x = xx;
        int d = x / 100;
        String s = "";
        x %= 100;
        switch (d) {
            case 1:
                s = s + "C";
                break;
            case 2:
                s = s + "CC";
                break;
            case 3:
                s = s + "CCC";
                break;
            case 4:
                s = s + "CD";
                break;
            case 5:
                s = s + "D";
                break;
            case 6:
                s = s + "DC";
                break;
            case 7:
                s = s + "DCC";
                break;
            case 8:
                s = s + "DCCC";
                break;
            case 9:
                s = s + "CM";
                break;
        }
        d = x / 10;
        x %= 10;
        switch (d) {
            case 1:
                s = s + "X";
                break;
            case 2:
                s = s + "XX";
                break;
            case 3:
                s = s + "XXX";
                break;
            case 4:
                s = s + "XL";
                break;
            case 5:
                s = s + "L";
                break;
            case 6:
                s = s + "LX";
                break;
            case 7:
                s = s + "LXX";
                break;
            case 8:
                s = s + "LXXX";
                break;
            case 9:
                s = s + "XC";
                break;
        }
        d = x;
        switch (d) {
            case 1:
                s = s + "I";
                break;
            case 2:
                s = s + "II";
                break;
            case 3:
                s = s + "III";
                break;
            case 4:
                s = s + "IV";
                break;
            case 5:
                s = s + "V";
                break;
            case 6:
                s = s + "VI";
                break;
            case 7:
                s = s + "VII";
                break;
            case 8:
                s = s + "VIII";
                break;
            case 9:
                s = s + "IX";
                break;
        }
        return s;
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
