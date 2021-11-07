import java.util.Scanner;

public class LeapYearQ {
	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		System.out.print("Input any Year 'YYYY'= ");

		int year = input.nextInt();

		if (( year%400 == 0)|| (( year%4 == 0 ) &&( year%100 != 0))) {
			

                                    System.out.println("\n" + year + " Is a leap year.");
					}
	  				else {
				System.out.println("\n" + year + " Is not a leap year.");
			      }
	                  }

                       }
