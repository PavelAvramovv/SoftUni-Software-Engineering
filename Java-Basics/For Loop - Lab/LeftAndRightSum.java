import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        /*Да се напише програма, която чете 2*n-на брой цели числа,
        подадени от потребителя, и проверява дали сумата на първите n
        числа (лява сума) е равна на сумата на вторите n числа (дясна сума).
         При равенство печата " Yes, sum = " + сумата; иначе печата " No, diff = " +
          разликата. Разликата се изчислява като положително число (по абсолютна стойност). */



        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.println("enter the numbers:");

        int leftSum = 0;
        int rightSum =0;

        for (int i = 1; i <= n; i++) {
            leftSum = leftSum + scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            rightSum = rightSum + scanner.nextInt();
        }
        if (leftSum == rightSum){
            System.out.printf("Yes, sum = %d",leftSum);
        }
        else{
            int differece = Math.abs(leftSum-rightSum);
            System.out.printf("No, diff = %d",differece);
        }
    }
}
