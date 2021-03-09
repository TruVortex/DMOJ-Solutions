import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        String[] zodiac = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"};
        HashMap<String, Integer> animals = new HashMap();
        animals.put("Bessie", 2021);
        for (int i = 0; i < n; i++) {
            String[] info = nextLine().split(" ");
            int year = animals.get(info[info.length - 1]);
            boolean before = "previous".equals(info[3]);
            do {
                if (before) {
                    year--;
                } else {
                    year++;
                }
            } while (!zodiac[(year - 4) % 12].equals(info[4]));
            animals.put(info[0], year);
        }
        System.out.println(Math.abs(2021 - animals.get("Elsie")));
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
