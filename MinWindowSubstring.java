import java.util.LinkedHashMap;
import java.util.Map;

public class MinWindowSubstring {

    /*Given two Strings, find out the smallest window in s1 that contains all elements in s2*/

    public static void main(String[] args) {

        String s1 = "adobecodebanc";
        String s2 = "abc";

        Map<String, Integer> lMap = new LinkedHashMap<String, Integer>();
        Integer[] i1 = new Integer[s1.length()];

        for (int i=0,count=1;i<s2.length();i++) {
            if (!lMap.containsKey(s2.charAt(i))) {
                lMap.put(""+s2.charAt(i),count++);
            }
        }

        for (int i=0;i<s1.length();i++) {
            if (lMap.containsKey(""+s1.charAt(i))) {
                i1[i] = lMap.get(""+s1.charAt(i));
            }
            else {
                i1[i] = 0;
            }
        }

        for (int i=0;i<s1.length();i++) {
            System.out.print(i1[i]);
        }


        for (int i=0;i<s1.length();i++) {


        }

    }
}
