package Dloops;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    
    // int i = 1;

    // while (i < 5) {
    //     System.out.println("count: " + i);
    //     i++;
    // }

    // int i = 1;

    // do {
    //     System.out.println("count: " + i);
    //     i++;
    // }
    //  while (i < 5);

    // useful for input validation:

        // Scanner sc = new Scanner(System.in);

        // int number;

        // do {
        //     System.out.println("enter positive number pls: ");
        //     number = sc.nextInt();
        // } while (number <= 0);

        // System.out.println("you entered " + number);

        // sc.close();

        // Scanner sc = new Scanner(System.in);

        // int choice;

        // do {
        //     System.out.println("1. Add");
        //  System.out.println("2. Subtract");
        //  System.out.println("3. Exit");
        //  System.out.println("Enter your choice: ");
        //  choice = sc.nextInt();

        //  switch (choice){
        //     case 1:
        //         System.out.println("simulating add functionality....");
        //         break;
        //     case 2:
        //         System.out.println("simulating subtract functionality....");
        //         break;
        //     case 3:
        //         System.out.println("exiting....");
        //         break;
        //     default:
        //         System.out.println("Must enter 1, 2 or 3 PLS!!!!!");
        //  }
        // } while (choice != 3);

        // for (int i = 1; i <= 5; i++ ) {
        //     System.out.println("count " + i);
        // }


        // for (type element: iterable) {
        //     code block
        // }

        // int[] numbers = {1, 2, 3, 4, 5};

        // for (int number : numbers) {
        //     System.out.println(number);
        // }
}
}
    


/*
 * While loops:
 *  - repeatedly executes a block of code, whilst a condition is true.
 *  - needs a condition to start and a condition to stop. 
 * 
 *  DO WHILE:
 *  - the code will execute at least once even 
 *    if the associated conditions are not true.
 * 
 *  FOR LOOP:
 *  - if we know how many iterations we want. 
 * 
 *          - initialze 
 *          - condition
 *          - increment 
 *  
 * for (initialse; conditrion; increment) {
 *      code block}
 * 
 * enhanced for loop (foreach)
 * 
 * Designed to iterate over a collection of data - arrays/lists/objects etc
 * Doesnt need an index - automatically iterates through. 
 * 
 * for (type element: iterable) {
            code block
        }
 * 
 * Break and continue logic can be used in any loop. 
 * 
 * infinite loops:
 * 
 * for(;;){}
 * while(true)
 * 
 * nested:
 *  for (int i = 1; i <= 3; i++){
 *      for (int j = 1; j < 9; j++){
 *      sys.....}
 * 
 * 
 * }
 * 
 */