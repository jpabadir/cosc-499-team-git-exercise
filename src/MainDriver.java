import java.util.InputMismatchException;
import java.util.Scanner;

public class MainDriver {
    public static void main(String[] args) {
        System.out.println("Welcome to Leo, you virtual assistant!What would you like to do, today?");
        System.out.print("Please type either 'Convert', 'Doubled5', or 'InvertCase': ");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.next();
        scanner.close();

        if (response.equalsIgnoreCase("convert")) {
            System.out.println("Convert mode:");
            // Add code to handle this case here. Do not remove above print statement.
        } else if (response.equalsIgnoreCase("double5")) {
            System.out.println("Double 5 mode:");
            // Add code to handle this case here. Do not remove above print statement.
            double doubleVal =  5; //number to double
            double doubled = doubleVal*doubleVal; //doubles number
            System.out.println("5 doubled is: "+doubled);

        } else if (response.equalsIgnoreCase("InvertCase")) {
            System.out.println("Invert case mode:");
            // Add code to handle this case here. Do not remove above print statement.
        } else {
            System.out.print("Sorry, I didn't get that. Re-run the program to try again!");
        }
    }

    //method to double number
    public static double doubled(double n){
        return n*n;
    }
}
