import java.util.Scanner;

public class company6 {
    public static void main(String[] args) {

        // reverse String

        Scanner scan = new Scanner(System.in);

        String word = scan.next();

        String str = "";

        for (int i = word.length()-1; i >= 0; i--) {
            str+=word.charAt(i);
        }

        System.out.println(str);

    }
}
