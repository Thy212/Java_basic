package chapter5;

/*
    OUR FIRST METHOD
    Write a method that asks a user for their name, then greets them by name.
 */

import java.util.Scanner;

public class Greetings {
    public static void greetUser(String name){
        System.out.println("Hi there, " + name);
    }

    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        greetUser(name);
    }
}
