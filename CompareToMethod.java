package StringTsp;

public class CompareToMethod {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "A";
        System.out.println(s1.compareTo(s2));

        String s3 = "A";
        String s4 = "a";
        System.out.println(s3.compareTo(s4));

        String s5 = "FAhima";
        String s6 = "fahimA";
        System.out.println(s5.compareTo(s6));

        String s7 = "Fahima";
        String s8 = "Faiyaz";
        System.out.println(s7.compareTo(s8));
    }
}
