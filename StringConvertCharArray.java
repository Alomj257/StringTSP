package StringTsp;

public class StringConvertCharArray {
    public static void main(String[] args) {
        String s = new String();
        s = "FAHIMA";

        int a = s.length();
        System.out.println("String length: "+a);

        char [] c = s.toCharArray();
        System.out.print("Array char: ");
        System.out.println(c);
    }
}
