import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int jerseys = nextInt();
        int players = nextInt();
        ArrayList<String> jerseySizes = new ArrayList();
        for (int i = 0; i < jerseys; i++) {
            jerseySizes.add(next());
        }
        int n = 0;
        
        for (int i = 0; i < players; i++) {
            String athleteSize = next();
            int athleteNum = nextInt();
            if (athleteNum>jerseys) continue;
            String jerseySize = jerseySizes.get(athleteNum - 1);
            if ("Z".equals(jerseySize)) {
                continue;
            }
            if (athleteSize.equals(jerseySize) || "S".equals(athleteSize) || "M".equals(athleteSize) && "L".equals(jerseySize)) {
                jerseySizes.set(athleteNum - 1, "Z");
                n++;               
            }
        }
        System.out.println(n);
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
