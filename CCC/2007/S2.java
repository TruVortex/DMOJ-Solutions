import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        Box[] boxes = new Box[n];
        for (int i = 0; i < n; i++) {
            boxes[i] = new Box(nextInt(), nextInt(), nextInt());
        }
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            Box temp = boxes[i];
            while (j >= 0 && boxes[j].volume > temp.volume) {
                boxes[j + 1] = boxes[j];
                j--;
            }
            boxes[j + 1] = temp;
        }
        int m = nextInt();
        for (int i = 0; i < m; i++) {
            Box temp = new Box(nextInt(), nextInt(), nextInt());
            int j = 0;
            while (j < n && (temp.l > boxes[j].l || temp.w > boxes[j].w || temp.h > boxes[j].h)) {
                j++;
            }
            if (j < n) {
                System.out.println(boxes[j].volume);
            } else {
                System.out.println("Item does not fit.");
            }
        }
    }

    public static class Box {

        public int l, w, h;
        public long volume;

        public Box(int a, int boxes, int c) {
            int t;
            l = a;
            w = boxes;
            h = c;
            if (l > w) {
                t = l;
                l = w;
                w = t;
            }
            if (w > h) {
                t = w;
                w = h;
                h = t;
            }
            if (l > w) {
                t = l;
                l = w;
                w = t;
            }
            volume = l * w * h;
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
