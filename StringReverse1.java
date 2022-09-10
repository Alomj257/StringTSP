package StringTsp;

public class StringReverse1 {
    public static void main(String[] args) {
        String s = "Fahima";
        int b = s.length();

        String s1 = new String();
        s1 = "";

        for(int i= b-1; i>=0; i--){
            s1 = s1 + s.charAt(i);
        }

        System.out.println("Original String: " +s);
        System.out.println("Reverse String: " +s1);

        if(s1.equals(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindome");
        }
    }
}
