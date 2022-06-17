import java.util.Scanner;

public class company3 {

    public static void main(String[] args) {
        // reverse the word (String)

        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        System.out.println("Reverse word = " + reverse(str));
    }

    public static String reverse(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
