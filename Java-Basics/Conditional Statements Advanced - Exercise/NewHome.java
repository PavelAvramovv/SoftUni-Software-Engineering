import java.util.Scanner;

public class NewHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Вход: Вид на цветята (- "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus")
        //брой на цветя int
        //бюджет int
        //2. ед.цена за цвете -> зависи от вида
        //3. Намиране на крайна цена = бр.цветя * ед.цена за цветя
        //4. проверка за отстъпки
        //5. проверка дали стига бюджета

        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        //•	Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
        // •Ако Нели купи повече от 90  Далии - 15% отстъпка от крайната цена
        //•	Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
        // •Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
        //•	Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%

        double price = 0;//крайна цена
        switch (flowerType) {
            case "Roses":
                price = flowerCount * 5;
                if (flowerCount > 80) {
                    price = price - 0.10 * price;
                }
                break;
            case "Dahlias":
                price = flowerCount * 3.80;
                if (flowerCount > 90) {
                    price = price - 0.15 * price;
                }
                break;
            case "Tulips":
                price = flowerCount * 2.80;
                if (flowerCount > 80) {
                    price = price - 0.15 * price;
                }
                break;
            case "Narcissus":
                price = flowerCount * 3;
                if (flowerCount < 120) {
                    price = price + 0.15 * price;
                }
                break;
            case "Gladiolus":
                price = flowerCount * 2.50;
                if (flowerCount < 80) {
                    price = price + 0.2 * price;
                }
                break;
        }

        //Колко е крайната сметка за плащане

        if (budget >= price) {
            //бюджета стига
            double leftMoney = budget - price;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, leftMoney);

        } else {
            //не е достатъчен бюджета
            double needMoney = price - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", needMoney);
        }
    }
}
