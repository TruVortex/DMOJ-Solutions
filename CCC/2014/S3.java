import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        Stack<Integer> trains = new Stack();
        Stack<Integer> branch = new Stack();
        Stack<Integer> lake = new Stack();
        Stack<String> yesNo = new Stack();
        int tests = nextInt();
        for (int i = 0; i < tests; i++) {
            int numTrains = nextInt();
            for (int j = 0; j < numTrains; j++) {
                trains.push(nextInt());
            }
            boolean canSolve = false;
            int lookForTrain = 1;
            while (!trains.isEmpty() || !branch.isEmpty()) {
                if (!trains.isEmpty() && trains.peek() == lookForTrain) {
                    lake.push(trains.pop());
                    lookForTrain++;
                } else if (!branch.isEmpty() && branch.peek() == lookForTrain) {
                    lake.push(branch.pop());
                    lookForTrain++;
                } else if (!trains.isEmpty() && !branch.isEmpty() && trains.peek() > branch.peek()) {
                    canSolve = false;
                    break;
                } else {
                    branch.push(trains.pop());
                }
            }
            if (trains.isEmpty() && branch.isEmpty()) {
                canSolve = true;
            }
            if (canSolve) {
                yesNo.add("Y");
            } else {
                yesNo.add("N");
            }
            trains.removeAllElements();
            branch.removeAllElements();
        }
        for (int i = 0; i < tests; i++) {
            System.out.println(yesNo.get(i));
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
