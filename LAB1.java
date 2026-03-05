import java.util.Scanner;

public class LAB1 {
    public static void main(String[] args){
        double midsemmark;
        double endofsemmark;
        double totalmark;

        Scanner input = new Scanner(System.in);

        System.out.print("ENTER YOUR MIDSEM MARK: ");
        midsemmark = input.nextDouble();

        System.out.print("ENTER END OF SEM MARK: ");
        endofsemmark = input.nextDouble();

        totalmark=midsemmark+endofsemmark;
        System.out.print( "THE TOTAL IS" + totalmark +".");
         
        input.close();

    }
} 