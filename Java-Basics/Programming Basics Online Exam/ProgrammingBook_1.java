import java.util.Scanner;

public class ProgrammingBook_1 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      double priceForPage = Double.parseDouble(scanner.nextLine());
      double priceForCover = Double.parseDouble(scanner.nextLine());
      int percentReducationPaper = Integer.parseInt(scanner.nextLine());
      double desingerPrice = Double.parseDouble(scanner.nextLine());
      int paySumForTeam = Integer.parseInt(scanner.nextLine());


      double firstSumForPrint = priceForPage*899+priceForCover*2;
      double sumAfterTenPercent = firstSumForPrint -(firstSumForPrint*percentReducationPaper/100);
      double sumAfterPayDesing = sumAfterTenPercent+desingerPrice;
      double sumAfterTeamPay = sumAfterPayDesing-(sumAfterPayDesing*paySumForTeam/100);
      System.out.printf("Avtonom should pay %.2f BGN.",sumAfterTeamPay);

    }
}
