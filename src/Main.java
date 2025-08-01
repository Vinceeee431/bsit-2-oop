
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalNumber = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();
            totalNumber += number;
        }

        System.out.println("Total Number: " + totalNumber);
        input.close();
    }
}
