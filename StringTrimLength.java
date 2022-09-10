package StringTsp;

public class StringTrimLength {
    public static void main(String[] args) {
        String s = "    Fahima   ";
        System.out.println(s.trim().length());

        String s1 = s.trim();
        int a = s1.length();
        System.out.println(a);

        if(s.trim().length() == 0){
            System.out.println("String is empty");
        }
        else{
            System.out.println("Valid String");
        }
    }
}
