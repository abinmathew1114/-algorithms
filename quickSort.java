public class quickSort {

    public static void main(String[] args){

        int[] array = {1,5,4,3,0};
        qckSort(array,0,4);
        for (int k=0;k<5;k++) System.out.print(array[k]+" ");

    }

    public static void qckSort(int a[],int l, int r){
        if (l<r){
            int pivot = partition(a,l,r);
            for(int h=0;h<a.length;h++) System.out.print(a[h]+" ");
            System.out.println();
            qckSort(a,l,pivot-1);
            qckSort(a,pivot+1,r);
        }


    }

    public static int partition(int a[], int l, int r){
        int i = l-1;
        int pivot = a[r];
        for (int j=l;j<r;j++){
            if (a[j]<=pivot){
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[r];
        a[r] = temp;

        return (i+1);
    }

}
