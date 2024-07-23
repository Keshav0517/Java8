package thread_tut.synchronization.movie_booking;

class BookTheaterSeats {
    int totalSeats=10;
    public void bookSeats(int seats){
        System.out.println("Total Seats:"+totalSeats);
        if (totalSeats >= seats){
            System.out.println("Seats booking possible...");
            System.out.println("Booked seats:"+seats);
            totalSeats=totalSeats-seats;
            System.out.println("Left seats:"+totalSeats);
        }else {
            System.out.println("Seats are not Available...");
            System.out.println("Left seats:"+totalSeats);
        }
    }
}


public class MovieBookingApp extends Thread{
   static BookTheaterSeats bookTheaterSeats;
   int seats;
    public void run(){
        bookTheaterSeats.bookSeats(seats);
    }

    public static void main(String[] args) throws InterruptedException {
        bookTheaterSeats=new BookTheaterSeats();

        //Data Inconsistency Problem with synchronization
        MovieBookingApp customer1=new MovieBookingApp();
        customer1.seats=5;
        customer1.start();


        MovieBookingApp customer2=new MovieBookingApp();
        customer2.seats=4;
        customer2.start();

    }
}
