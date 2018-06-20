public class SelectionSort {

    public static void main(String[] args){
        int[] array = {1,5,4,3,0};

        for (int i=0;i<4;i++){
            int min = i;
            for (int j=i+1;j<5;j++){
                if (array[min]>array[j]){
                    min = j;
                }
            }
            if(min!=i){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
                for (int k=0;k<5;k++)System.out.print(array[k]);
                System.out.println();
            }


        }

    }
}
