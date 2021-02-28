import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        for (int i = 0; i < n; i++) {
            int dir = 0;
            int x = 0;
            int y = 0;
            while (true) {
                int num = nextInt();
                if (num == 0) {
                    break;
                }
                switch (num) {
                    case 1:
                        int d = nextInt();
                        switch (dir) {
                            case 0:
                                x += d;
                                break;
                            case 90:
                                y += d;
                                break;
                            case 180:
                                x -= d;
                                break;
                            default:
                                y -= d;
                                break;
                        }
                        break;
                    case 2:
                        dir -= 90;
                        if (dir < 0) {
                            dir = 270;
                        }
                        break;
                    default:
                        dir += 90;
                        if (dir == 360) {
                            dir = 0;
                        }
                        break;
                }
            }
            System.out.println("Distance is " + (Math.abs(x) + Math.abs(y)));
            if (y > 0 && x > 0 && dir == 0) {
                right();
                ahead(y);
                right();
                ahead(x);
            } else if (y > 0 && x > 0 && dir == 90) {
                left();
                ahead(x);
                left();
                ahead(y);
            } else if (y > 0 && x > 0 && dir == 180) {
                ahead(x);
                left();
                ahead(y);
            } else if (y > 0 && x > 0 && dir == 270) {
                ahead(y);
                right();
                ahead(x);
            } else if (y > 0 && x < 0 && dir == 0) {
                ahead(x);
                right();
                ahead(y);
            } else if (y > 0 && x < 0 && dir == 90) {
                right();
                ahead(x);
                right();
                ahead(y);
            } else if (y > 0 && x < 0 && dir == 180) {
                left();
                ahead(y);
                left();
                ahead(x);
            } else if (y > 0 && x < 0 && dir == 270) {
                ahead(y);
                left();
                ahead(x);
            } else if (y < 0 && x < 0 && dir == 0) {
                ahead(x);
                left();
                ahead(y);
            } else if (y < 0 && x < 0 && dir == 90) {
                ahead(y);
                right();
                ahead(x);
            } else if (y < 0 && x < 0 && dir == 180) {
                right();
                ahead(y);
                right();
                ahead(x);
            } else if (y < 0 && x < 0 && dir == 270) {
                left();
                ahead(x);
                left();
                ahead(y);
            } else if (y < 0 && x > 0 && dir == 0) {
                left();
                ahead(y);
                left();
                ahead(x);
            } else if (y < 0 && x > 0 && dir == 90) {
                ahead(y);
                left();
                ahead(x);
            } else if (y < 0 && x > 0 && dir == 180) {
                ahead(x);
                right();
                ahead(y);
            } else if (y < 0 && x > 0 && dir == 270) {
                right();
                ahead(x);
                right();
                ahead(y);
            } else if (y == 0 && x > 0 && dir == 0) {
                right();
                right();
                ahead(x);
            } else if (y == 0 && x > 0 && dir == 90) {
                left();
                ahead(x);
            } else if (y == 0 && x > 0 && dir == 180) {
                ahead(x);
            } else if (y == 0 && x > 0 && dir == 270) {
                right();
                ahead(x);
            } else if (y > 0 && x == 0 && dir == 0) {
                right();
                ahead(y);
            } else if (y > 0 && x == 0 && dir == 90) {
                left();
                left();
                ahead(y);
            } else if (y > 0 && x == 0 && dir == 180) {
                left();
                ahead(y);
            } else if (y > 0 && x == 0 && dir == 270) {
                ahead(y);
            } else if (y == 0 && x < 0 && dir == 0) {
                ahead(x);
            } else if (y == 0 && x < 0 && dir == 90) {
                right();
                ahead(x);
            } else if (y == 0 && x < 0 && dir == 180) {
                left();
                left();
                ahead(x);
            } else if (y == 0 && x < 0 && dir == 270) {
                left();
                ahead(x);
            } else if (y < 0 && x == 0 && dir == 0) {
                left();
                ahead(y);
            } else if (y < 0 && x == 0 && dir == 90) {
                ahead(y);
            } else if (y < 0 && x == 0 && dir == 180) {
                right();
                ahead(y);
            } else if (y > 0 && x == 0 && dir == 270) {
                left();
                left();
                ahead(y);
            }
        }
    }

    static void right() {
        System.out.println(2);
    }

    static void left() {
        System.out.println(3);
    }

    static void ahead(int n) {
        System.out.println(1);
        System.out.println(Math.abs(n));
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
