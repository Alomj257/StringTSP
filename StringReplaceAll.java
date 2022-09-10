package StringTsp;

public class StringReplaceAll {
    public static void main(String[] args) {
        String s = "This is demo";

        System.out.println(s.replaceAll("is", "was"));
        System.out.println(s.replaceAll("is(.)", "was"));
        System.out.println(s.replaceAll("is(.*)", "was"));
    }
}
