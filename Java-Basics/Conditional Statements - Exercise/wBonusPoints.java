package com.company;

import java.util.Scanner;

public class wBonusPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startPoints = Integer.parseInt(scanner.nextLine());
        double bonusPoints =0;
        if (startPoints <= 100){
            bonusPoints = 5;

            }
        else if (startPoints >100){
            bonusPoints = startPoints*0.20;

        }
        else if (startPoints>100){
            bonusPoints = startPoints*0.10;

        }
        if (startPoints %2 ==0) {
            bonusPoints +=1;
        }
       else if (startPoints%10 == 5){
           bonusPoints=+2;
        }
       System.out.println(bonusPoints);
       System.out.println(startPoints+bonusPoints);
        }
    }

