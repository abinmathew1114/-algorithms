import java.util.*;

public class JumpingNumbers {

    public static void main(String[] args){
        Scanner inputRead = new Scanner(System.in);
        Integer entryCount = inputRead.nextInt();
        //Integer[] inputArray = new Integer[entryCount];

        for (int k=0;k<entryCount;k++){

            Integer maxNumber = inputRead.nextInt();

            for (int i=1;i<10;i++){
                findJumper(i,maxNumber);
            }
        }
    }

    public static void findJumper(int curNum, int maxN){
        Queue<Integer> bfs = new LinkedList<Integer>();
        bfs.add(curNum);

        while(!bfs.isEmpty()){
            int tempNum = bfs.remove();

            if (tempNum<=maxN){
                System.out.print(tempNum+" ");
                int lastDigit = tempNum%10;


                if (lastDigit==0) bfs.add(tempNum*10+1);
                else if (lastDigit==9) bfs.add(tempNum*10+8);
                else {
                    bfs.add(tempNum*10+(lastDigit-1));
                    bfs.add(tempNum*10+(lastDigit+1));
                }
            }



        }
    }
}
