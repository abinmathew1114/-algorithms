import java.util.LinkedHashSet;
import java.util.Set;

public class NonRepeatingSubString {

    public static void main(String[] args){

        String input = "abababcdefababcdab";
        char[] inChar = input.toCharArray();
        Set<String> lhset = new LinkedHashSet<String>();
        int len;
        int maxLen = Integer.MIN_VALUE;
        for(int i=0;i<input.length();i++){
            lhset.clear();
            len = 0;
            for(int j=i;j<input.length();j++){
                if(lhset.contains(""+inChar[j])){
                    if(len>maxLen){
                        maxLen = len;
                    }
                }
                else {
                    lhset.add(""+inChar[j]);
                    len++;
                }
            }

        }
        System.out.println(maxLen);
    }
}
