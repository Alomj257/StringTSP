package StringTsp;

public class StringImmuatble {
    public static void main(String[] args) {
        String s = new String("Fahima");
        s.concat("Java");
        System.out.println(s);

        String f = new String("Fahima");
        f = f.concat(" Commerce");
        System.out.println(f);

        String s1 = new String("Jahangir");
        s1 = s1.concat(" Python");
        System.out.println(s1);

        String s2 = new String("Faiyaz");
        s2 = s2 + " c++";
        System.out.println(s2);
    }
}
