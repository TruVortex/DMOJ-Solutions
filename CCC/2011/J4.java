import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> holeX = new ArrayList(Arrays.asList(0, 0, 0, 1, 2, 3, 3, 3, 4, 5, 5, 5, 6, 7, 7, 7, 7, 7, 6, 5, 4, 3, 2, 1, 0, -1, -1, -1));
        ArrayList<Integer> holeY = new ArrayList(Arrays.
                asList(-1, -2, -3, -3, -3, -3, -4, -5, -5, -5, -4, -3, -3, -3, -4, -5, -6, -7, -7, -7, -7, -7, -7, -7, -7, -7, -6, -5));
        boolean danger = false;
        String ans = "";
        int startX, startY, stepX, stepY, targetX = 0, targetY = 0;
        do {
            String direction = next();
            if (direction.equals("q") || danger == true) {
                break;
            }
            int steps = nextInt();
            startY = holeY.get(holeY.size() - 1);
            startX = holeX.get(holeX.size() - 1);
            stepY = startY;
            stepX = startX;
            switch (direction) {
                case "d":
                    targetY = startY - steps;
                    targetX = startX;
                    for (int i = 0; i < steps; i++) {
                        stepY--;
                        danger = false;
                        for (int j = 0; j < holeY.size() - 1; j++) {
                            if (holeY.get(j) == stepY && holeX.get(j) == startX) {
                                danger = true;
                                break;
                            }
                        }
                        if (danger == true) {
                            break;
                        } else {
                            holeY.add(stepY);
                            holeX.add(startX);
                        }
                    }
                    break;
                case "u":
                    targetY = startY + steps;
                    targetX = startX;
                    for (int i = 0; i < steps; i++) {
                        stepY++;
                        danger = false;
                        for (int j = 0; j < holeY.size() - 1; j++) {
                            if (holeY.get(j) == stepY && holeX.get(j) == startX) {
                                danger = true;
                                break;
                            }
                        }
                        if (danger == true) {
                            break;
                        } else {
                            holeY.add(stepY);
                            holeX.add(startX);
                        }
                    }
                    break;
                case "l":
                    targetY = startY;
                    targetX = startX - steps;
                    for (int i = 0; i < steps; i++) {
                        stepX--;
                        danger = false;
                        for (int j = 0; j < holeX.size() - 1; j++) {
                            if (holeX.get(j) == stepX && holeY.get(j) == startY) {
                                danger = true;
                                break;
                            }
                        }
                        if (danger == true) {
                            break;
                        } else {
                            holeY.add(startY);
                            holeX.add(stepX);
                        }
                    }
                    break;
                case "r":
                    targetY = startY;
                    targetX = startX + steps;
                    for (int i = 0; i < steps; i++) {
                        stepX++;
                        danger = false;
                        for (int j = 0; j < holeX.size() - 1; j++) {
                            if (holeX.get(j) == stepX && holeY.get(j) == startY) {
                                danger = true;
                                break;
                            }
                        }
                        if (danger == true) {
                            break;
                        } else {
                            holeY.add(startY);
                            holeX.add(stepX);
                        }
                    }
                    break;
                default:
                    break;
            }
            String result;
            if (danger == false) {
                result = "safe";
            } else {
                result = "DANGER";
            }
            ans += targetX + " " + targetY + " " + result + "\n";
        } while (true);
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
