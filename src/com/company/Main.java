package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage () {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double avg;
        int i = 0;

        while (true) {

            if (!scanner.hasNextInt()) {

                avg =  (double) sum / i;
                avg = Math.round(avg);
                System.out.println("SUM = " + sum + " AVG = " + (long) avg);
                break;
            }

            i++;
            int number = scanner.nextInt();
            sum += number;

        }

    }
}
