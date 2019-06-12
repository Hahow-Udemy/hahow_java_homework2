package com.angus;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTickets =-1;

            do{
                System.out.println(" If you don`t want to buy tickets please enter -1  ");
                System.out.println("Please enter number of tickets:");
                totalTickets = sc.nextInt();

                if (totalTickets == -1){
                    break;
                }
                System.out.println("How many round-trip tickets:");
                int roundTrip = sc.nextInt();
                Ticket ticket = new Ticket(totalTickets,roundTrip);
                ticket.print();

            }while(totalTickets != -1);
    }
}
