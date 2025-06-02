package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("What season of year do you like?");
        String season = sc.nextLine();

        System.out.println("Please enter a whole number:");
        int number = sc.nextInt();

        System.out.println("Please enter an adjective");
        String adj = sc.next();

        sc.close();

        System.out.println("On a " + adj + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");
    }
}
