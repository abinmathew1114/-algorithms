import java.util.Scanner;

public class GenBinaryString {

    public static int counter, factorial;

    public static void main (String[] args){

        Scanner inputRead = new Scanner(System.in);
        Integer entryCount = inputRead.nextInt();
        //Integer[] inputArray = new Integer[entryCount];

        for (int k=0;k<entryCount;k++){
            String string = inputRead.next();
            counter = 0;
            factorial = 1;
            for (int i=0;i<string.length();i++){
                if (string.charAt(i)=='?') {
                    counter++;
                }
                //factorial*=(i+1);
            }
            for (int i=1;i<=counter;i++){
                factorial*=2;
            }
            //System.out.println("Number of possibilies for "+string+"  is "+factorial);
            String[] permuteString = new String[factorial+1];
            //System.out.println("Permutations : ");
            for (int i=0;i<factorial;i++){
                permuteString[i] = generateBinary(i);
                //System.out.print(permuteString[i]+" ");
            }

            for (int i=0;i<factorial;i++){
                char[] newString = permuteString[i].toCharArray();
                char[] originalString = string.toCharArray();
                int newStringlen = 0;
                for (int j=0;j<originalString.length;j++){
                    if (originalString[j]=='?'){
                        originalString[j] = newString[newStringlen++];
                    }
                }

                System.out.print(new String (originalString)+" ");
            }
            System.out.println();
        }
    }

    public static String generateBinary (int inputNumber){
        Integer reminder;
        String outputNumber = "";
        //System.out.print("For input "+inputNumber);
        do {
            reminder = inputNumber%2;
            inputNumber = inputNumber/2;
            outputNumber = outputNumber+reminder.toString();
        }while (inputNumber>0);
        //System.out.print(" output number is "+outputNumber);
        StringBuilder outputNumber1 = new StringBuilder(outputNumber);
        //outputNumber = outputNumber1.toString();
        outputNumber = outputNumber1.reverse().toString();
        if (outputNumber.length()<counter){
            while(counter>outputNumber.length()){
                outputNumber="0"+outputNumber;
            }
        }
        //System.out.print(" and after formatting output is "+outputNumber);
        //System.out.println();
        return outputNumber;
    }
}
