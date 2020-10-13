import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int racer1 = Integer.parseInt(scanner.nextLine());
        int racer2 = Integer.parseInt(scanner.nextLine());
        int racer3 = Integer.parseInt(scanner.nextLine());

        int sumTimeSec = racer1+racer2+racer3;
        int minutes = sumTimeSec/60;
        int seconds = sumTimeSec%60;

         System.out.printf("%d:%02d",minutes,seconds);
        //seconds <10
     /*   if (seconds<10){
            //minutes: 0seconds
            System.out.printf("%d:0%d",minutes,seconds);
        }
        else {
            //second >10
             System.out.printf("%d:%d",minutes,seconds);
         }
*/

        }


    }

