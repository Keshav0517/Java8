package thread_tut.synchronization.mutual_Sync.static_sync;

public class StaticSync {
    public static void main(String[] args) {
        //Thread Interference problem is occured when we work with more than one object

        //obj1
        BookMovieSeats bookMovieSeats=new BookMovieSeats();

        MyThread1 t1=new MyThread1(bookMovieSeats,7);
        t1.start();

        MyThread2 t2=new MyThread2(bookMovieSeats,6);
        t2.start();

        //obj2
        BookMovieSeats bookMovieSeats1=new BookMovieSeats();
        MyThread1 t3=new MyThread1(bookMovieSeats1,5);
        t3.start();

        MyThread2 t4=new MyThread2(bookMovieSeats1,6);
        t4.start();


    }
}

class BookMovieSeats{
    static int totalSeats=20;
    public static synchronized void bookSeat(int seat){   //add [static synchronized] keywords
        if (totalSeats>=seat){
            System.out.println("Seat booking possible...");
            System.out.println("Seats Available:"+seat);
            totalSeats-=seat;
            System.out.println("Left seats:"+totalSeats);
        }
        else {
            System.out.println("Seat booking is not possible...");
            System.out.println("Left seats:"+totalSeats);
        }
    }
}

class MyThread1 extends Thread{
    BookMovieSeats b;
    int seats;

    MyThread1(BookMovieSeats b,int seats){
        this.b=b;
        this.seats=seats;
    }

    public void run(){
        b.bookSeat(seats);
    }
}

class MyThread2 extends Thread{
    BookMovieSeats b;
    int seats;

    MyThread2(BookMovieSeats b,int seats){
        this.b=b;
        this.seats=seats;
    }

    public void run(){
        b.bookSeat(seats);
    }
}
