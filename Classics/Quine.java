public class Main {
    public static void main(String[] args) {
        char q = 34;
        String[] l = {
        "public class Main {",
        "    public static void main(String[] args) {",
        "        char q = 34;",
        "        String[] l = {",
        "        ",
        "        };",
        "        for(int i = 0; i < 4; i++)",
        "            System.out.println(l[i]);",
        "        for(int i = 0; i < l.length; i++)",
        "            System.out.println(l[4] + q + l[i] + q + ',');",
        "        for(int i = 5; i < l.length; i++)",
        "            System.out.println(l[i]);",
        "    }",
        "}",
        };
        for(int i = 0; i < 4; i++)
            System.out.println(l[i]);
        for(int i = 0; i < l.length; i++)
            System.out.println(l[4] + q + l[i] + q + ',');
        for(int i = 5; i < l.length; i++)
            System.out.println(l[i]);
    }
}
