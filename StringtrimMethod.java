package StringTsp;

public class StringtrimMethod {
    public static void main(String[] args) {
        String name = "Fahima";
        String name1 = "   Fahima";
        String name2 = "   Fahima    ";
        String name3 = "   Fahima Akthar    ";

        System.out.println("String trim: ");
        System.out.println(name.trim());
        System.out.println(name1.trim());
        System.out.println(name2.trim());
        System.out.println(name3.trim());

        System.out.println("String trim");
        String s = name.trim();
        String s1 = name1.trim();
        String s2 = name2.trim();
        String s3 = name3.trim();

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
