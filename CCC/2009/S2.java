import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int r = nextInt();
        nextInt();
        String[] lights = new String[r];
        for (int i = 0; i < r; i++) {
            lights[i] = nextLine().replaceAll(" ", "");
        }
        HashSet<String> set = new HashSet();
        for (int i = 0; i < r; i++) {
            String str = lights[i];
            for (int j = i + 1; j < r; j++) {
                str = xor(str, lights[j]);
            }
            set.add(str);
        }
        System.out.println(set.size());
    }

    static String xor(String a, String b) {
        String str = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                str += 0;
            } else {
                str += 1;
            }
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
