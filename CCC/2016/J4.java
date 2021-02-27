import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String[] hrMin = next().split(":");
        int hr = Integer.parseInt(hrMin[0]);
        int min = Integer.parseInt(hrMin[1]);
        double distance = 0;
        while (distance < 120) {
            if (hr >= 7 && hr < 10) {
                distance += 0.5;
            } else if (hr >= 15 && hr < 19) {
                distance += 0.5;
            } else {
                distance++;
            }
            min++;
            if (min == 60) {
                min = 0;
                hr++;
            }
            if (hr == 24) {
                hr = 0;
            }
        }
        System.out.println(String.format("%02d", hr) + ":" + String.format("%02d", min));
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
