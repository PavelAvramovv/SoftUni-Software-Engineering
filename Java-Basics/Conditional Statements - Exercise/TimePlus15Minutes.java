package com.company;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentsHours = Integer.parseInt(scanner.nextLine());
        int currentsMinutes = Integer.parseInt(scanner.nextLine());

        int currentTimeInMinutes = currentsHours * 60 + currentsMinutes;
        int timePlus15Minutes = currentTimeInMinutes + 15;

        int finalHour = timePlus15Minutes / 60;
        int finalMinute = timePlus15Minutes % 60;
        if (finalHour == 24){
            finalHour=0;
        } System.out.printf("%d:%02d",finalHour,finalMinute);
    }



}
