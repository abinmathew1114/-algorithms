import java.util.Arrays;
import java.util.Scanner;

public class Pythagorean {


    public static void main(String[] args){

        Scanner inputRead = new Scanner(System.in);
        Integer entryCount = inputRead.nextInt();
        //Integer[] inputArray = new Integer[entryCount];

        for (int k=0;k<entryCount;k++){
            Integer elementCount = inputRead.nextInt();
            Integer[] inputArray = new Integer[elementCount];
            boolean found = false;
            for (int i=0;i<elementCount;i++){
                inputArray[i] = inputRead.nextInt();
            }
            for (int i=0;i<elementCount;i++){
                inputArray[i]*=inputArray[i];
            }
            Arrays.sort(inputArray);
            for (int i=elementCount-1;i>=0&&found==false;i--){

                int l=0, r=elementCount-2;

                while (l<r) {

                    if (inputArray[l]+inputArray[r] == inputArray[i]){
                        //System.out.println(inputArray[l]+" "+inputArray[r]+" "+inputArray[i]);
                        System.out.println("Yes");
                        found = true;
                        break;
                    }
                    else if (inputArray[l]+inputArray[r] > inputArray[i]){
                        r--;
                    }
                    else l++;
                }
            }
            if (found==false) System.out.println("No");
            //return;
        }
    }
}
