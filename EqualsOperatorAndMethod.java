package StringTsp;

public class EqualsOperatorAndMethod {
    public static void main(String[] args) {
        String s1 = new String("Fahima");
        String s2 = new String("Fahima");

        if(s1==s2){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        if(s1.equals(s2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        String s3 = "Jahangir";
        String s4 = "Jahangir";

        if(s3==s4){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        if(s3.equals(s4)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
