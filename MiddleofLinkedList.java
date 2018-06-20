import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MiddleofLinkedList {

    public static void main(String[] args){
        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(7);
        list.add(9);
        list.add(4);
        Iterator<Integer> iterSlow = list.iterator();
        Iterator<Integer> iterFast = list.iterator();
        int i = 0, output = 0;
        for(;iterFast.hasNext();i++){
            iterFast.next();
            if (i%2==0) {
                output = iterSlow.next();
            }
        }
        System.out.print(output);
        if(i%2==0) System.out.print(" "+iterSlow.next());
    }
}
