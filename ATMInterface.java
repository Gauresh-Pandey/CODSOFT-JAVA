package codjava;
import java.util.Scanner;
public class ATMInterface {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int balance = s.nextInt();
        int WithdrawAmount = s.nextInt();
        int depositAmount = s.nextInt();
        displayBalance(balance);
        balance = WithdrawBalance(balance, WithdrawAmount);
        balance  = depositAmount(balance, depositAmount);

    }
    public static int displayBalance(int balance) {
        System.out.println("current balance: " + balance);
        System.out.println();
        return balance;
    }
    public static int WithdrawBalance(int balance, int withdrawBalance){
        if(balance >= withdrawBalance){
            balance = balance - withdrawBalance;
            System.out.println("Please Collect Money and take Your card: " +displayBalance(balance));
        }
        else {
            System.out.println("Sorry! Insufficient Balance");
            System.out.println();
        }
        return balance;
    }
    public static int depositAmount(int balance, int depositAmount){
        System.out.println("Deposit Statement");
        System.out.println("Deposit Amount: " + depositAmount);
        balance = balance + depositAmount;
        System.out.println("Your Balance has been Successfully Deposited: " +displayBalance(balance));
        return balance;
    }

}
