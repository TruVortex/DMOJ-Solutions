import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int place1 = nextInt();
        int place2 = nextInt();
        int place3 = nextInt();
        int place4 = nextInt();
        System.out.println(0 + " " + place1 + " " + (place1 + place2) + " " + (place1 + place2 + place3) + " " + (place1 + place2 + place3 + place4));
        System.out.println(place1 + " " + 0 + " " + place2 + " " + (place2 + place3) + " " + (place2 + place3 + place4));
        System.out.println((place1 + place2) + " " + place2 + " " + 0 + " " + place3 + " " + (place3 + place4));
        System.out.println((place1 + place2 + place3) + " " + (place2 + place3) + " " + place3 + " " + 0 + " " + place4);
        System.out.println((place1 + place2 + place3 + place4) + " " + (place2 + place3 + place4) + " " + (place3 + place4) + " " + place4 + " " + 0);
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
