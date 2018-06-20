public class BubbleSort {

    public static void main(String[] args){
        int[] array = {1,5,4,3,0};

        for(int i=4;i>0;i--){
            int swap = 0;
            for (int j=0;j<i;j++){
                if (array[j]>array[j+1]){
                    swap = 1;
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            for (int k=0;k<5;k++) System.out.print(array[k]);
            System.out.println();
            if (swap==0) break;
        }
    }
}
