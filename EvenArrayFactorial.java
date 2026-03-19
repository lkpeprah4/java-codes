import java.util.Scanner;

public class EvenArrayFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] evenArray = new int[10];
        int count = 0;

        System.out.println("Enter numbers from 1 to 20:");

        // Accept 20 numbers from user
        for (int i = 0; i < 20; i++) {
            int num = input.nextInt();

            // Check if even
            if (num % 2 == 0 && count < 10) {
                evenArray[count] = num;
                count++;
            }
        }

        // Display array
        System.out.println("Even numbers stored:");
        int sum = 0;
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
            sum += evenArray[i];
        }

        // Calculate average
        double average = (double) sum / evenArray.length;
        System.out.println("\nAverage = " + average);

        // Factorial of average (convert to int)
        int avgInt = (int) average;
        long factorial = 1;

        for (int i = 1; i <= avgInt; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of average (" + avgInt + ") = " + factorial);

        double sqrt= Math.sqrt(factorial);
        System.out.println("the squareroot is "+ sqrt);

        double mean = (factorial + sqrt) / 2;
        double d1 = factorial - mean;
        double d2 = sqrt - mean;
        double sq1 = d1 * d1;
        double sq2 = d2 * d2;
        double variance = (sq1 + sq2) / 2;
        double stdDev = Math.sqrt(variance);

    System.out.println("Standard Deviation = " + stdDev);

        input.close();
        }
    }
