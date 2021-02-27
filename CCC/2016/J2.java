import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int[] row1 = new int[4];
        int[] row2 = new int[4];
        int[] row3 = new int[4];
        int[] row4 = new int[4];
        for (int i = 0; i < 4; i++) {
            row1[i] = nextInt();
        }
        for (int i = 0; i < 4; i++) {
            row2[i] = nextInt();
        }
        for (int i = 0; i < 4; i++) {
            row3[i] = nextInt();
        }
        for (int i = 0; i < 4; i++) {
            row4[i] = nextInt();
        }
        int[] sums = new int[8];
        sums[0] = row1[0] + row1[1] + row1[2] + row1[3];
        sums[1] = row2[0] + row2[1] + row2[2] + row2[3];
        sums[2] = row3[0] + row3[1] + row3[2] + row3[3];
        sums[3] = row4[0] + row4[1] + row4[2] + row4[3];
        for (int i = 4; i < 8; i++) {
            sums[i] = row1[i - 4] + row2[i - 4] + row3[i - 4] + row4[i - 4];
        }
        Arrays.sort(sums);
        if (sums[0] == sums[7]) {
            System.out.println("magic");
        } else {
            System.out.println("not magic");
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
