package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        boolean done = false;
        String result;



        while (done != true){
            Scanner scan = new Scanner(System.in);
            Random r = new Random();
            int x = 1 + r.nextInt(10);
            int count = 3;

            System.out.println("Lets have some fun! Guess my ramdom number in 3 trys.");

            while (count  > 0){
                System.out.println("Enter a number between 1 and 10");
                int number = scan.nextInt();
                scan.nextLine();


            if (number == x){
                System.out.println("You got it. The correct number was " + number);
                count = 0;
                }else if (count == 0){
                System.out.println("Sorry, "+ count + " tries left. Better luck next time!");
                }else{
                count --;
                System.out.println("Sorry, try again!" + count + " tries left.");
                }
            }

            System.out.println("Do you want to play again? (y/n)");
            result = scan.nextLine();
            if (result.equalsIgnoreCase("n")) {
                done = true;
            }
        }
        System.out.println("Goodbye!");
    }
}
