public class kthLargest {

    /*Find the kth largest element in a given array*/

    public static void main(String[] args) {

        Integer[] input = {3,5,2,1,4,0};
        int k = 2;
        int swap = 0;
        for (int i=input.length-1;i>k;i--) {
            swap = 0;

            for (int j=0;j<i;j++) {

                if (input[j]>input[j+1]) {
                    swap = 1;
                    int temp = input[j+1];
                    input[j+1] = input[j];
                    input[j] = temp;

                }
            }

            if (swap==0) {
                break;
            }
        }

        System.out.print(" "+input[k+1]);




    }
}
