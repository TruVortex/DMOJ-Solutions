import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int entries = nextInt();
        while (entries-- > 0) {
            String dictionary[] = new String[50000];
            Arrays.fill(dictionary, "|");
            int n = 0;
            do {
                String line = nextLine();
                String compress = "";
                String words[] = line.split(" ");
                if (line.isEmpty()) {
                    System.out.println("");
                    break;
                } else {
                    boolean flag;
                    for (int i = 0; i < words.length; i++) {
                        flag = true;
                        for (int find = 0; find <= n; find++) {
                            if (words[i].equals(dictionary[find])) {
                                words[i] = Integer.toString(find);
                                flag = false;
                                break;
                            }
                        }
                        if (flag) {
                            n++;
                            dictionary[n] = words[i];
                        }
                        compress += words[i];
                        if (i != words.length - 1) {
                            compress += " ";
                        }
                    }
                }
                System.out.println(compress);
            } while (true);
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
