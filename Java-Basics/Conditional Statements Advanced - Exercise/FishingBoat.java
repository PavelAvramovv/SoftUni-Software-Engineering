import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  •Цената за наем на кораба през пролетта е 3000 лв.
        //•Цената за наем на кораба през лятото и есента е 4200 лв.
        //•Цената за наем на кораба през зимата е 2600 лв.
        //В зависимост от броя си групата ползва отстъпка:

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int countFish = Integer.parseInt(scanner.nextLine());
        double rent = 0;


        switch (season) {
            case "Spring":
                rent = 3000;
                break;
            case "Summer":
            case "Autumn":
                rent = 4200;
                break;
            case "Winter":
                rent = 2600;
                break;
        }
        //•Ако групата е до 6 човека включително  –отстъпка от 10 %.
        //•Ако групата е от 7 до 11 човека включително  –отстъпка от 15 %.
        //•Ако групата е от 12 нагоре  –отстъпка от 25 %.
        if (countFish <= 6) {
            rent = rent - 0.10 * rent;
        } else if (countFish <= 11) {
            rent = rent - 0.15 * rent;
        } else if (countFish >= 12) {
            rent = rent - 0.25 * rent;
        }
        //допълнителна проверка
        if (countFish % 2 == 0 && !season.equals("Autumn")) {
            rent = rent - 0.25 * rent;
        }
        // проверка за бюджета


        //достатъчен
        if (budget >= rent) {
            double leftMoney = budget - rent;
            System.out.printf("Yes! You have %.2f leva left.", leftMoney);
        }//не достатъчен
        else {
            double needMoney = rent - budget;
            System.out.printf("Not enough money! You need %.2f leva.", needMoney);
        }
    }
}
