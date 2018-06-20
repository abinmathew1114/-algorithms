import java.util.Scanner;

public class PlatformAllocation {

    public static void main(String[] args){

        Scanner inputRead = new Scanner(System.in);
        Integer entryCount = inputRead.nextInt();
        //Integer[] inputArray = new Integer[entryCount];

        for (int k=0;k<entryCount;k++){
            Integer trainCount = inputRead.nextInt();
            Integer[] arrivalArray = new Integer[trainCount+1];
            Integer[] departureArray = new Integer[trainCount+1];
            for (int i=1;i<=trainCount;i++){
                arrivalArray[i] = inputRead.nextInt();
            }
            for (int i=1;i<=trainCount;i++){
                departureArray[i] = inputRead.nextInt();
            }
            int platformCount = 0; int tempCounter;
            for (int i=0;i<=2359;i++){
                tempCounter = 0;
                for (int j=1;j<=trainCount;j++) {

                    if (arrivalArray[j]<=i && departureArray[j]>=i) {
                        tempCounter++;
                    }


                }
                //System.out.println("Platform count for "+i+" minute is "+tempCounter);
                if (tempCounter>platformCount) {
                    platformCount = tempCounter;
                    //System.out.println("Current platform count is "+platformCount);
                }


            }
            System.out.println(platformCount);
        }
    }

}
