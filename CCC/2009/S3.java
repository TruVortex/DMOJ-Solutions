import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[][] g;
        g = new int[50][50];
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                g[i][j] = 0;
            }
        }
        g[1][6] = 1;
        g[6][1] = 1;
        g[2][6] = 1;
        g[6][2] = 1;
        g[3][6] = 1;
        g[6][3] = 1;
        g[4][6] = 1;
        g[6][4] = 1;
        g[5][6] = 1;
        g[6][5] = 1;
        g[7][6] = 1;
        g[6][7] = 1;
        g[3][4] = 1;
        g[4][3] = 1;
        g[4][5] = 1;
        g[5][4] = 1;
        g[3][5] = 1;
        g[5][3] = 1;
        g[3][15] = 1;
        g[15][3] = 1;
        g[13][15] = 1;
        g[15][13] = 1;
        g[14][13] = 1;
        g[13][14] = 1;
        g[12][13] = 1;
        g[13][12] = 1;
        g[7][8] = 1;
        g[8][7] = 1;
        g[8][9] = 1;
        g[9][8] = 1;
        g[9][10] = 1;
        g[10][9] = 1;
        g[9][12] = 1;
        g[12][9] = 1;
        g[10][11] = 1;
        g[11][10] = 1;
        g[11][12] = 1;
        g[12][11] = 1;
        g[16][17] = 1;
        g[17][16] = 1;
        g[16][18] = 1;
        g[18][16] = 1;
        g[18][17] = 1;
        g[17][18] = 1;
        char command = sc.next().charAt(0);
        while (command != 'q') {
            switch (command) {
                case 'i': {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    g[x][y] = 1;
                    g[y][x] = 1;
                    break;
                }
                case 'd': {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    g[x][y] = 0;
                    g[y][x] = 0;
                    break;
                }
                case 'n': {
                    int x = sc.nextInt();
                    int count = 0;
                    for (int i = 0; i < 50; i++) {
                        if (g[x][i] == 1) {
                            count++;
                        }
                    }
                    System.out.println(count);
                    break;
                }
                case 'f': {
                    int x = sc.nextInt();
                    int count = friendofFriends(g, x);
                    System.out.println(count);
                    break;
                }
                case 's': {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    int count = shortestPath(g, x, y);
                    if (count == 999) {
                        System.out.println("Not connected");
                    } else {
                        System.out.println(count);
                    }
                    break;
                }
            }
            command = sc.next().charAt(0);
        }
    }

    public static int friendofFriends(int[][] g, int x) {
        int[][] q = new int[50][50];
        int count = 0;
        for (int i = 0; i < 50; i++) {
            System.arraycopy(g[i], 0, q[i], 0, 50);
        }

        for (int i = 0; i < 50; i++) {
            if (q[x][i] == 1) {
                for (int j = 0; j < 50; j++) {
                    if (q[i][j] == 1 && j != x && q[x][j] == 0) {
                        q[x][j] = 2;
                    }
                }
            }
        }

        for (int i = 0; i < 50; i++) {
            if (q[x][i] == 2) {
                count++;
            }
        }
        return count;
    }

    public static int shortestPath(int[][] g, int x, int y) {
        int[][] q = new int[50][50];
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                if (g[i][j] == 1) {
                    q[i][j] = g[i][j];
                } else {
                    q[i][j] = 999;
                }
            }
        }
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                if (q[i][j] > 0) {
                    for (int k = 0; k < 50; k++) {
                        if ((q[j][k] > 0) && (q[i][j] + q[j][k] < q[i][k])) {
                            q[i][k] = q[i][j] + q[j][k];
                            q[k][i] = q[i][j] + q[j][k];
                        }
                    }
                }
            }
        }
        return q[x][y];
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
