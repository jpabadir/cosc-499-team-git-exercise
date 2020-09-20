import java.util.Scanner;

public class MainDriver {
    public static void main(String[] args) {
        System.out.println("Welcome to Leo, you virtual assistant!What would you like to do, today?");
        System.out.print("Please type either 'Convert', 'Add', or 'InvertCase': ");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.next();
        scanner.close();

        if (response.equalsIgnoreCase("convert")) {
            System.out.println("Convert mode:");
            // Add code to handle this case here. Do not remove above print statement.
        } else if (response.equalsIgnoreCase("add")) {
            System.out.println("Add mode:");
            // Add code to handle this case here. Do not remove above print statement.
        } else if (response.equalsIgnoreCase("InvertCase")) {
            System.out.println("Invert case mode:");
            // Add code to handle this case here. Do not remove above print statement.
        } else {
            System.out.print("Sorry, I didn't get that. Re-run the program to try again!");
        }
    }
}
