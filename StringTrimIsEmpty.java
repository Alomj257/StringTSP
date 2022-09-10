package StringTsp;

public class StringTrimIsEmpty {
    public static void main(String[] args) {
        String s = "Faiyaz        ";
        System.out.println(s.trim().isEmpty());


        if(s.trim().isEmpty()){
            System.out.println("Empty");
        }
        else{
            System.out.println("Valid String");
        }
    }
}
