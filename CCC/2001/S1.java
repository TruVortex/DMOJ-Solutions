import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String cards = next();
        int total = 0;
        int points = 0;
        int nums = 0;
        System.out.println("Cards Dealt           Points");
        for (int i = 0; i < cards.length(); i++) {
            char c = cards.charAt(i);
            if (c == 'C') { // most inefficient chain of ifs you ever did see
                System.out.print("Clubs ");
            } else if (c == 'D') {
                if (nums == 0) {
                    points += 3;
                } else if (nums == 1) {
                    points += 2;
                } else if (nums == 2) {
                    points++;
                }
                System.out.println("      " + points);
                total += points;
                points = 0;
                nums = 0;
                System.out.print("Diamonds ");
            } else if (c == 'H') {
                if (nums == 0) {
                    points += 3;
                } else if (nums == 1) {
                    points += 2;
                } else if (nums == 2) {
                    points++;
                }
                System.out.println("      " + points);
                total += points;
                points = 0;
                nums = 0;
                System.out.print("Hearts ");
            } else if (c == 'S') {
                if (nums == 0) {
                    points += 3;
                } else if (nums == 1) {
                    points += 2;
                } else if (nums == 2) {
                    points++;
                }
                System.out.println("      " + points);
                total += points;
                points = 0;
                nums = 0;
                System.out.print("Spades ");
            } else {
                nums++;
                System.out.print(c + " ");
                if (c == 'A') {
                    points += 4;
                } else if (c == 'K') {
                    points += 3;
                } else if (c == 'Q') {
                    points += 2;
                } else if (c == 'J') {
                    points++;
                }
            }
        }
        if (nums == 0) {
            points += 3;
        } else if (nums == 1) {
            points += 2;
        } else if (nums == 2) {
            points++;
        }
        System.out.println("      " + points + "\n       Total " + (total + points));
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
