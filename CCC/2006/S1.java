import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String mother = next();
        String father = next();
        int n = nextInt();
        for (int i = 0; i < n; i++) {
            String baby = next();
            if (baby(mother, father, baby)) {
                System.out.println("Possible baby.");
            } else {
                System.out.println("Not their baby!");
            }
        }
    }

    static boolean baby(String m, String f, String b) {
        boolean flag = true;
        for (int i = 0; i <= 4 && flag; i++) {
            if (b.charAt(i) >= 'A' && b.charAt(i) <= 'E') {
                flag = (m.charAt(i * 2) >= 'A' && m.charAt(i * 2) <= 'E') || (m.charAt(i * 2 + 1) >= 'A' && m.charAt(i * 2 + 1) <= 'E') || (f.charAt(i * 2)
                        >= 'A' && f.charAt(i * 2) <= 'E') || (f.charAt(i * 2 + 1) >= 'A' && f.charAt(i * 2 + 1) <= 'E');
            } else {
                flag = ((m.charAt(i * 2) >= 'a' && m.charAt(i * 2) <= 'e') || (m.charAt(i * 2 + 1) >= 'a' && m.charAt(i * 2 + 1) <= 'e')) && ((f.charAt(i * 2)
                        >= 'a' && f.charAt(i * 2) <= 'e') || (f.charAt(i * 2 + 1) >= 'a' && f.charAt(i * 2 + 1) <= 'e'));
            }
        }
        return flag;
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
