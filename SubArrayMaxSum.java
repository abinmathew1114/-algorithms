import java.util.Scanner;

public class SubArrayMaxSum {


    public static void main (String[] args){

        Scanner inputRead = new Scanner(System.in);
        Integer entryCount = inputRead.nextInt();
        //Integer[] inputArray = new Integer[entryCount];

        for (int k=0;k<entryCount;k++){
            int elementCount = inputRead.nextInt();
            //int sumValue = inputRead.nextInt();
            int[] inputArray = new int[elementCount+1];
            int[] outputArray = new int[elementCount+1];
            int totalSum = 0;
            inputArray[0] = 0;
            for (int i=1;i<=elementCount;i++){
                inputArray[i] = inputRead.nextInt();
                //totalSum+=inputArray[i];
                outputArray[i] = inputArray[i];
            }
            for (int i=2;i<=elementCount;i++){
                for (int j=1;j<i;j++){
                    if (inputArray[i]>inputArray[j] && outputArray[i]<outputArray[j]+inputArray[i]){
                        outputArray[i] = outputArray[j]+inputArray[i];
                    }
                }
            }
            for (int i=1;i<=elementCount;i++){
                if (totalSum<outputArray[i]) totalSum=outputArray[i];
            }
            System.out.println(totalSum);
        }
    }
}
