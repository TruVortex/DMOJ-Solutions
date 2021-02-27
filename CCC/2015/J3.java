import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String input = next();
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            switch (letter) {
                case 'a': System.out.print("a"); break;
                case 'b': System.out.print("bac"); break;
                case 'c': System.out.print("cad"); break;
                case 'd': System.out.print("def"); break;
                case 'e': System.out.print("e"); break;
                case 'f': System.out.print("feg"); break;
                case 'g': System.out.print("geh"); break;
                case 'h': System.out.print("hij"); break;
                case 'i': System.out.print("i"); break;
                case 'j': System.out.print("jik"); break;
                case 'k': System.out.print("kil"); break;
                case 'l': System.out.print("lim"); break;
                case 'm': System.out.print("mon"); break;
                case 'n': System.out.print("nop"); break;
                case 'o': System.out.print("o"); break;
                case 'p': System.out.print("poq"); break;
                case 'q': System.out.print("qor"); break;
                case 'r': System.out.print("ros"); break;
                case 's': System.out.print("sut"); break;
                case 't': System.out.print("tuv"); break;
                case 'u': System.out.print("u"); break;
                case 'v': System.out.print("vuw"); break;
                case 'w': System.out.print("wux"); break;
                case 'x': System.out.print("xuy"); break;
                case 'y': System.out.print("yuz"); break;
                case 'z': System.out.print("zuz"); break;
            }
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
