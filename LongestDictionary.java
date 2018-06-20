import java.util.Scanner;

public class LongestDictionary {
    public static void main(String[] args){
        Scanner inputRead = new Scanner(System.in);
        Integer entryCount = inputRead.nextInt();
        //Integer[] inputArray = new Integer[entryCount];
        for (int k=0;k<entryCount;k++){
            int dicCount = inputRead.nextInt();
            String[] dicArray = new String[dicCount];
            for (int i=0;i<dicCount;i++){
                dicArray[i] = inputRead.next();
            }
            String inpString = inputRead.next();
            int maxLength = 0;
            String maxWord = "";
            for (int i=0;i<dicCount;i++){
                //System.out.print("For dictionary word "+dicArray[i]);
                if(subCheck(inpString,dicArray[i])&&dicArray[i].length()>maxLength) {
                    maxLength=dicArray[i].length();
                    maxWord = dicArray[i];
                    //System.out.print("Longest word as of now is "+maxWord);
                }

            }
            System.out.println(maxWord);
        }
    }
    public static boolean subCheck(String string1, String string2){
        char[] char1 = string1.toCharArray();
        char[] char2 = string2.toCharArray();
        int j = 0;
        for (int i=0;i<string1.length()&&j<string2.length();i++){
            if (char1[i]==char2[j]) {
                j++;
            }
        }

        if (j==string2.length()) {
            //System.out.println("For word "+string1+" dictionary word "+string2+" is a substring");
            return true;
        }
        else {
            //System.out.println("For word "+string1+" dictionary word "+string2+" is a NOT 1substring");
            return false;
        }
    }

}
