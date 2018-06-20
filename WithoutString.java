public class WithoutString {

    public static void main(String[] args) {

        System.out.println(withoutString("Hello there", "e"));
    }

    public static String withoutString(String base, String remove) {

       while (base.toLowerCase().indexOf(remove.toLowerCase())!=-1) {
           int index = base.toLowerCase().indexOf(remove.toLowerCase());
           int offset = remove.length();
           base = base.substring(0,index) + base.substring(index+offset);
       }

        return base;


    }

}
