import java.util.*;

class BankAccount{
    private double balance;
    public void setBalance(double balance) // setters
    {
        if(balance>0)
        {
            this.balance=balance;
        }
        else
        {
            System.out.println("Input is not valid");
        }
    }
    public void withdraw(int amount)
    {
        if(amount>0 && amount<=balance)
        {
            balance=balance-amount;
        }
        else
        {
            System.out.println("Insufficient funds or invalid amount");
        }
    }
    public void deposit(int amount)
    {
        if(amount>0)
        {
            balance=balance+amount;
            System.err.println("Ammount credited successfully: "+amount);
        }
        else
        {
            System.out.println("Invalid amount");
        }
    }
    public double getBalance() //getter method
    {
        return balance;
    }
}



public class Encapsulation {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        BankAccount b=new BankAccount();
        b.setBalance(1000);
        System.out.println(b.getBalance());
        b.setBalance(-1000);
        System.out.println(b.getBalance()); 
        b.withdraw(500);
        System.out.println(b.getBalance());
        b.withdraw(1000);
        System.out.println(b.getBalance());
        b.deposit(2000);
        System.out.println(b.getBalance());

    }
}
