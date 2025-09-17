package abstractclasses;

abstract class TransportBooking{
    String passengerName;
    TransportBooking(String passengerName){
        this.passengerName=passengerName;
    }
    abstract double calculateFare(double distance);
    void bookTicket(double distance){
        System.out.println("Passenger: " + passengerName);
        System.out.println("Fare: " + calculateFare(distance));
        System.out.println("Ticket booked successfully!\n");
    }
}
class BusBooking extends TransportBooking{
    BusBooking(String passengerName){
        super(passengerName);
    }
    @Override
    double calculateFare(double distance){
        return distance * 5;
    }
}
class TrainBooking extends TransportBooking{
    TrainBooking(String passengerName){
        super(passengerName);
    }
    @Override
    double calculateFare(double distance){
        return distance*2.5+50; 
    }
}
class FlightBooking extends TransportBooking{
    FlightBooking(String passengerName){
        super(passengerName);
    }
    @Override
    double calculateFare(double distance){
        return distance*10+500; 
    }
}
public class transportationBooking{
    public static void main(String[] args){
        TransportBooking t1=new BusBooking("Sha");
        TransportBooking t2=new TrainBooking("Vani");
        TransportBooking t3=new FlightBooking("Ruthvi");
        t1.bookTicket(100);
        t2.bookTicket(200);
        t3.bookTicket(500);
    }
}

