package StringTsp;

public class StringReverse {
    public static void main(String[] args) {
        String s = "FAHIMA";
        int a = s.length();
        char [] arr = s.toCharArray();
        System.out.println(arr);

        char [] arr1 = new char[a];
        for(int i=a-1; i>=0; i--){
            arr1[i] = arr[i];
            System.out.print(arr1[i]);
        }
    }
}
