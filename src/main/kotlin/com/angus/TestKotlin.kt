package com.train

import java.util.*

fun main(args: Array<String>) {
    var sc = Scanner (System.`in`);
    var totalTickets: Int = 0;
    do{
        println("If you don`t want to buy tickets please enter -1 ")
        println("Please enter number of tickets:");
        totalTickets = sc.nextInt();
        if (totalTickets == -1 ){
            break;
        }
        println("How many round-trip tickets:")
        var roundTrip = sc.nextInt();
        val ti = Ticket_k(totalTickets,roundTrip);
        ti.print();

    }while(totalTickets != -1);
}

class Ticket_k(var totalTickets : Int, var roundTrip : Int){

    fun print(){
        val Total = 1800 *  roundTrip + (totalTickets-roundTrip) * 1000;
        println("Total tickets:" + totalTickets);
        println("Round_trip:" + roundTrip);
        println("Total:" + Total);
    }
}
