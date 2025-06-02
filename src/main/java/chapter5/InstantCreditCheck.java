package chapter5;

/*
    VARIABLE SCOPE
    Write an 'instant credit check' program that approves
    anyone who makes more than $25,000 and has a credit score
    of 700 or better. Reject all others.
 */

import java.util.Scanner;

public class InstantCreditCheck {

    static int requiredSalary = 25000;
    static  int requiredCreditScore = 700;
    static Scanner sc = new Scanner(System.in);

    public static double getSalary(){
        System.out.println("Enter your salary:");
        double salary = sc.nextDouble();
        return salary;
    }

    public static int getCreditScore() {
        System.out.println("Enter your credit score:");
        int score = sc.nextInt();
        return score;
    }

    public static void notifyUser(boolean isUserQualified){
        if (isUserQualified)
            System.out.println("Congrats! You've been approved.");
        else
            System.out.println("Sorry. You've been declined");
    }

    public static boolean isUserQualified(int score, double salary){
        if ((score >= requiredCreditScore) && (salary >= requiredSalary)){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        double salary = getSalary();
        int score = getCreditScore();
        sc.close();

        boolean qualified = isUserQualified(score, salary);

        notifyUser(qualified);
    }
}
