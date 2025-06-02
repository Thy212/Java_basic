package chapter4;

import java.util.Scanner;

/*
    DO WHILE LOOP:
    Write a program that allows a user to enter two numbers,
     and then sums up the two numbers. The user should be able to
     repeat this action until they indicate they are done.
 */
public class AddNumbers {
    public static void main(String[] args) {
        boolean again;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter the first number");
            double number1 = sc.nextDouble();

            System.out.println("Enter the second number");
            double number2 = sc.nextDouble();

            double sum = number1 + number2;

            System.out.println("Sum = " + sum);

            System.out.println("Would you like to start over? True or False");
            again = sc.nextBoolean();
        }while (again);

        sc.close();
    }
}
