package com.company;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());

        printInWords(grade);

    }

    private static void printInWords(double grade) {
        if (grade==2 && grade<=2.99){
            System.out.print("Fail");
        }
        else if (grade >= 3 && grade<=3.49){
            System.out.printf("Poor");
        }
        else if (grade >= 3.50 && grade <= 4.49){
            System.out.printf("Good");
        }
        else if (grade >= 4.50 && grade <=5.49){
            System.out.printf("Very good");
        }
        else if (grade >= 5.50 && grade <= 6.00){
            System.out.printf("Excellent");
        }
    }
}
