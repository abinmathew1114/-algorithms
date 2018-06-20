import java.util.Arrays;
import java.util.Scanner;

public class Triplets {

    public static void main(String[] args){
        Scanner inputRead = new Scanner(System.in);
        Integer entryCount = inputRead.nextInt();
        //Integer[] inputArray = new Integer[entryCount];

        for (int k=0;k<entryCount;k++){
            Integer arrayCount = inputRead.nextInt();
            Integer[] arrayList = new Integer[arrayCount];
            for (int i=0;i<arrayCount;i++){
                arrayList[i] = inputRead.nextInt();
            }
            Arrays.sort(arrayList);
            boolean found = false;
            for (int i=0;i<arrayCount&&found==false;i++){
                int l = i+1,r = arrayCount-1;
                while (l<r){
                    int curSum = arrayList[i]+arrayList[l]+arrayList[r];
                    if (curSum==0){
                        System.out.println("1");
                        found = true;
                        break;
                    }
                    else if (curSum>0){
                        r--;
                    }
                    else {
                        l++;
                    }
                }
            }
            if (found==false) System.out.println("0");

        }
    }

}
