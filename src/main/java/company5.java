import java.util.Scanner;

public class company5 {

    public static void main(String[] args) {


        // take 5 inputs and check if inputs are even or odd # print odds on one line all evens on a seperate line

        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        int num5 = scan.nextInt();


        if (num1 %2 == 0){
            System.out.print(num1);
        } else {
            System.out.print("\n"+num1);
        }
        if (num2 %2 == 0){
            System.out.print(num2);
        } else {
            System.out.print("\n"+num2);
        }if (num3 %2 == 0){
            System.out.print(num3);
        } else {
            System.out.print("\n"+num3);
        }if (num4 %2 == 0){
            System.out.print(num4);
        } else {
            System.out.print("\n"+num4);
        }if (num5 %2 == 0){
            System.out.print(num5);
        } else {
            System.out.print("\n"+num5);
        }


    }
}
