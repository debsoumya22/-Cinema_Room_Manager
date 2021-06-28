package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows:\n> ");
        int numRows = sc.nextInt();
        System.out.print("Enter the number of seats in each row:\n> ");
        int numSeats = sc.nextInt();

        String[][] cinema = new String[numRows + 1][numSeats + 1];

        for (int i = 1; i < cinema.length; i++) {
            for (int j = 1; j < cinema[i].length; j++) {
                cinema[i][j] = "S";
            }
        }
        System.out.println("1. Show the seats\n2. Buy a ticket\n0. Exit\n> ");
        int choice = sc.nextInt();

        displayMenu(choice, cinema, numRows, numSeats);

    }
    private static void displayCinema(String[][] cinema) {
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                if (i == 0) {
                    if (j == 0) {
                        System.out.print("  ");
                    } else {
                        System.out.print(j + " ");
                    }
                } else if (j == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(cinema[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    private static void buyTicket(String[][] cinema, int numRows, int numSeats) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a row number:\n> ");
        int userRow = sc.nextInt();
        System.out.print("Enter a seat number in that row:\n> ");
        int userSeat = sc.nextInt();

        for (int i = 1; i < cinema.length; i++) {
            for (int j = 1; j < cinema[i].length; j++) {
                cinema[userRow][userSeat] = "B";
            }
        }

        int ticketPrice = 0;

        if (numSeats * numRows <= 60) {
            ticketPrice = 10;
        } else {
            if (numRows / 2 >= userRow) {
                ticketPrice = 10;
            } else {
                ticketPrice = 8;
            }

        }
        System.out.println("Ticket price: $" + ticketPrice);
    }
    private static void displayMenu(int input, String[][] cinema, int numRows, int numSeats) {

        Scanner sc = new Scanner(System.in);

        while (input != 0) {
            if (input == 1) {
                System.out.println("Cinema:");
                displayCinema(cinema);
            } else if (input == 2) {
                buyTicket(cinema, numRows, numSeats);
            }
            System.out.println("1. Show the seats\n2. Buy a ticket\n0. Exit\n> ");
            input = sc.nextInt();
        }
        return;
    }
}