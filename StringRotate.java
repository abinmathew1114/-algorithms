import java.util.Scanner;

public class StringRotate {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        int count = scanner.nextInt();
        for (int i=0;i<count;i++){
            String s1 = scanner.next();
            String s2 = scanner.next();

            s2 = s2 + s2;

            int ind = s2.indexOf(s1);

            if (ind==2||ind==4)  System.out.println("1");
            else System.out.println("0");
        }

    }
}
