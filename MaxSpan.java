import javafx.beans.binding.IntegerBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MaxSpan {

    public static void main(String[] args) {
        int[] input = {1,2,1,1,3};
        System.out.println(maxSpan(input));

    }

    public static int maxSpan(int[] nums) {
        if (nums.length==0) return 0;
        HashMap<Integer,ArrayList<Integer>> hmap = new HashMap<Integer,ArrayList<Integer>>();
        for (int i=0;i<nums.length;i++) {
            if (hmap.containsKey(nums[i])) {
                hmap.get(nums[i]).add(i);
            }
            else {
                ArrayList<Integer> temp = new ArrayList<Integer>();
                temp.add(i);
                hmap.put(nums[i],temp);
            }
        }
        Iterator it = hmap.entrySet().iterator();
        int maxVal = Integer.MIN_VALUE;
        while (it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            ArrayList<Integer> temp = hmap.get(pair.getKey());
            int val = temp.get(temp.size()-1)-temp.get(0)+1;
            if (val>maxVal) maxVal = val;
        }
        //System.out.println(maxVal);
        return maxVal;
    }
}
