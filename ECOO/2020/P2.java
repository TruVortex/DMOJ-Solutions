import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        for (int t = nextInt(); t > 0; t--) {
            int n = nextInt();
            Map<String, List<Pair>> costs = new HashMap();
            for (int i = 1; i <= n; i++) {
                int items = nextInt();
                for (int j = 1; j <= items; j++) {
                    String name = next();
                    int p = nextInt(), q = nextInt();
                    if (!costs.containsKey(name)) {
                        costs.put(name, new ArrayList());
                    }
                    costs.get(name).add(new Pair(p, q));
                }
            }
            int k = nextInt(), cost = 0;
            for (int i = 1; i <= k; i++) {
                String name = next();
                int amount = nextInt();
                Collections.sort(costs.get(name));
                for (Pair e : costs.get(name)) {
                    if (amount >= e.quantity) {
                        cost += e.price * e.quantity;
                        amount -= e.quantity;
                    } else {
                        cost += e.price * amount;
                        break;
                    }
                }
            }
            System.out.println(cost);
        }
    }

    static class Pair implements Comparable<Pair> {

        int price, quantity;

        Pair(int p, int q) {
            price = p;
            quantity = q;
        }

        @Override
        public int compareTo(Pair x) {
            return Integer.compare(price, x.price);
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
