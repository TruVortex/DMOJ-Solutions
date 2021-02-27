import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int weight = nextInt();
        ArrayList<Integer> trains = new ArrayList();
        for (int i = nextInt(); i > 0; i--) {
            trains.add(nextInt());
        }
        System.out.println(findNumTrains(trains, weight));
    }

    public static int findNumTrains(ArrayList<Integer> trains, int weight) {
        ArrayList<Integer> trainsOnBridge = new ArrayList();
        int overBridgeCount = 0;
        int onBridgeWeight = 0;
        int nextTrain;
        for (int i = 0; i < trains.size(); i++) {
            if (trainsOnBridge.size() == 4) {
                onBridgeWeight = onBridgeWeight - trainsOnBridge.get(0);
                trainsOnBridge.remove(0);
            }
            nextTrain = trains.get(i);
            if (onBridgeWeight + nextTrain > weight) {
                break;
            }
            trainsOnBridge.add(nextTrain);
            onBridgeWeight = onBridgeWeight + nextTrain;
            overBridgeCount++;
        }
        return overBridgeCount;
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
