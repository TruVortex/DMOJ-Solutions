import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int f = nextInt();
        HashMap<String, Integer> food = new HashMap();
        for (int i = 0; i < f; i++) {
            food.put(next(), nextInt());
        }
        int n = nextInt();
        TreeMap<Integer, ArrayList<Integer>> options = new TreeMap();
        for (int i = 0; i < n; i++) {
            String tempStr = next();
            int temp = nextInt();
            if (options.containsKey(temp)) {
                ArrayList<Integer> tempList = options.get(temp);
                tempList.add(food.get(tempStr));
                options.put(temp, tempList);
            } else {
                options.put(temp, new ArrayList(Arrays.asList(food.get(tempStr))));
            }
        }
        int at = 0;
        int energy = 0;
        int ans = 0;
        while (energy >= 0 && !options.isEmpty() && Integer.valueOf(String.valueOf(options.keySet().toArray()[0])) - at <= energy) {
            Object[] tempArr = options.keySet().toArray();
            int[] arr = new int[tempArr.length];
            for (int i = 0; i < tempArr.length; i++) {
                arr[i] = Integer.valueOf(String.valueOf(tempArr[i]));
            }
            energy -= (arr[0] - at);
            at = arr[0];
            while (!options.get(arr[0]).isEmpty()) {
                energy += options.get(arr[0]).remove(0);
                ans++;
            }
            options.remove(arr[0]);
        }
        System.out.println(ans);
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
