// *QUESTION 5*
// A chemical reactor requires a starting temperature between 20.0°C and 40.0°C. 
// If the user enters a value outside this range, the system rejects it and forces them to try again. 
// However, for safety, the system only allows 3 total attempts before locking down. 
// Write a program in Java for the following technical specifications
// 1. *Variables:*
// • double temp.
// • int attempts = 0.
// • final int MAX_ATTEMPTS = 3.

// 2. *The Loop:*
// • Use a do-while loop to ask for the temperature.

// 3. *The Logic:*
// • Action: Increment the attempts count at the start of every loop.
// • Validation: Inside the loop, check if the temperature is valid (20.0 <= temp <= 40.0).
// • Termination: The loop should repeat only if:
// • The temperature is NOT in the valid range.
// • AND the attempts count is less than MAX_ATTEMPTS.

// 4. *Output:*
// • If the input is invalid, print: "Invalid Temperature! Attempt [n] of 3 used.".
// • After the loop, use an if statement to check if it ended because of a valid input or because it ran out of attempts.
// • Print a final "System Status" message for either case.




import java.util.Scanner;

public class trail5{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temp;
        int attempts = 0;
        final int MAX_ATTEMPTS = 3;

        do {
            attempts++;  // increment at the start of every loop

            System.out.print("Enter starting temperature: ");
            temp = scanner.nextDouble();

            if (temp < 20.0 || temp > 40.0) {
                System.out.println("Invalid Temperature! Attempt " + attempts + " of 3 used.");
            }

        } while ((temp < 20.0 || temp > 40.0) && attempts < MAX_ATTEMPTS);

        // Final System Status
        if (temp >= 20.0 && temp <= 40.0) {
            System.out.println("System Status: Temperature accepted. Reactor starting.");
        } else {
            System.out.println("System Status: Maximum attempts reached. System locked down.");
        }

        scanner.close();
    }
}
