import java.util.Scanner;

public class RecRemoveAdjacentDuplicates {

    public static void main(String[] args){
        //String input = "acaaabbbcdddd";
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        for (int j=0;j<count;j++){
            String input = scanner.next();

            remDuplicate(input,input.length());
        }


    }

    public static void remDuplicate(String in, int len){

        if (len==0) {
            System.out.println("Empty String");
            return;
        }
        else if (len==1){
            System.out.println(in);
            return;
        }
        char[] inChar = in.toCharArray();
        int k = 0;

        //System.out.println("Recursion program for " + in + " and length " + String.valueOf(len));
        for (int i=1;i<len;i++){

            //System.out.println("Comparing " + inChar[i-1] + " " + inChar[i]);
            if (inChar[i-1]==inChar[i]){
                //bypass the adjacent duplicates
                //System.out.println("adjacent characters identified and bypassing");
                while(inChar[i-1]==inChar[i]){
                    i++;
                    //System.out.println("bypassing till "+ String.valueOf(i-1));
                    if(i==len) break;
                }
            }
            else {
                //fix the character in the main String
                //System.out.println("Setting to input back for "+ String.valueOf(inChar[i-1])+ " at index" + String.valueOf(k));
                inChar[k++] = inChar[i-1];

            }

        }
        if (inChar[len-1]==inChar[len-2]){

        }
        else {
            inChar[k++] = inChar[len-1];
        }

        //in = String.valueOf(inChar);
        String temp = new String();
        for (int l=0;l<k;l++){
            temp = temp + String.valueOf(inChar[l]);
        }
        in = temp;


        if (k==len) {
            System.out.print(in);
            return;
        }
        else remDuplicate(in,k);
    }
}
