import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int angle1 = nextInt();
        int angle2 = nextInt();
        int angle3 = nextInt();
        if (angle1 + angle2 + angle3 != 180) {
            System.out.println("Error");
        } else if (angle1 == angle2 && angle2 == angle3) {
            System.out.println("Equilateral");
        } else if (angle1 != angle2 && angle2 != angle3 && angle3 != angle1) {
            System.out.println("Scalene");
        } else {
            System.out.println("Isosceles");
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
