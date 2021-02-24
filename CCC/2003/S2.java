import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int poems = nextInt();
        for (int i = 0; i < poems; i++) {
            String line1 = nextLine().toLowerCase();
            line1 = lastVowel(line1.substring(line1.lastIndexOf(" ") + 1));
            String line2 = nextLine().toLowerCase();
            line2 = lastVowel(line2.substring(line2.lastIndexOf(" ") + 1));
            String line3 = nextLine().toLowerCase();
            line3 = lastVowel(line3.substring(line3.lastIndexOf(" ") + 1));
            String line4 = nextLine().toLowerCase();
            line4 = lastVowel(line4.substring(line4.lastIndexOf(" ") + 1));
            if (line1.equals(line2) && line2.equals(line3) && line3.equals(line4)) {
                System.out.println("perfect");
            } else if (line1.equals(line2) && line3.equals(line4)) {
                System.out.println("even");
            } else if (line1.equals(line3) && line2.equals(line4)) {
                System.out.println("cross");
            } else if (line1.equals(line4) && line2.equals(line3)) {
                System.out.println("shell");
            } else {
                System.out.println("free");
            }
        }
    }

    public static String lastVowel(String str) {
        int n = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                n = i;
            }
        }
        return str.substring(n);
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
