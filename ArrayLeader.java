import java.util.Scanner;

public class ArrayLeader {

    public static void main(String[] args){

        Scanner inputRead = new Scanner(System.in);
        Integer entryCount = inputRead.nextInt();
        //Integer[] inputArray = new Integer[entryCount];

        for (int k=0;k<entryCount;k++){
            Integer elementCount = inputRead.nextInt();
            //Integer sumValue = inputRead.nextInt();
            Integer[] inputArray = new Integer[elementCount+1];
            Integer[] outputArray = new Integer[elementCount+1];
            for (int i=1;i<=elementCount;i++){
                inputArray[i] = inputRead.nextInt();
            }
            boolean outputFlag = false;
            int l = 0;
            outputArray[l++]=inputArray[elementCount];
            for (int i=elementCount-1;i>=1;i--){
                outputFlag = false;
                //System.out.println("For i value : "+i);
                for (int j=i+1;j<=elementCount;j++){
                    //System.out.println("For j value : "+j);
                    if (inputArray[i]<=inputArray[j]){
                        outputFlag = true;
                        //System.out.println("Breaking condition for values "+ inputArray[i]+ " " + inputArray[j]);
                        break;
                    }
                }
                if (outputFlag==false) outputArray[l++]=inputArray[i];

            }
            //for (int m=0;m<l;m++) System.out.print(outputArray[m]);
            //return;
            while (--l>=0) System.out.print(outputArray[l]+" ");
            System.out.println();
        }
    }

}
