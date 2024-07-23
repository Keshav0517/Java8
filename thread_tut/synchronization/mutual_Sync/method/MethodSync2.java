package thread_tut.synchronization.mutual_Sync.method;

import java.util.Scanner;

public class MethodSync2 extends Thread {

    static BankAccount bankAccount;
    static int balance=1000;
    Scanner sc=new Scanner(System.in);

    public void run(){
        System.out.print("Enter withdraw amount:");
        int amount=sc.nextInt();
        bankAccount.withdraw(amount);
        if (balance<amount){
            System.out.println("Your need to deposit balance...");
            System.out.print("Enter deposit amount:");
            amount=sc.nextInt();
            bankAccount.deposit(amount);
        }
        System.out.println("**************************************************");
    }

    public static void main(String[] args) {
        bankAccount=new BankAccount(balance);
        MethodSync2 t1=new MethodSync2();
        t1.start();

        MethodSync2 t2=new MethodSync2();
        t2.start();
    }

}

class BankAccount{
    private int balance;

    public BankAccount(int balance){
        this.balance=balance;
    }

    public synchronized void withdraw(int amount){
        if (balance>=amount){
            balance=balance-amount;
            System.out.println("Successfully withdraw...");
            System.out.println("Available balance:"+balance);
        }else {
            System.out.println("Amount is insufficient...");
            System.out.println("Available balance:"+balance);
        }
    }

    public synchronized void deposit(int amount){
        balance=balance+amount;
        System.out.println("Deposit success:"+balance);
    }
}
