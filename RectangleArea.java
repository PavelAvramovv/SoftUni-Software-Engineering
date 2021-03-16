package com.company;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double  width = Double.parseDouble(scanner.nextLine());
        double  lenght = Double.parseDouble(scanner.nextLine());

        double area = getRectangLeArea(width,lenght);
        System.out.printf("%.0f",area);
    }

    private static double getRectangLeArea(double width, double lenght) {

       double recTangleArea = width*lenght;

        return recTangleArea;
    }


}

