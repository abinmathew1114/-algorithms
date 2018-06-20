import java.util.*;

public class MaxValNumber {



    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("54");
        list.add("546");
        list.add("548");
        list.add("60");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String o12 = o1+o2;
                String o21 = o2+o1;
                return o12.compareTo(o21) > 0 ? -1:1;
            }
        });
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next());
        }
    }
}
