import java.util.Scanner;

public class Film {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String filmName = scanner.nextLine();
    int days = Integer.parseInt(scanner.nextLine());
    int tickets = Integer.parseInt(scanner.nextLine());
    double ticketsPrice = Double.parseDouble(scanner.nextLine());
    int percentForCinema = Integer.parseInt(scanner.nextLine());

    double sumPerDay = tickets*ticketsPrice;
    double winPerAllPeriod = days*sumPerDay;
    double percentIncome = winPerAllPeriod * percentForCinema/100;
    double totalSum = winPerAllPeriod-percentIncome;
    System.out.printf("The profit from the movie %s is %.2f lv.",filmName,totalSum);

    }
}
