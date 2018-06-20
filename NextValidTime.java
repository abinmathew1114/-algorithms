
import java.util.HashSet;
import java.util.Set;

public class NextValidTime {

    /*  This program has an input time and the output should be the next possible time which contains
        only the digits present in the input time. For example, if input is 9:35, then output is 9:39
    */
    public static void main(String[] args){
        String input = "23:58";

        //adding a leading 0 for the time in case of a single digit hour
        if (input.indexOf(':')!=2) input = "0"+input;

        //extract the hour and digit and identify the minute of the day
        int hour = Integer.parseInt(input.substring(0,input.indexOf(":")));
        int min = Integer.parseInt(input.substring(input.indexOf(":")+1,input.length()));
        int inputMin = hour*60 + min;

        //save the digits in a set for generation of other possible times
        Set<Character> hSet = new HashSet<Character>();
        for(int i=0;i<input.length();i++){
            if (input.charAt(i)!=':') {
                hSet.add(input.charAt(i));
            }
        }

        int minDiff = Integer.MAX_VALUE;
        int finalHour = 0, finalMin = 0;
        for (Character h1: hSet){
            for (Character h2: hSet){
                //find all possible hours
                String h = h1.toString()+h2.toString();

                if (Integer.parseInt(h)<24){

                    for (Character m1: hSet){
                        for (Character m2: hSet){
                            //find all possible minutes
                            String m = m1.toString()+m2.toString();

                            if (Integer.parseInt(m)<60) {

                                int curMin = Integer.parseInt(h)*60 + Integer.parseInt(m) ;

                                //next valid minute within same day
                                if (curMin>inputMin && curMin-inputMin<minDiff) {
                                    finalHour = Integer.parseInt(h);
                                    finalMin = Integer.parseInt(m);
                                    minDiff = curMin - inputMin;
                                }

                                //next valid minute the next day
                                else if (curMin<inputMin){
                                    int tempDiff = curMin + (1439 - inputMin);
                                    if (tempDiff<minDiff) {
                                        finalHour = Integer.parseInt(h);
                                        finalMin = Integer.parseInt(m);
                                        minDiff = tempDiff;
                                    }
                                }

                            }
                        }
                    }
                }
            }
        }
        System.out.println(finalHour+":"+finalMin);



    }
}
