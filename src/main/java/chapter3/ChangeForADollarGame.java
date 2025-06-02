package chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {

    public static void main(String[] args) {
        int obj = 26;
        //Assume 1$ = 26 cents
        int cents;

        Scanner sc = new Scanner(System.in);

        // 1 cent
        System.out.println("How many pennies?");
        int pennies = sc.nextInt();

        // 5 cents
        System.out.println("How many nickels?");
        int nickels = sc.nextInt();

        // 10 cents
        System.out.println("How many dimes?");
        int dimes = sc.nextInt();

        // 25 cents
        System.out.println("How many quarters?");
        int quarters = sc.nextInt();

        sc.close();

        cents = pennies + (nickels * 5) + (dimes * 10) + (quarters * 25);

        if (cents == obj){
            System.out.println("You win!");
        }
        else if (cents > obj){
            System.out.println("It's more than 1$ and you were over " + (obj - cents) + " cents");
        }
        else {
            System.out.println("It's under than 1$ and you were short " + (cents - obj) + " cents");
        }
    }
}
