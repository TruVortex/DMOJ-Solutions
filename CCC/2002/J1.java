import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        switch (nextInt()) {
            case 0:
                System.out.print(" * * *\n"
                                +"*     *\n"
                                +"*     *\n"
                                +"*     *\n"
                                +"\n"
                                +"*     *\n"
                                +"*     *\n"
                                +"*     *\n"
                                +" * * *\n");
                break;
            case 1:
                System.out.print("\n"
                                +"      *\n"
                                +"      *\n"
                                +"      *\n"
                                +"\n"
                                +"      *\n"
                                +"      *\n"
                                +"      *\n"
                                +"\n");
                break;
            case 2:
                System.out.print(" * * *\n"
                                +"      *\n"
                                +"      *\n"
                                +"      *\n"
                                +" * * *\n"
                                +"*\n"
                                +"*\n"
                                +"*\n"
                                +" * * *\n");
                break;
            case 3:
                System.out.print(" * * *\n"
                                +"      *\n"
                                +"      *\n"
                                +"      *\n"
                                +" * * *\n"
                                +"      *\n"
                                +"      *\n"
                                +"      *\n"
                                +" * * *\n");
                break;
            case 4:
                System.out.print("\n"
                                +"*     *\n"
                                +"*     *\n"
                                +"*     *\n"
                                +" * * *\n"
                                +"      *\n"
                                +"      *\n"
                                +"      *\n"
                                +"\n");
                break;
            case 5:
                System.out.print(" * * *\n"
                                +"*\n"
                                +"*\n"
                                +"*\n"
                                +" * * *\n"
                                +"      *\n"
                                +"      *\n"
                                +"      *\n"
                                +" * * *\n");
                break;
            case 6:
                System.out.print(" * * *\n"
                                +"*\n"
                                +"*\n"
                                +"*\n"
                                +" * * *\n"
                                +"*     *\n"
                                +"*     *\n"
                                +"*     *\n"
                                +" * * *\n");
                break;
            case 7:
                System.out.print(" * * *\n"
                                +"      *\n"
                                +"      *\n"
                                +"      *\n"
                                +"\n"
                                +"      *\n"
                                +"      *\n"
                                +"      *\n"
                                +"\n");
                break;
            case 8:
                System.out.print(" * * *\n"
                                +"*     *\n"
                                +"*     *\n"
                                +"*     *\n"
                                +" * * *\n"
                                +"*     *\n"
                                +"*     *\n"
                                +"*     *\n"
                                +" * * *\n");
                break;
            case 9:
                System.out.print(" * * *\n"
                                +"*     *\n"
                                +"*     *\n"
                                +"*     *\n"
                                +" * * *\n"
                                +"      *\n"
                                +"      *\n"
                                +"      *\n"
                                +" * * *\n");
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
