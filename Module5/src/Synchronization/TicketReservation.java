package Synchronization;

import java.util.Random;

class Theater {
    private int availableTickets;

    public Theater(int totalTickets) {
        this.availableTickets = totalTickets;
    }

    public synchronized boolean reserveTicket(int customerId, int tickets) {
        if (tickets <= this.availableTickets) {
            this.availableTickets -= tickets;
            System.out.println("Customer " + customerId + " reserved " + tickets + " tickets.");
            return true;
        } else {
            System.out.println("Customer " + customerId + " couldn't reserve " + tickets + " tickets.");
            return false;
        }
    }

    public int getAvailableTickets() {
        return this.availableTickets;
    }
}

class Customer implements Runnable {
    private Theater theater;
    private int seatsToReserve;
    private int customerId;

    private static int customerCount = 0;

    public Customer(Theater theater, int seatsToReserve) {
        this.theater = theater;
        this.seatsToReserve = seatsToReserve;
        this.customerId = ++customerCount;
    }

    @Override
    public void run() {
        this.theater.reserveTicket(this.customerId, this.seatsToReserve);
    }
}

public class TicketReservation {
    public static void main(String[] args) {
        Theater theater = new Theater(30);
        Thread[] customers = new Thread[10];

        int minTickets = 1;
        int maxTickets = 10;
        Random rand = new Random();

        for (int i = 0; i < customers.length; i++) {
            // randomize the amount of tickets to reserve
            int ticketsToReserve = rand.nextInt(maxTickets - minTickets + 1) + minTickets;

            customers[i] = new Thread(new Customer(theater, ticketsToReserve));
            customers[i].start();
        }

        // wait for threads to finish
        for (Thread t : customers) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Finished");
    }
}