import java.util.Scanner;

public class Spaceship_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*широчина - width
        дължина-length
        височина - height*/

        double widthShip = Double.parseDouble(scanner.nextLine());
        double lenghtShip = Double.parseDouble(scanner.nextLine());
        double heightShip = Double.parseDouble(scanner.nextLine());
        double averageHeighAstronafts = Double.parseDouble(scanner.nextLine());

        double rocketVolume = widthShip*lenghtShip*heightShip;
        double roomVolume = (averageHeighAstronafts+0.40)*2*2;
        double freeSpace = Math.floor(1.0*rocketVolume/roomVolume);
        if (freeSpace>=3 && freeSpace<=10){
            System.out.printf("The spacecraft holds %.0f astronauts.",freeSpace);
        }
        else if (freeSpace <3){
            System.out.println("The spacecraft is too small.");
        }
        else if (freeSpace>10){
            System.out.println("The spacecraft is too big.");
        }
    }
}
