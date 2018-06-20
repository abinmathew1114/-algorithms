import java.util.TreeSet;

public class KEmptySlots {
    /*Identify n empty slots between two non-empty slots. Given an array of days
    and the element in the array will show the slot that will get filled that day
    */
    public static void main(String[] args){

        //Array of filled slots indexed by days
        Integer[] slots = {1,7,9,5};
        //n stores the empty slot count to be searched for
        Integer n = 2;

        TreeSet<Integer> tset = new TreeSet<Integer>();

        for(int i=0;i<slots.length;i++){
            tset.add(slots[i]);
            if (tset.lower(slots[i])!=null){
                if (i-tset.lower(slots[i])-1==n){
                    System.out.println(i+1);
                    return;
                }
            }
            if (tset.higher(slots[i])!=null){
                if (tset.higher(slots[i])-i-1==n) {
                    System.out.println(i+1);
                    return;
                }
            }

        }
        System.out.println(-1);
        return;
    }
}
