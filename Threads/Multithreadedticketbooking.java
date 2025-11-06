package Threads;
class Multithreadedticketbooking {
    private int seats = 10;

    public synchronized void bookTicket(String user, int numSeats) {
        if (seats >= numSeats) {
            System.out.println(user + " booked " + numSeats + " seats.");
            seats -= numSeats;
            System.out.println("Remaining seats: " + seats);
        } else {
            System.out.println(user + " tried to book " + numSeats + " seats. Not Enough seats!");
        }
    }
}

class UserThread extends Thread {
    Multithreadedticketbooking counter;
    String user;
    int seats;

    UserThread(Multithreadedticketbooking counter, String user, int seats) {
        this.counter = counter;
        this.user = user;
        this.seats = seats;
    }

    @Override
    public void run() {
        counter.bookTicket(user, seats);
    }
}

public class Multithreadedticketbooking {
    public static void main(String[] args) {
        Multithreadedticketbooking counter = new Multithreadedticketbooking();

        new UserThread(counter, "User A", 6).start();
        new UserThread(counter, "User B", 5).start();
        new UserThread(counter, "User C", 2).start();
    }
}