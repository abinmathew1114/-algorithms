import java.util.Scanner;

public class Equilibrium {

    public static void main(String[] args){
        Scanner inputRead = new Scanner(System.in);
        Integer entryCount = inputRead.nextInt();
        //Integer[] inputArray = new Integer[entryCount];

        for (int k=0;k<entryCount;k++){
            int elementCount = inputRead.nextInt();
            //int sumValue = inputRead.nextInt();
            int[] inputArray = new int[elementCount+1];
            int totalSum = 0;
            for (int i=1;i<=elementCount;i++){
                inputArray[i] = inputRead.nextInt();
                totalSum+=inputArray[i];
            }
            if (elementCount==1) {
                System.out.println(1);
                continue;
            }
            int curSum = 0;
            totalSum-=inputArray[1];
            for (int i=1;i<elementCount;){
                if (curSum==totalSum) {
                    System.out.println(i);
                    break;
                }
                else{
                    curSum+=inputArray[i];
                    i++;
                    totalSum-=inputArray[i];
                    System.out.println("Element : "+inputArray[i]+" PreSum : "+curSum+ " PostSum : "+totalSum);
                }

            }
            if (curSum!=totalSum) System.out.println(-1);
            //else System.out.println(inputArray[1]);
        }
    }
}
