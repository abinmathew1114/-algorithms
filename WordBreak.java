import java.util.HashSet;
import java.util.Set;

public class WordBreak {


        public static void main(String[] args) {

            //Input dictionary
            Set<String> dictionary = new HashSet<String>();
            dictionary.add("cats");
            dictionary.add("dog");
            dictionary.add("sand");
            dictionary.add("and");
            dictionary.add("cat");

            //Input String
            String input = "catsandog";

            //Maintain an array to store the index of input String
            //Value is 1 for all characters of dictionary words and 0 for others
            int[] index = new int[input.length() + 1];

            //For each dictionary word, set the index array value as 1 for the matching index in the String
            for (String key : dictionary) {
                String temp = input;
                int offset = 0;
                //System.out.println("In for key " + key + " on String " + temp);
                while (temp.indexOf(key) != -1) {
                    for (int i = 0; i < key.length(); i++) {
                        index[i + offset + temp.indexOf(key)]++;
                    }
                    offset += temp.indexOf(key) + key.length();
                    temp = temp.substring(temp.indexOf(key) + key.length());
                    //System.out.println("temp now is " + temp + " and offset is " + offset);

                }
            /*
            if(input.indexOf(key)!=-1){
                for (int i=0;i<key.length();i++) {
                    index[i+input.indexOf(key)] = 1;
                }
            }
            */
            }

            //Print the output String with the help of the index array
            char[] inChar = input.toCharArray();
            for (int i = 0; i < index.length - 1; i++) {
                if (index[i]!=1) {
                    System.out.println("False");
                    return;
                }


            }
            System.out.println("True");
            return;
        }

}
