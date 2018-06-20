import java.util.HashMap;

public class Trie {

    static HashMap<Character,Integer> charMap = new HashMap<Character, Integer>();
    static int range = 26;

    static class TrieNode {
        //Character value;
        boolean end;
        TrieNode[] children = new TrieNode[range + 1];

        TrieNode() {
            //value = null;
            end = false;
            for (int i = 1; i <= range; i++) {
                children[i] = null;
            }
        }
    };

    static TrieNode root = new TrieNode();

    static boolean search(String sKey) {
        TrieNode trace = root;
        for (int i=0;i<sKey.length();i++) {
            Character sChar = sKey.charAt(i);
            int index = charMap.get(sChar);
            if (trace.children[index] != null) {
                trace = trace.children[index];
            }
            else {
                return false;
            }


        }

        return trace.end;
    }

    static void insert (String sKey) {

        TrieNode trace = root;

        for (int i=0;i<sKey.length();i++) {
            int index = charMap.get(sKey.charAt(i));

            if (trace.children[index] == null) {
                trace.children[index] = new TrieNode();
            }
            trace = trace.children[index];

        }
        trace.end = true;
    }

    public static void main(String[] args) {
        charInit();
        insert("test");
        insert("testabc");
        insert("tes");

        System.out.println(search("te"));

    }

    static void charInit() {
        int i =1;
        for (Character c='a';c<='z';c++,i++) {
            charMap.put(c,i);
        }

    }
}
