package March;

import java.util.Scanner;


public class CareOfPuppy_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int foodPurchased = Integer.parseInt(scanner.nextLine());
        int availableFood = foodPurchased * 1000;
        String command = scanner.nextLine();
        while (!command.equals("Adopted")) {
            int foodGiven = Integer.parseInt(command);
            availableFood -= foodGiven;
            command = scanner.nextLine();
        }
        if (command.equals("Adopted")) {
            if (availableFood < 0) {
                System.out.printf("Food is not enough. You need %d grams more.", Math.abs(availableFood));
            } else {
                System.out.printf("Food is enough! Leftovers: %d grams.", availableFood);
            }
        }

    }

}