import java.util.Scanner;

public class SumSubArray {

    public static void main(String[] args){

        Scanner inputRead = new Scanner(System.in);
        Integer entryCount = inputRead.nextInt();
        //Integer[] inputArray = new Integer[entryCount];

        for (int k=0;k<entryCount;k++){
            Integer elementCount = inputRead.nextInt();
            Integer sumValue = inputRead.nextInt();
            Integer[] inputArray = new Integer[elementCount+1];
            for (int i=1;i<=elementCount;i++){
                inputArray[i] = inputRead.nextInt();
            }
            boolean outputFlag = false;
            for (int i=1;i<=elementCount&&outputFlag==false;i++){
                Integer sum = 0, j = i;
                while (j<=elementCount&&outputFlag==false){
                    sum+=inputArray[j];
                    //System.out.println("i "+ i +" j "+ j +" "+ "Value "+ inputArray[j]+" sum "+ sum+" Expected sum "+sumValue);
                    if (sum.equals(sumValue))
                    {
                        System.out.println(i +" "+j );
                        outputFlag = true;
                        //return;
                    }
                    else if (sum>sumValue) {
                        //System.out.println("sum greater than required exiting "+i+" "+j);
                        break;
                    }

                    j++;
                }
            }
            if(outputFlag==false) System.out.println(-1);
            //return;
        }
    }
}
