import java.util.Scanner;

public class StreamMedian {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Integer[] input = new Integer[count];
        for (int i=0;i<count;i++) {
            input[i] = scanner.nextInt();
            int k = i-1;
            int temp = input[i];
            //perform insertion sort
            int j;
            for (j=0;j<i;j++) {
                if (input[j]>input[i]) {
                    break;
                }
            }
            while (k>j && k>=0) {
                input[k+1] = input[k];
            }
            input[k] = temp;
            //print median
            if (i%2==0) {
                System.out.println(input[i/2]);
            }
            else {
                System.out.println((input[i/2]+input[i/2+1])/2);
            }

        }
    }
}
