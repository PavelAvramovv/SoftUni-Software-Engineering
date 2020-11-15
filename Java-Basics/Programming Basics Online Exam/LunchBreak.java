import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String serialName = scanner.nextLine();
        int serialTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = 1.0*breakTime * 1/8;
        double relaxTime = 1.0*breakTime * 1/4;
        double leftTime = breakTime - lunchTime - relaxTime;

        if (leftTime>=serialTime){
          System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",serialName,Math.ceil(leftTime-serialTime));
        }
        else{

            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",serialName,Math.ceil(serialTime-leftTime));
        }
    }
}
