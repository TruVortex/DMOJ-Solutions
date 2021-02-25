import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int a = 0;
        int b = 0;
        int instruction;
        while (true) {
            instruction = nextInt();
            if (instruction == 7) {
                break;
            }
            switch (instruction) {
                case 1: {
                    String str1 = next();
                    int n = nextInt();
                    if ("A".equals(str1)) {
                        a = n;
                    } else {
                        b = n;
                    }
                    break;
                }
                case 2: {
                    String str1 = next();
                    if ("A".equals(str1)) {
                        System.out.println(a);
                    } else {
                        System.out.println(b);
                    }
                    break;
                }
                default: {
                    String str1 = next();
                    String str2 = next();
                    if ("A".equals(str1)) {
                        if ("A".equals(str2)) {
                            switch (instruction) {
                                case 3:
                                    a += a;
                                    break;
                                case 4:
                                    a *= a;
                                    break;
                                case 5:
                                    a -= a;
                                    break;
                                default:
                                    a /= a;
                                    break;
                            }
                        } else {
                            switch (instruction) {
                                case 3:
                                    a += b;
                                    break;
                                case 4:
                                    a *= b;
                                    break;
                                case 5:
                                    a -= b;
                                    break;
                                default:
                                    a /= b;
                                    break;
                            }
                        }
                    } else {
                        if ("A".equals(str2)) {
                            switch (instruction) {
                                case 3:
                                    b += a;
                                    break;
                                case 4:
                                    b *= a;
                                    break;
                                case 5:
                                    b -= a;
                                    break;
                                default:
                                    b /= a;
                                    break;
                            }
                        } else {
                            switch (instruction) {
                                case 3:
                                    b += b;
                                    break;
                                case 4:
                                    b *= b;
                                    break;
                                case 5:
                                    b -= b;
                                    break;
                                default:
                                    b /= b;
                                    break;
                            }
                        }
                    }
                    break;
                }
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
