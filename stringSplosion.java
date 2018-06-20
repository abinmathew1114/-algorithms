public class stringSplosion {

    public static void main(String[] args) {

        String s = "Code";

        System.out.println(stringSplosion(s));
    }

    public static String stringSplosion(String str) {
        String temp = "";
        String prefix = "";
        for (int i=0;i<str.length();i++) {
            char a = str.charAt(i);
            prefix = prefix+a;
            temp = temp+prefix;
        }
        return temp;
    }
}
