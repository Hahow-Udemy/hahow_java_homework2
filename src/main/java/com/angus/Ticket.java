package com.angus;

public class Ticket {
    int totalTickets, roundTrip, total;

    public Ticket(int totalTickets, int roundTrip){
        this.totalTickets = totalTickets;
        this.roundTrip = roundTrip;

        total = this.roundTrip * 1800 + (this.totalTickets - this.roundTrip) * 1000 ;
        System.out.println("Total tickets:" + this.totalTickets);
        System.out.println("Round-trip:" + this.roundTrip);
        System.out.println("Total: "+ total);
    }

    public void print(){

        total = roundTrip * 1800 + (totalTickets - roundTrip) * 1000 ;
        System.out.println("Total tickets:" + totalTickets);
        System.out.println("Round-trip:" + roundTrip);
        System.out.println("Total: "+ total);

    }

}
