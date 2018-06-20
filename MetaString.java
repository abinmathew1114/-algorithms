import java.util.Scanner;

public class MetaString {

    public static void main (String[] args){
        Scanner inputRead = new Scanner(System.in);
        Integer entryCount = inputRead.nextInt();
        //Integer[] inputArray = new Integer[entryCount];

        for (int k=0;k<entryCount;k++){
            String string1 = inputRead.next();
            String string2 = inputRead.next();
            boolean flag = true;
            if (string1.equals(string2) || string1.length()!=string2.length()) {
                //System.out.println("0");
                flag = false;
            }

            char[] cstring1 = string1.toCharArray();
            char[] cstring2 = string2.toCharArray();
            int counter=0;
            for (int i=0;i<string1.length()&&flag==true;i++){
                if (cstring1[i]!=cstring2[i]){
                    counter++;
                    if (counter>2) {
                        //System.out.println("0");
                        flag = false;
                    }
                    else {
                        char temp = cstring1[i];
                        cstring1[i] = cstring2[i];
                        cstring2[i] = temp;
                    }
                }


            }
            if (new String(cstring1)==new String(cstring2)) flag = false;

            if (flag==false) System.out.println("0");
            else System.out.println("1");

        }
    }
}
