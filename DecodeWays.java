public class DecodeWays {

    public static void main(String[] args) {

        String input = "121";
        char[] inChar = input.toCharArray();
        System.out.println(findDecodeWays(inChar, inChar.length));

    }

    public static int findDecodeWays(char[] input, int count) {
        int val = 0;
        if (count==0||count==1) return 1;
        int last = Integer.parseInt(""+input[count-1]);
        int penlt = Integer.parseInt(""+input[count-2]);
        if (last>0) val = findDecodeWays(input, count-1);
        if (penlt==1||(penlt==2&&last<7)) {
            val+= findDecodeWays(input, count-2);
        }
        return val;
    }
}
