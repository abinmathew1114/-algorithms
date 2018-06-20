import java.util.Scanner;



public class RainWaterTrap {


    public static void main(String[] args){

        int[] input = {3,0,0,2,0,4};

        System.out.println(trappedRain(input));

    }

    public static int trappedRain(int[] input){

        int l = 0, r = input.length-1;
        int lMax = -1, rMax = -1, rainWater = 0;
        while (l<r){

            if (input[l]<=input[r]) {

                if (input[l]>lMax){
                    lMax = input[l];
                }
                else {
                    rainWater+=(lMax-input[l]);
                }
                l++;
            }
            else {

                if (input[r]>rMax) {
                    rMax = input[r];
                }
                else {
                    rainWater+=(rMax-input[r]);
                }
                r--;
            }
            System.out.println("l is "+l+" r is "+r+" Rainwater now "+rainWater);
        }
        return rainWater;
    }
}
