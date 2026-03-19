import java.util.Scanner;
public class trail6 {

    public static void main (String[] args){
        Scanner input =new Scanner(System.in);
        int hoursworke;
        System.out.println("HOW MANY HOURS ARE YOU WORKING??");
        hoursworked=input.nextInt();

        //40hrs=regular, more than 40hrs=overtime
        if(hoursworked<=40)
        {
            System.out.println("YOU WORKED AS REGULAR");
            int countreg;
            int countover;
            countreg++;
            countover++;
             
        }
        else
        {
            System.out.println("YOU WORKED OVERTIME TODAY");
        }


      
        input.close();
    } }
    

