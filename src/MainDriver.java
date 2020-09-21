import java.util.InputMismatchException;
import java.util.Scanner;

public class MainDriver {
    public static void main(String[] args) {
        System.out.println("Welcome to Leo, you virtual assistant!What would you like to do, today?");
        System.out.print("Please type either 'Convert', 'Add', or 'InvertCase': ");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.next();


        if (response.equalsIgnoreCase("convert")) {
            System.out.println("Convert mode:");
            // Add code to handle this case here. Do not remove above print statement.
            double userNumeric = getNumericInput(); // to reduce the lines of code in this section, I added a method to obtain
                                           // user input
            double convertedInput = convert(userNumeric); // stores the double after performing the conversion from
                                                        // calling the convert method
            System.out.printf("%.2f USD is %.2f CAD", userNumeric, convertedInput); // displays the value to the user
        } else if (response.equalsIgnoreCase("add")) {
            System.out.println("Add mode:");
            // Add code to handle this case here. Do not remove above print statement.
        } else if (response.equalsIgnoreCase("InvertCase")) {
            System.out.println("Invert case mode:");
            // Add code to handle this case here. Do not remove above print statement.
        } else {
            System.out.print("Sorry, I didn't get that. Re-run the program to try again!");
        }

        scanner.close();
    }

    public static double getNumericInput() { // a method to obtain a numeric from the user
        double userValue = 0.0;
        try {
            System.out.print("Please enter a number to convert from USD to CAD: ");
            Scanner scn = new Scanner(System.in);
            userValue = scn.nextDouble();
            scn.close();
        } catch (InputMismatchException e) { //in the case that a value other than an int or a double is entered
                System.out.println("That was not a valid numeric. Please rerun the program to try again");
                System.exit(-1); //just ending the system if this happens at the moment. Can change implementation if needed.
            }
        return userValue;
    }

    // method to convert the user's inputted double from USD to CAD
    private static double convert(double dollars){ 
        double conversionRate = 1.32; //according to Google, $1USD = $1.32CAD
        dollars *= conversionRate;
        return dollars; 
    }


}
