import java.util.Scanner;

public class QuotAndRemain {

       public static void main(String[] args) {

            Scanner scanner =new Scanner(System.in);

            System.out.println("Input Dividend No.= ");
                int Dividend=scanner.nextInt();

            System.out.println("Input Divisor No.= ");
                int Divisor=scanner.nextInt();


            int Quotient = Dividend / Divisor;
            int Remainder = Dividend % Divisor;


     System.out.println("The Quotient and Remainder For the values are :-");

      System.out.println("Quotient = " + Quotient);

        System.out.println("Remainder = " + Remainder);

   }

}

