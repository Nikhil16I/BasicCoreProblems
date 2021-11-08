import java.util.Scanner;

public class arithmaticOperation {
        public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);

          System.out.print("Input any Number = ");

                int n = scanner.nextInt();
                String Series = "1";

                  for(int i = 2;i <= n; i++){
                          Series += "+(1 /" +i+ ")";
                                 }
                                System.out.println("Prints the Harmonic numbers = " + Series +".");

                              }
                      }

