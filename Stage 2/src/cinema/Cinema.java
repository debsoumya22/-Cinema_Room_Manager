package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();

        int totalSeats = rows * seats;
        if (totalSeats <= 60) {
            int income =  totalSeats * 10;
            System.out.println("Total income:");
            System.out.println("$"+income);
        }
        if (totalSeats > 60) {
            int frontRows = rows / 2;
            int frontRowsIncome = frontRows * seats * 10;
            int backRows = rows - frontRows;
            int backRowsIncome = backRows * seats * 8;
            int income = backRowsIncome + frontRowsIncome;
            System.out.println("Total income:");
            System.out.println("$" + income);
        }
    }

        }