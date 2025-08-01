import java.util.Scanner;

public class Main {
    static int number = 0;
    static int count =1;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (count<=5) {
            System.out.print("Enter number " + count+ ": " );
            try{
                number = number+scanner.nextInt();
                count++;

            }catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine();
            }


        }
        System.out.println("Total Number: "+number);
    }
}