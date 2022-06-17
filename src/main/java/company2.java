import java.util.Scanner;

public class company2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // take 5 diff numbers and figure out if any 5 nums are even or odd count the total num of even and total num of odd
        int totalNumEven = 0; int totalNumOdd = 0;
        int num1 = scan.nextInt(); int num2 = scan.nextInt(); int num3 = scan.nextInt(); int num4 = scan.nextInt(); int num5 = scan.nextInt();
        if (num1 %2 == 0){
            totalNumEven++;
        } else {
            totalNumOdd++;
        }
        if (num2 %2 == 0){
            totalNumEven++;
        } else {
            totalNumOdd++;
        }
        if (num3 %2 == 0){
            totalNumEven++;
        } else {
            totalNumOdd++;
        }
        if (num4 %2 == 0){
            totalNumEven++;
        } else {
            totalNumOdd++;
        }
        if (num5 %2 == 0){
            totalNumEven++;
        } else {
            totalNumOdd++;
        }
        System.out.println("Total num of Even:" + totalNumEven);
        System.out.println("Total num of Odd:" + totalNumOdd);




    }
}
