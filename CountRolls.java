/*
 * simulate the rolls of two 6-sided dice
 * "draw" a histogram of the rolled values
 */

import java.util.Scanner;
import java.util.Random;

public class CountRolls {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter seed value for random number generator:"); //used by Mimir for testing
        int seed = scnr.nextInt();
        Random rand = new Random(seed);
        System.out.println("How many rolls?"); //get total number of rolls from input
        int numRolls = scnr.nextInt();

        //complete the program
        int arr[] = new int [13];

        for (int i = 1; i<=numRolls; i++) {
            int die1 = rand.nextInt(6) + 1;
            int die2 = rand.nextInt(6) + 1;
            int dice = die1 + die2;
            arr[dice]++;
        }

        for (int i = 2; i <= 12; i++) {
            System.out.printf("%2d: ", i);
            for(int j = 1; j<=arr[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    } //end main
} //end CountRolls