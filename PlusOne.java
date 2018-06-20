public class PlusOne {

    public static void main(String[] args) {

        int[] input = {9,9};
        int integer = 0;

        int flag = 0;
        for (int i=0;i<input.length;i++) {
            integer = (integer*10)+input[i];
            if (input[i]!=9) flag = 1;
        }
        integer++;
        int outLen;
        if (flag==1){
            outLen = input.length;
        }
        else {
            outLen = input.length+1;
        }
        int[] output = new int[outLen];
        for (int i=outLen-1;i>=0;i--) {
            int temp = integer/ ((int) Math.pow(10, i));
            integer = integer% ((int) Math.pow(10, i));
            output[i] = temp;
        }
        for (int i=outLen-1;i>=0;i--) {
            System.out.print(output[i]);
        }
    }
}
