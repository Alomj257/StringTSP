package StringTsp;

public class StringLengthMethod {
    public static void main(String[] args) {
        String name = "";
        String email = "alomj257@gmail.com";
        String password = "Alom@123";

        System.out.println("String length:");
        System.out.println(name.length());
        System.out.println(email.length());
        System.out.println(password.length());

        int a = name.length();
        int b = email.length();
        int c = password.length();
        System.out.println("String length:");
        System.out.println(a+ " " + b +" " +c);

        if(a == 0){
            System.out.println("Empty");
        }
        else{
            System.out.println("Not empty");
        }
    }
}
