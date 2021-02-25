import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int codes = nextInt();
        LinkedHashMap<String, String> encoded = new LinkedHashMap();
        for (int i = 0; i < codes; i++) {
            encoded.put(next(), next());
        }
        String code = next();
        while (code.length() > 0) {
            for (int i = 0; i < codes; i++) {
                if (code.contains(encoded.get(encoded.keySet().toArray()[i].toString())) && code.indexOf(encoded.get(encoded.keySet().toArray()[i].toString())) == 0) {
                    System.out.print(encoded.keySet().toArray()[i]);
                    code = code.substring(encoded.get(encoded.keySet().toArray()[i].toString()).length());
                    break;
                }
            }
        }
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
