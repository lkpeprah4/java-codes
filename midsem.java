import java.util.Scanner;

public class midsem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double midsemmark;
        double endofsemmark;
        int numofstud;
        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;
        double[] finalMark = new double[numofstud];
        double highestMark = 0;

        System.out.println("HOW MANY STUDENTS ARE IN THE CLASS");
        numofstud = input.nextInt();

        for (int i = 0; i < numofstud; i++) {
            System.out.println("ENTER DETAILS FOR STUDENT" + (i + 1));
            System.out.print("ENTER YOUR MIDSEM MARK:");
            midsemmark = input.nextDouble();
            System.out.print("ENTER END OF SEMESTER MARK:");
            endofsemmark = input.nextDouble();

            double thirtymidsem;
            thirtymidsem = 0.3 * midsemmark;
            double seventyendsem;
            seventyendsem = 0.7 * endofsemmark;
            double totalmark;
            totalmark = seventyendsem + thirtymidsem;
            finalMark[i] = totalmark;

            if (totalmark > highestMark) {
                highestMark = totalmark;
            }

            System.out.println("THE TOTAL MARK IS " + totalmark);

        }

            System.out.println("THE NUMBER OF PEOPLE WHO HAD " + countA);
            System.out.println("The highest mark is " + highestMark);

        input.close();

    }
}