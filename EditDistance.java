public class EditDistance {

    public static void main(String[] args) {

        String s1 = "abc", s2 = "abc";

        System.out.println(findEditDist(s1, s2, s1.length(), s2.length()));
    }

    public static int findEditDist (String s1, String s2, int i, int j){

        if (i==0) return j;
        if (j==0) return i;

        if (s1.charAt(i-1)==s2.charAt(j-1)) {
            return findEditDist(s1, s2, i-1, j-1);
        }
        else {

            return (1 + findMinDist(findEditDist(s1, s2, i-1, j),
                                    findEditDist(s1, s2, i,j-1),
                                    findEditDist(s1, s2, i-1,j-1)));
        }
        //return (1);
    }

    public static int findMinDist (int a, int b, int c) {

        if (a>b) {
            if (b<c) {
                return b;
            }
            else {
                return c;
            }
        }
        else {
            if (a<c) {
                return a;
            }
            else {
                return c;
            }
        }
    }
}
