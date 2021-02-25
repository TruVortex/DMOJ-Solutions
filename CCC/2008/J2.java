import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String playlist = "ABCDE";
        while (true) {
            int button = nextInt();
            int presses = nextInt();
            if (button == 4 && presses == 1) {
                break;
            }
            for (int i = 0; i < presses; i++) {
                switch (button) {
                    case 1:
                        playlist = playlist.substring(1, 5) + playlist.substring(0, 1);
                        break;
                    case 2:
                        playlist = playlist.substring(4) + playlist.substring(0, 4);
                        break;
                    default:
                        playlist = playlist.substring(1, 2) + playlist.substring(0, 1) + playlist.substring(2, 5);
                        break;
                }
            }
        }
        System.out.println(playlist.charAt(0) + " " + playlist.charAt(1) + " " + playlist.charAt(2) + " " + playlist.charAt(3) + " " + playlist.charAt(4));
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
