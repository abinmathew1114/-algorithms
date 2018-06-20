import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class FrequencySort {


    public static void main(String[] args){

        Integer[] input = {8,4,5,3,2,9,2,4,8,3,4,5,4,9,8};

        HashMap<Integer,Integer> hmap = new HashMap<Integer, Integer>();

        for(int i=0;i<input.length;i++){
            if(hmap.containsKey(input[i])){
                int val = hmap.get(input[i]);
                hmap.put(input[i],++val);
            }
            else {
                hmap.put(input[i],1);
            }
        }
        System.out.println(hmap.entrySet());
        Integer[] kArray = new Integer[20];
        Integer[] vArray = new Integer[20];
        int ind = 0;
        for(Integer key: hmap.keySet()){
            Integer val = hmap.get(key);
            kArray[ind] = key;
            vArray[ind] = val;
            ind++;
        }
        for (int i=0;i<ind;i++){
            for (int j=i+1;j<ind;j++){
                if (vArray[i]<vArray[j]){
                    int temp = vArray[j];
                    vArray[j] = vArray[i];
                    vArray[i] = temp;
                    temp = kArray[j];
                    kArray[j] = kArray[i];
                    kArray[i] = temp;
                }
            }
        }
        for (int i=0;i<ind;i++){
            for (int j=0;j<vArray[i];j++){
                System.out.print(kArray[i]+" ");
            }
        }

    }
}
