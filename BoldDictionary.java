import java.util.HashSet;
import java.util.Set;

public class BoldDictionary {
    /*
        This programs takes a dictionary and a String as input and output should be the input with
        bold segments for words from dictionary.
        For eg., abc and 123 are dictionary words and abcxyz123 is input then output should be
        <b>abc</b>xyz<b>123</b>
    */
    public static void main(String[] args){

        //Input dictionary
        Set<String> dictionary = new HashSet<String>();
        dictionary.add("abc");
        dictionary.add("123");

        //Input String
        String input = "abcxyz123abc";

        //Maintain an array to store the index of input String
        //Value is 1 for all characters of dictionary words and 0 for others
        int[] index = new int[input.length()+1];

        //For each dictionary word, set the index array value as 1 for the matching index in the String
        for(String key: dictionary) {
            String temp = input;
            int offset = 0;
            System.out.println("In for key "+key+" on String "+temp);
            while(temp.indexOf(key)!=-1) {
                for (int i=0;i<key.length();i++) {
                    index[i+offset+temp.indexOf(key)] = 1;
                }
                offset+= temp.indexOf(key)+key.length();
                temp = temp.substring(temp.indexOf(key)+key.length());
                System.out.println("temp now is "+temp+" and offset is "+offset);

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
        for(int i=0;i<index.length-1;i++) {
            if (index[i]==1){
                System.out.print("<b>");
                while (index[i]==1){
                    System.out.print(""+inChar[i]);
                    i++;
                }
                i--;
                System.out.print("</b>");
            }
            else {
                System.out.print(""+inChar[i]);
            }
        }
    }
}
