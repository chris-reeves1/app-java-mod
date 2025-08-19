package Earrays;

import java.util.Arrays;

public class Main {
public static void main(String[] args) {
    
    // access and modify
    
    // int[] numbers = {10, 20, 30};
    // System.out.println(numbers[0]);

    // numbers[0] = 100;
    // System.out.println(numbers[0]);

    // // getting length of an array

    // System.out.println(numbers.length);

    // loops

    // basic for loop:
    // for (int i = 0; i <  numbers.length; i++){
    //     System.out.println(numbers[i]);
    // }

    // for (int num : numbers){
    //     System.out.println(num);
    // }

    // array of objects
    // String[] words = {"heelo", "world"};
    // System.out.println(words[0]);

    // multidimensional:
        // int[][] matrix = {              
        //    {1, 2, 3},
        //    {4, 5, 6},
        //    {7, 8, 9}     
        // };

        // System.out.println(matrix[1][2]); // -- output 6

    //    jagged matrix - didffent amount of data per nested array. 
    //    EXERCISE: iterate over and print out the whole matrix. 

    // for (int i = 0; i < matrix.length; i++){
    //     for(int j = 0; j < matrix[i].length; j++){
    //             System.out.println(matrix[i][j] + " ");
    //     }
    // }

    // for (int[] x : matrix){
    //     for(int y : x) {
    //         System.out.println(y);

    //     }
    // }

    // Copying arrays 

    // - manual copy

    // int[] source = {1, 2, 3};
    // int[] destination = new int[source.length];

    // for (int i = 0; i < source.length; i++){
    //     destination[i] = source[i];
    // }

    // // auto copy uses copyOf command

    // int[] copy = Arrays.copyOf(source, source.length);

    int[] numbers = {4, 2, 7, 1};
    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));

}
}




/*
 * - An array is a collection of values of the same type
 * - Stored in contiguous memory location.
 * - allows us to store multiple values in a single variable. 
 * 
 * - int num1, num2, num3; declaring multiple single vars.
 * 
 * - int[] numbers; -- prefered way of declaring
 * - int numbers[]; -- also valid. 
 * 
 * - characterists:
 *  - fixed size (immutable)
 *  - All the elements are same type
 *  - Can store any data - obj/primitives/other arrays.
 *  - NO BUILT_IN METHODS!!!
 * 
 * - int[] numbers = new int[3]; make array with size 3. 
 * 
 *  array literal: 
 * - int[] numbers = {10, 20, 30}
 * 
 *  defaults:
 *  - int = 0
 *  - boolean: false
 *  - char = /u0000 "0"
 *  - object: null
 *  
 * 
 * - Memory:
 *  - Stored heap memory.
 *  - primitives are stored directly in the mem blocks in the heap.
 *  - for an array of objects arrays only store the pointers to the objs. 
 * 
 *  - When:
 *  - fixed length, performance is critical.
 *  - predictability
 *  - primitives best
 *  - legacy! 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */