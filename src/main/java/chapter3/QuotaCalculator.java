package chapter3;

/*
    IF ELSE
    All salespeople are expected to make at least 10 sales each week.
    For those who do, they receive a congratulatory message.
    For those who don't, they are informed of how many sales they are short.
 */

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        //Initialize values ew know
        int quota = 10;

        //Get unknown values
        System.out.println("Enter the number of sales you made this week:");
        Scanner sc = new Scanner(System.in);
        int sales = sc.nextInt();
        sc.close();

        //Make a decision on the path to take - Output
        if (sales >= quota){
            System.out.println("Congrats! You've met your quota");
        }
        else {
             int salesShort = quota - sales;
             System.out.println("You did not make your quota. You were " + salesShort + " sales shorts");
        }

    }
}
