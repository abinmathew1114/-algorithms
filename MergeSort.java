public class MergeSort {

    public static void main(String[] args){

        int[] a = {1,5,4,3,0};

        mergeSort(a,0,4);

        for (int k=0;k<5;k++) System.out.print(a[k]);

    }

    public static void mergeSort(int array[], int left, int right){

        if(left<right){
            int m = (left+right)/2;

            mergeSort(array,left,m);
            mergeSort(array,m+1,right);

            merge(array,left,m,right);


        }
        return;
    }

    public static void merge(int array[], int l, int m, int r){

        int n1 = m-l+1;
        int n2 = r-m;

        int[] lArray = new int[n1];
        int[] rArray = new int[n2];

        for (int i=0;i<n1;i++) lArray[i] = array[l+i];
        for (int j=0;j<n2;j++) rArray[j] = array[m+1+j];


        int i=0, j=0, k=l;

        while (i<n1&&j<n2){
            if (lArray[i]<=rArray[j]){
                array[k] = lArray[i++];
            }
            else{
                array[k] = rArray[j++];
            }
            k++;
        }
        while (i<n1){
            array[k++] = lArray[i++];
        }
        while (j<n2){
            array[k++] = rArray[j++];
        }

        return;

    }
}
