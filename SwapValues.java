import java.util.Scanner;

public class SwapValues {
        public static void main(String[] args) {

                Scanner scanner =new Scanner(System.in);

                System.out.println("Input  Value of X =");

                  int t,X=scanner.nextInt();

                System.out.println("Input Value of Y =");

                 int Y=scanner.nextInt();


                System.out.println("Actual Value of X = " + X + "." );

                System.out.println("Actual Value of Y = " + Y + ".");

                t=X;
                X=Y;
                Y=t;

                System.out.println("Value after Swapping of  X = " + X + "."  );

                System.out.println("Value after Swapping of  Y = " + Y + "."  );

    }

}
