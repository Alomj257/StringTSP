package StringTsp;

public class StringEquals {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "Fahima";
        System.out.println(s1.equals(s2));

        String s3 = "Fahima";
        String s4 = "fahima";
        System.out.println(s3.equals(s4));

        String s5 = "Jahangir";
        String s6 = "Jahangir";
        System.out.println(s5.equals(s6));

        System.out.println(s1.equals(""));
        if(s1.equals("")){
            System.out.println("String can not be empty");
        }
        else{
            System.out.println("Valid String");
        }
    }
}
