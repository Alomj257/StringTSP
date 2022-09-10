package StringTsp;

public class StringJoinMethod {
    public static void main(String[] args) {
            String s1 = "Faiyaz";
            String s2 = "Rashmika";

            System.out.println(String.join(";", s1, s2));
            System.out.println(String.join("+", s1, s2));
            System.out.println(String.join(" loves ", s1, s2));
    }
}
