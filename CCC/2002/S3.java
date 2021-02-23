import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int r = nextInt();
        int c = nextInt();
        char[][] room = new char[r][c];
        for (int i = 0; i < r; i++) {
            room[i] = next().toCharArray();
        }
        int m = nextInt();
        char[] moves = new char[m];
        for (int i = 0; i < m; i++) {
            moves[i] = nextChar();
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (room[i][j] != 'X') {
                    for (int dirL = 0; dirL < 4; dirL++) {
                        int dir = dirL;
                        int x = i;
                        int y = j;
                        boolean flag = true;
                        for (char mv : moves) {
                            if (mv == 'F') {
                                if (dir == 0) {
                                    x--;
                                } else if (dir == 1) {
                                    y++;
                                } else if (dir == 2) {
                                    x++;
                                } else {
                                    y--;
                                }
                            } else if (mv == 'R') {
                                dir = (dir + 1) % 4;
                            } else {
                                dir = (dir + 3) % 4;
                            }
                            if (x < 0 || x >= r || y < 0 || y >= c || room[x][y] == 'X') {
                                flag = false;
                                break;
                            }
                        }
                        if (flag) {
                            room[x][y] = '*';
                        }
                    }
                }
            }
        }
        for (int i = 0; i < r; i++) {
            System.out.println(room[i]);
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
