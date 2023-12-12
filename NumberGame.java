package codjava;
import java.util.Scanner;
import java.util.Random;
public class NumberGame {
    public static void main(String[] args) {
        int ans;
        int guess;
        final int MAX = 100;
        Scanner s = new Scanner(System.in);
        Random rnd = new Random();
        boolean correct = false;
        ans = rnd.nextInt(MAX) + 1;
        while (!correct){
            System.out.println("Guess the no. between 1 to 100");
            guess = s.nextInt();
            if(guess > ans){
                System.out.println("Too high, Try again");
            }else if(guess < ans){
                System.out.println("Too low, Try again");
            }
            else if(guess == ans){
                System.out.println("YES you Guess the Same no.");
                correct = true;
            }else if(ans >= 3){
                System.out.println("You Attempt Max");
            }
        }
        System.exit(0);
    }
}
