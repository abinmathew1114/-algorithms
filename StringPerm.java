import java.util.Arrays;
import java.util.Scanner;

public class StringPerm {

    public static void main (String[] args){
        Scanner inputRead = new Scanner(System.in);
        Integer entryCount = inputRead.nextInt();
        //Integer[] inputArray = new Integer[entryCount];

        for (int k=0;k<entryCount;k++){
            int numCount = inputRead.nextInt();

            System.out.println(findPermCount(numCount,1,2));
        }
    }

    public static int findPermCount(int numN, int bCount, int cCount){
        if (bCount<0||cCount<0) return 0;
        if (numN==0) return 1;

        if (bCount==0&&cCount==0) return 1;

        int permCount = findPermCount(numN-1,bCount,cCount);
        permCount+= findPermCount(numN-1,bCount-1,cCount);
        permCount+= findPermCount(numN-1,bCount,cCount-1);

        return permCount;
    }
}
