import java.util.InputMismatchException;
import java.util.Scanner;

public class MainDriver {
    public static void main(String[] args) {
        System.out.println("Welcome to Leo, you virtual assistant!What would you like to do, today?");
        System.out.print("Please type either 'Convert', 'Double5', 'Triple10', or 'Multiplyby100': ");
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
        } else if (response.equalsIgnoreCase("double5")) {
            System.out.println("Double5 mode:");
            // Add code to handle this case here. Do not remove above print statement.
            double doubleVal =  5; //number to double
            double doubled = doubled(doubleVal); //doubles number
            System.out.println("5 doubled is: "+doubled);
        } else if (response.equalsIgnoreCase("triple10")) {
            System.out.println("Triple10 mode:");
            // Add code to handle this case here. Do not remove above print statement.
            double tripleVal =  10; //number to double
            double tripled = tripled(tripleVal); //doubles number
            System.out.println("10 tripled is: "+ tripled);
        } else if(response.equalsIgnoreCase("multiplyby100")) {
        	System.out.print("MultiplyBy100 mode: ");
        	// Add code to handle this case here. Do not remove above print statement.
        	double multipliedval = 15;//number to multiply
        	double multiplied = multiplied(multipliedval);//multiply number by 100
        	System.out.print("15 multiplied by 100 is: " + multiplied);
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
    static double convert(double dollars){
        double conversionRate = 1.32; //according to Google, $1USD = $1.32CAD
        dollars *= conversionRate;
        return dollars; 
    }

    //method to double number
    public static double doubled(double n) {
        return n*n;
    }

    //method to triple number
    public static double tripled(double n) {return n*n*n;}
    
    //method to multiply by 100
    public static double multiplied(double n) {return n*100;}
}
