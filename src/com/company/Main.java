package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Learn your squares and cubes!");
        System.out.println();

        Scanner scan1 = new Scanner(System.in);
        boolean numTable = true;

        while (numTable) {

            System.out.println("Enter an integer: ");
            long userNum = scan1.nextInt();
            System.out.println();

            System.out.format("%-15s %-15s %-15s %n", "Number", "Squared", "Cubed");
            System.out.format("%-15s %-15s %-15s %n", "======", "=======", "======");
            System.out.println();


            for (int i = 1; i <= userNum; i++) {

                System.out.format("%-15s %-15s %-15s %n", i, (i * i), (i * i * i));
            }

            System.out.println();
            System.out.print("Would you like to continue? (y/n): ");
            char yN = scan1.next().charAt(0);

            System.out.println();

            if (yN == 'y') {
                numTable = true;
            } else {
                numTable = false;
                System.out.println("Bye!");

            }
        }
    }
}

