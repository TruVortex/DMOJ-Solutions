import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int a = nextInt();
        int b = nextInt();
        int c = nextInt();
        int d = nextInt();
        int s = nextInt();
        
        int nikkySteps = 0;
        int nikkyDistance = 0;
        int next = a;
        int sgn = 1;
        while (nikkySteps + next < s) {
            nikkySteps += next;
            nikkyDistance += sgn * next;
            if (sgn == 1) {
                next = b;
            } else {
                next = a;
            }
            sgn *= -1;
        }
        nikkyDistance += sgn * (s - nikkySteps);
        
        int byronSteps = 0;
        int byronDistance = 0;
        next = c;
        sgn = 1;
        while (byronSteps + next < s) {
            byronSteps += next;
            byronDistance += sgn * next;
            if (sgn == 1) {
                next = d;
            } else {
                next = c;
            }
            sgn *= -1;
        }
        byronDistance += sgn * (s - byronSteps);
        
        if (nikkyDistance > byronDistance) {
            System.out.println("Nikky");
        } else if (nikkyDistance < byronDistance) {
            System.out.println("Byron");
        } else {
            System.out.println("Tied");
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
