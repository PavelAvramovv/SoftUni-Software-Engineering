import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSeconds = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double swimTime = distance * secondsPerMeter;
        double delayTime = Math.floor(distance / 15)*12.5;
        double totalTime = swimTime+delayTime;

        if (totalTime < recordSeconds)
        {
        System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTime);
        }
        else  {
            double neededSeconds = totalTime-recordSeconds;
        System.out.printf("No, he failed! He was %.2f seconds slower.",neededSeconds);
        }
        }
    }

