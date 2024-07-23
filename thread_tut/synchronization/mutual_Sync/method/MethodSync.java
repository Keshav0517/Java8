package thread_tut.synchronization.mutual_Sync.method;

public class MethodSync extends Thread{
    static BookMovieSeats b;
    int seat;
    public void run(){
        b.bookSeat(seat);
    }

    public static void main(String[] args) {
        b=new BookMovieSeats();

        MethodSync t1=new MethodSync();
        t1.seat=7;
        t1.start();


        MethodSync t2=new MethodSync();
        t2.seat=6;
        t2.start();
    }

}

class BookMovieSeats{
    int totalSeats=10;

    public synchronized void bookSeat(int seats){    //synchronized method
        if (totalSeats>=seats){
            System.out.println("Booking Possible...");
            System.out.println("Total seats:"+totalSeats);

            System.out.println("Booked seats:"+seats);
            totalSeats=totalSeats-seats;
            System.out.println("Left seats:"+totalSeats);
        }
        else
        {
            System.out.println("Seat booking is not possible...");
            System.out.println("Left seats:"+totalSeats);
        }
        System.out.println("*************************************************");
    }
}
