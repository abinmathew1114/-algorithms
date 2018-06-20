import java.util.Scanner;

public class MissingArray {

    public static void main(String[] args) {

        //Integer[] inputArray = {1,2,3,4,5,7,8,9};
        Scanner inputRead = new Scanner(System.in);
        Integer entryCount = inputRead.nextInt();
        Integer[] inputArray = new Integer[entryCount];

        for (int i=0;i<entryCount;i++){
            Integer elementCount = inputRead.nextInt();
            inputArray[i] = (elementCount*(elementCount+1))/2;
            System.out.println("Sum :"+inputArray[i]);
            for (int j=1;j<elementCount;j++){
                inputArray[i]-=inputRead.nextInt();
            }
            System.out.println("Output :"+inputArray[i]);
        }

    }
}
