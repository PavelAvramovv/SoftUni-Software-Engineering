package Exams;
 
import java.util.Scanner;
 
public class Souvenirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String team = scanner.nextLine();
        String souvenirs = scanner.nextLine();
        int currentSouvenirs = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double total = 0;
        boolean isInvalid = false;
 
        switch (team) {
            case "Argentina":
                if (souvenirs.equals("flags")) {
                    price = 3.25;
                    total = price * currentSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", currentSouvenirs,souvenirs,team,total);
 
                } else if (souvenirs.equals("caps")) {
                    price = 7.20;
                    total = price * currentSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", currentSouvenirs,souvenirs,team,total);
                } else if (souvenirs.equals("posters")) {
                    price = 5.10;
                    total = price * currentSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", currentSouvenirs,souvenirs,team,total);
                } else if (souvenirs.equals("stickers")) {
                    price = 1.25;
                    total = price * currentSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", currentSouvenirs,souvenirs,team,total);
                }
                break;
            case "Brazil":
                if (souvenirs.equals("flags")) {
                    price = 4.20;
                    total = price * currentSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", currentSouvenirs,souvenirs,team,total);
                } else if (souvenirs.equals("caps")) {
                    price = 8.50;
                    total = price * currentSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", currentSouvenirs,souvenirs,team,total);
                } else if (souvenirs.equals("posters")) {
                    price = 5.35;
                    total = price * currentSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", currentSouvenirs,souvenirs,team,total);
                } else if (souvenirs.equals("stickers")) {
                    price = 1.20;
                    total = price * currentSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", currentSouvenirs,souvenirs,team,total);
                }
                break;
            case "Croatia":
                if (souvenirs.equals("flags")) {
                    price = 2.75;
                    total = price * currentSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", currentSouvenirs,souvenirs,team,total);
                } else if (souvenirs.equals("caps")) {
                    price = 6.90;
                    total = price * currentSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", currentSouvenirs,souvenirs,team,total);
                } else if (souvenirs.equals("posters")) {
                    price = 4.95;
                    total = price * currentSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", currentSouvenirs,souvenirs,team,total);
                } else if (souvenirs.equals("stickers")) {
                    price = 1.10;
                    total = price * currentSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", currentSouvenirs,souvenirs,team,total);
                }
                break;
            case "Denmark":
                if (souvenirs.equals("flags")) {
                    price = 3.10;
                    total = price * currentSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", currentSouvenirs,souvenirs,team,total);
                } else if (souvenirs.equals("caps")) {
                    price = 6.50;
                    total = price * currentSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", currentSouvenirs,souvenirs,team,total);
                } else if (souvenirs.equals("posters")) {
                    price = 4.80;
                    total = price * currentSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", currentSouvenirs,souvenirs,team,total);
                } else if (souvenirs.equals("stickers")) {
                    price = 0.90;
                    total = price * currentSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", currentSouvenirs,souvenirs,team,total);
                }
                break;
        }
        if (!team.equals("Denmark") && !team.equals("Brazil") && !team.equals("Croatia") && !team.equals("Argentina")){
            System.out.println("Invalid country!");
        }
            else if(!souvenirs.equals("flags") && !souvenirs.equals("caps") && !souvenirs.equals("posters") && !souvenirs.equals("stickers")) {
            System.out.println("Invalid stock!");
 
            }
        }
 
    }