import java.util.Scanner;

public class GoldMine_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int locationsNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= locationsNumber; i++) {
            double expectedDailyYield = Double.parseDouble(scanner.nextLine());
            int daysToDigAtLocation = Integer.parseInt(scanner.nextLine());
            double totalYieldPerLocation = 0.0;
            for (int j = 1; j <= daysToDigAtLocation; j++) {
                double dailyGoldYield = Double.parseDouble(scanner.nextLine());
                totalYieldPerLocation += dailyGoldYield;
            }
            double averageDailyYieldPerLocation = totalYieldPerLocation / daysToDigAtLocation;
            if (averageDailyYieldPerLocation >= expectedDailyYield) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageDailyYieldPerLocation);
            } else {
                System.out.printf("You need %.2f gold.%n", expectedDailyYield - averageDailyYieldPerLocation);
            }

        }

    }
}
