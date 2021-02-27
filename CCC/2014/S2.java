import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int students = nextInt();
        ArrayList<String> list1 = new ArrayList();
        ArrayList<String> list2 = new ArrayList();
        int count = 0;
        for (int i = 0; i < students; i++) {
            list1.add(next());
        }
        for (int i = 0; i < students; i++) {
            list2.add(next());
        }
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < students; j++) {
                if (list1.get(i).equals(list2.get(j)) && list2.get(i).equals(list1.get(j)) && i != j) {
                    count++;
                }
            }
        }
        if (count == students) {
            System.out.println("good");
        } else {
            System.out.println("bad");
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
