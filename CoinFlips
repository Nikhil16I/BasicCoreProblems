 import java.util.Scanner;

public class CoinFlips {

        public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Input a random number you want to flip coin random times  ");

                  int CountN = scanner.nextInt();

                  double headN=0,tailN=0;

                for(int i=1;i<CountN;i++) {


                      int flip = (int) Math.floor(Math.random()*2);
                        if(flip == 0) {

                                tailN++;
                        }else {
                                headN++;
                        }
                }
                System.out.println("Percentage of no. of Heads "+ "%");

                 System.out.println(Math.floor((headN/CountN)*100));
                  System.out.println("No. of Head Count = "+headN);


                System.out.println("Percentage of no. of Tails "+ "%");

                System.out.println(Math.floor((tailN/CountN)*100));
                 System.out.println("No. of Tail Count = " +tailN);
        }
}
