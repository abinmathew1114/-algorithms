import java.util.Arrays;
import java.util.Scanner;

public class MaxSubArray {

    public static void main(String[] args){

        Scanner inputRead = new Scanner(System.in);
        Integer entryCount = inputRead.nextInt();
        //Integer[] inputArray = new Integer[entryCount];

        for (int k=0;k<entryCount;k++){
            Integer elementCount = inputRead.nextInt();
            Integer subArraySize = inputRead.nextInt();
            Integer[] inputArray = new Integer[elementCount];

            for (int i=0;i<elementCount;i++){
                inputArray[i] = inputRead.nextInt();
            }
            int currentMax;
            for(int i=0;i<=elementCount-subArraySize;i++){
                currentMax = inputArray[i];
                for (int j=i+1;j<i+subArraySize;j++){

                    if (inputArray[j]>currentMax) currentMax = inputArray[j];

                }
                System.out.print(currentMax+" ");

            }
            System.out.println();
        }
    }

}
