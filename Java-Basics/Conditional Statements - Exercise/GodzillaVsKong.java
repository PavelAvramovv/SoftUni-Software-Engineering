import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statistCount = Integer.parseInt(scanner.nextLine());
        double priceDreesStatist = Double.parseDouble(scanner.nextLine());
        double decorSum = budget*0.10;
        double statistSum = statistCount * priceDreesStatist;

        if (statistCount > 150) {
            statistSum = statistSum-0.10*priceDreesStatist;
        }
        double expenses = decorSum + statistSum;
        if (budget >=expenses){
            System.out.println("Action!");
            double leftMoney = budget-expenses;
            System.out.printf("Wingard starts filming with %.2f leva left",leftMoney);
        }
        else {
            System.out.println("Not enough money!");
            double needMoney = expenses-budget;
            System.out.printf("Wingard needs %.2f leva more.",needMoney);
        }
    }
}
