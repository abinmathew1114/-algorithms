import java.util.HashSet;
import java.util.Set;

public class LongestSubstrwithKdistinct {


    public static void main(String[] args){
        String input = "a";
        int k = 2;
        int tempK = 0, maxLen = Integer.MIN_VALUE;

        Set<Character> hSet = new HashSet<Character>();
        for (int i=0;i<input.length();i++){
            hSet.add(input.charAt(i));
            int j = i+1;
            tempK = 1;
            for (;j<input.length();j++){
                //System.out.println("Current String is "+i+" " + j +" k length is "+tempK);
                if (hSet.contains(input.charAt(j))){

                }
                else {
                    tempK++;
                    if (tempK>k){
                        break;
                    }

                    hSet.add(input.charAt(j));
                }
                //System.out.println("Current String is "+input.substring(i,j)+" k length is "+tempK);
            }
            //System.out.println(input.substring(i,j));
            if (j-i>maxLen && tempK==k){
                maxLen = j-i;
                //System.out.println("test Current String is "+input.substring(i,j)+" k length is "+tempK+ "max len is "+maxLen);
            }
        }

        if (maxLen==-2147483648) {
            System.out.println(-1);
        }
        else {
            System.out.println(maxLen);
        }

    }
}
