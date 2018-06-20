public class InsertionSort {

    public static void main(String[] args){
        int[] a = {1,5,4,3,0};

        for(int i=1;i<5;i++){
            int value = a[i];
            int j = i-1;
            while (j>=0 && a[j]>value){
                a[j+1]=a[j];
                j--;
            }
            a[j+1] = value;

            for (int k=0;k<5;k++) System.out.print(a[k]);
            System.out.println();
        }
    }
}
