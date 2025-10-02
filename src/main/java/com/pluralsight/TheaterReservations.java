package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        String[] nameSplit = name.split(" ");

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String reservation = input.nextLine();
        LocalDate reservationDate = LocalDate.parse(reservation,formatter);

        System.out.print("How many tickets would you like? ");
        int ticketNumber = input.nextInt();

        if (ticketNumber > 1) {
            System.out.printf("%d tickets reserved for %s under %s, %s", ticketNumber, reservationDate, nameSplit[1], nameSplit[0]);
        } else {
            System.out.printf("%d ticket reserved for %s under %s, %s", ticketNumber, reservationDate, nameSplit[1], nameSplit[0]);
        }
    }
}
