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
