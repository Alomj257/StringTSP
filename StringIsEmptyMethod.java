package StringTsp;

public class StringIsEmptyMethod {
    public static void main(String[] args) {
        String name = "";
        String email = "alomj257@gmail.com";
        String pass = "Abc123";
        
        System.out.println("String isEmpty:");
        System.out.println(name.isEmpty());
        System.out.println(email.isEmpty());
        System.out.println(pass.isEmpty());

        boolean b1 = name.isEmpty();
        boolean b2 = email.isEmpty();
        boolean b3 = email.isEmpty();

        System.out.println("String isEmpty");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        if(b1 == true){
            System.out.println("String is empty");
        }
        else{
            System.out.println("Valid name");
        }
    }
}
