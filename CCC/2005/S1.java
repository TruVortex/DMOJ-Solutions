import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int cases = nextInt();
        for (int i = 0; i < cases; i++) {
            String phone = next().replaceAll("-", "").substring(0, 10);
            for (int j = 0; j < 10; j++) {
                switch (phone.charAt(j)) {
                    case 'A': phone = phone.replace("A", "2"); break;
                    case 'B': phone = phone.replace("B", "2"); break;
                    case 'C': phone = phone.replace("C", "2"); break;
                        
                    case 'D': phone = phone.replace("D", "3"); break;
                    case 'E': phone = phone.replace("E", "3"); break;
                    case 'F': phone = phone.replace("F", "3"); break;
                        
                    case 'G': phone = phone.replace("G", "4"); break;
                    case 'H': phone = phone.replace("H", "4"); break;
                    case 'I': phone = phone.replace("I", "4"); break;
                        
                    case 'J': phone = phone.replace("J", "5"); break;
                    case 'K': phone = phone.replace("K", "5"); break;
                    case 'L': phone = phone.replace("L", "5"); break;
                        
                    case 'M': phone = phone.replace("M", "6"); break;
                    case 'N': phone = phone.replace("N", "6"); break;
                    case 'O': phone = phone.replace("O", "6"); break;
                        
                    case 'P': phone = phone.replace("P", "7"); break;
                    case 'Q': phone = phone.replace("Q", "7"); break;
                    case 'R': phone = phone.replace("R", "7"); break;
                    case 'S': phone = phone.replace("S", "7"); break;
                        
                    case 'T': phone = phone.replace("T", "8"); break;
                    case 'U': phone = phone.replace("U", "8"); break;
                    case 'V': phone = phone.replace("V", "8"); break;
                        
                    case 'W': phone = phone.replace("W", "9"); break;
                    case 'X': phone = phone.replace("S", "9"); break;
                    case 'Y': phone = phone.replace("Y", "9"); break;
                    case 'Z': phone = phone.replace("Z", "9"); break;
                }
            }
            System.out.println(phone.substring(0, 3) + "-" + phone.substring(3, 6) + "-" + phone.substring(6, 10));
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
