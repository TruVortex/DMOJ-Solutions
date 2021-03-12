// it's a bit crude but ¯\_(ツ)_/¯
import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int l = nextInt();
        ArrayList<ArrayList<String>> chars = new ArrayList();
        for (int i = 0; i < n; i++) {
            int m = nextInt();
            ArrayList<String> temp = new ArrayList();
            for (int j = 0; j < m; j++) {
                temp.add(next());
            }
            chars.add(temp);
        }
        ArrayList<String> all = new ArrayList();
        for (String str : chars.get(0)) {
            all.add(str);
        }
        if (n > 1) {
            ArrayList<String> temp = new ArrayList(all);
            for (String str : chars.get(1)) {
                for (String str2 : temp) {
                    if ((str2 + str).length() <= l) {
                        all.add(str2 + str);
                    }
                }
            }
        }
        if (n > 2) {
            ArrayList<String> temp = new ArrayList(all);
            for (String str : chars.get(2)) {
                for (String str2 : temp) {
                    if ((str2 + str).length() <= l) {
                        all.add(str2 + str);
                    }
                }
            }
        }
        if (n > 3) {
            ArrayList<String> temp = new ArrayList(all);
            for (String str : chars.get(3)) {
                for (String str2 : temp) {
                    if ((str2 + str).length() <= l) {
                        all.add(str2 + str);
                    }
                }
            }
        }
        if (n > 4) {
            ArrayList<String> temp = new ArrayList(all);
            for (String str : chars.get(4)) {
                for (String str2 : temp) {
                    if ((str2 + str).length() <= l) {
                        all.add(str2 + str);
                    }
                }
            }
        }
        if (n > 5) {
            ArrayList<String> temp = new ArrayList(all);
            for (String str : chars.get(5)) {
                for (String str2 : temp) {
                    if ((str2 + str).length() <= l) {
                        all.add(str2 + str);
                    }
                }
            }
        }
        if (n > 6) {
            ArrayList<String> temp = new ArrayList(all);
            for (String str : chars.get(6)) {
                for (String str2 : temp) {
                    if ((str2 + str).length() <= l) {
                        all.add(str2 + str);
                    }
                }
            }
        }
        if (n > 7) {
            ArrayList<String> temp = new ArrayList(all);
            for (String str : chars.get(7)) {
                for (String str2 : temp) {
                    if ((str2 + str).length() <= l) {
                        all.add(str2 + str);
                    }
                }
            }
        }
        if (n > 8) {
            ArrayList<String> temp = new ArrayList(all);
            for (String str : chars.get(8)) {
                for (String str2 : temp) {
                    if ((str2 + str).length() <= l) {
                        all.add(str2 + str);
                    }
                }
            }
        }
        if (n > 9) {
            ArrayList<String> temp = new ArrayList(all);
            for (String str : chars.get(9)) {
                for (String str2 : temp) {
                    if ((str2 + str).length() <= l) {
                        all.add(str2 + str);
                    }
                }
            }
        }
        if (n > 10) {
            ArrayList<String> temp = new ArrayList(all);
            for (String str : chars.get(10)) {
                for (String str2 : temp) {
                    if ((str2 + str).length() <= l) {
                        all.add(str2 + str);
                    }
                }
            }
        }
        if (n > 11) {
            ArrayList<String> temp = new ArrayList(all);
            for (String str : chars.get(11)) {
                for (String str2 : temp) {
                    if ((str2 + str).length() <= l) {
                        all.add(str2 + str);
                    }
                }
            }
        }
        if (n > 12) {
            ArrayList<String> temp = new ArrayList(all);
            for (String str : chars.get(12)) {
                for (String str2 : temp) {
                    if ((str2 + str).length() <= l) {
                        all.add(str2 + str);
                    }
                }
            }
        }
        if (n > 13) {
            ArrayList<String> temp = new ArrayList(all);
            for (String str : chars.get(13)) {
                for (String str2 : temp) {
                    if ((str2 + str).length() <= l) {
                        all.add(str2 + str);
                    }
                }
            }
        }
        if (n > 14) {
            ArrayList<String> temp = new ArrayList(all);
            for (String str : chars.get(14)) {
                for (String str2 : temp) {
                    if ((str2 + str).length() <= l) {
                        all.add(str2 + str);
                    }
                }
            }
        }
        if (n > 15) {
            ArrayList<String> temp = new ArrayList(all);
            for (String str : chars.get(15)) {
                for (String str2 : temp) {
                    if ((str2 + str).length() <= l) {
                        all.add(str2 + str);
                    }
                }
            }
        }
        if (n > 16) {
            ArrayList<String> temp = new ArrayList(all);
            for (String str : chars.get(16)) {
                for (String str2 : temp) {
                    if ((str2 + str).length() <= l) {
                        all.add(str2 + str);
                    }
                }
            }
        }
        if (n > 17) {
            ArrayList<String> temp = new ArrayList(all);
            for (String str : chars.get(17)) {
                for (String str2 : temp) {
                    if ((str2 + str).length() <= l) {
                        all.add(str2 + str);
                    }
                }
            }
        }
        if (n > 18) {
            ArrayList<String> temp = new ArrayList(all);
            for (String str : chars.get(18)) {
                for (String str2 : temp) {
                    if ((str2 + str).length() <= l) {
                        all.add(str2 + str);
                    }
                }
            }
        }
        if (n > 19) {
            ArrayList<String> temp = new ArrayList(all);
            for (String str : chars.get(19)) {
                for (String str2 : temp) {
                    if ((str2 + str).length() <= l) {
                        all.add(str2 + str);
                    }
                }
            }
        }
        if (n > 20) {
            ArrayList<String> temp = new ArrayList(all);
            for (String str : chars.get(20)) {
                for (String str2 : temp) {
                    if ((str2 + str).length() <= l) {
                        all.add(str2 + str);
                    }
                }
            }
        }
        if (n > 21) {
            ArrayList<String> temp = new ArrayList(all);
            for (String str : chars.get(21)) {
                for (String str2 : temp) {
                    if ((str2 + str).length() <= l) {
                        all.add(str2 + str);
                    }
                }
            }
        }
        if (n > 22) {
            ArrayList<String> temp = new ArrayList(all);
            for (String str : chars.get(22)) {
                for (String str2 : temp) {
                    if ((str2 + str).length() <= l) {
                        all.add(str2 + str);
                    }
                }
            }
        }
        if (n > 23) {
            ArrayList<String> temp = new ArrayList(all);
            for (String str : chars.get(23)) {
                for (String str2 : temp) {
                    if ((str2 + str).length() <= l) {
                        all.add(str2 + str);
                    }
                }
            }
        }
        if (n > 24) {
            ArrayList<String> temp = new ArrayList(all);
            for (String str : chars.get(24)) {
                for (String str2 : temp) {
                    if ((str2 + str).length() <= l) {
                        all.add(str2 + str);
                    }
                }
            }
        }
        if (n > 25) {
            ArrayList<String> temp = new ArrayList(all);
            for (String str : chars.get(25)) {
                for (String str2 : temp) {
                    if ((str2 + str).length() <= l) {
                        all.add(str2 + str);
                    }
                }
            }
        }
        Collections.sort(all);
        for (String str : all) {
            System.out.println(str);
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
