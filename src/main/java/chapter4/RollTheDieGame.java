package chapter4;

import java.util.Random;
import java.util.Scanner;

public class RollTheDieGame {
    public static void main(String[] args) {
        int space = 20;
        int currentSpace = 0;
        int roll = 5;
        int i;

        Random random = new Random();

        for (i = 1; i <= roll; i++){
            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            if((currentSpace == space) && (i <= roll)){
                System.out.println("Roll #" + i + ": You've rolled a " + die + ". You're on space 20. Congrats, you win!");
                break;
            }
            else if ((currentSpace < space) && (i == roll)){
                System.out.println("Roll #" + i + ": You've rolled a " + die + ". You're on space "+ currentSpace + ". Unfortunately, you lose!");
                break;
            } else if (currentSpace > space) {
                System.out.println("Roll #" + i + ": You've rolled a " + die + ". You're on space "+ currentSpace + ". Unfortunately, you lose!");
                break;
            }
            else {
                System.out.println("Roll #" + i + ": You've rolled a " + die + ". You're on space "+ currentSpace + " and have " + (space - currentSpace) + " more to go.") ;
            }
        }
    }
}


