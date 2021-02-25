import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int reg = nextInt();
        System.out.println(reg + " in Ottawa");
        System.out.println(localTime(reg, -300) + " in Victoria");
        System.out.println(localTime(reg, -200) + " in Edmonton");
        System.out.println(localTime(reg, -100) + " in Winnipeg");
        System.out.println(reg + " in Toronto");
        System.out.println(localTime(reg, 100) + " in Halifax");
        System.out.println(localTime(reg, 130) + " in St. John's");
    }
    
    public static int localTime(int t, int c) {
        int lt = t + c;
        if (lt > 2400) {
            lt -= 2400;
        } else if (lt < 0) {
            lt += 2400;
        }
        if (lt % 100 >= 60) {
            lt = (lt / 100 * 100 + 100) + (lt % 100 - 60);
        }
        return lt;
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
