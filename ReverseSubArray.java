import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseSubArray {


    public static void main(String[] args){

        Scanner inputRead = new Scanner(System.in);
        Integer entryCount = inputRead.nextInt();
        for (int k=0;k<entryCount;k++){
            Integer elementCount = inputRead.nextInt();
            Integer[] inputArray = new Integer[elementCount+1];
            for (int i=1;i<=elementCount;i++){
                inputArray[i] = inputRead.nextInt();
            }
            Integer subArraySize = inputRead.nextInt();
            Stack<Integer> elementStack = new Stack<Integer>();
            for (int i=1;i<=elementCount;i++){
                elementStack.push(inputArray[i]);
                if (i%subArraySize==0){
                    while(!elementStack.empty()) System.out.print(elementStack.pop()+" ");
                }
            }
            while(!elementStack.empty()) System.out.print(elementStack.pop()+" ");
            System.out.println();
        }
    }
}
