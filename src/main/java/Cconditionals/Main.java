package Cconditionals;

public class Main {
    public static void main(String[] args) {
        
        // int num = 10;

        // if (num > 0){
        //     System.out.println("Number is greater than zero");
        // }

        // int num = 5;

        // if (num > 0){
        //     System.out.println("Number is greater than zero");
        // } else {
        //     System.out.println("Number is not greater than zero");
        // }


        // int num = 0;

        // if (num > 0){
        //     System.out.println("Number is greater than zero");
        // } else if (num < 0 ){
        //     System.out.println("Number is less than zero");
        // } else {
        //     System.out.println("num is zero");
        // }

        // int num = 10;
        // String result = (num > 0) ? "positive" : "negative";

        // System.out.println(result);

        // avoid this:

//         int a = 10;
//         int b = 12;
//         int c  = 22;
//         String result = !(a > b) ? (b > c ? "b is largest" : "c is larger than b") : "a is largest";
// System.out.println(result);

        // any data type:

        // int number = -5;
        // int absoluteNumber = (number < 0) ? -number : number;
        // System.out.println(absoluteNumber);

        // with equations:

        // int num = 9;
        // int resultSquarteOrDouble = (num % 2 == 0) ? num * num : num * 2;
        // System.out.println(resultSquarteOrDouble);

        //calling a method:
    //     int num =4;
    //     int result = (num % 2 == 0) ? doubleValue(num) : squaredValue(num); 
    //     System.out.println(result);
    // }
    //     public static int doubleValue(int x) {
    //         return x * 2;
    //     }
    //     public static int squaredValue(int x) {
    //         return x * x;
    //     }

    // int number = 10;
    // if (number > 0) {
    //     if (number % 2 == 0) {
    //         System.out.println("number is positive and even");
    //     } else {
    //         System.out.println("number is positive and odd");
    //     }
    // } else {
    //     System.out.println("not positive");
    // }


    // &&:

    // int age = 25;
    // boolean has_license = true;

    // if (age >= 18 && has_license){
    //     System.out.println("ok to drive");
    // }
    // else {
    //     System.out.println("not ok to drive");
    // }


    // boolean weekend = true;
    // boolean holiday = false;

    // if (weekend || holiday){
    //     System.out.println("ok to relax");
    // }
    // else {
    //     System.out.println("work day!");
    // }

        // syntax:

        // switch (expression){
        //     case value1:
        //         execute code;
        //         break;
        //     case value2:
        //         execute code;
        //         break;
        //     default:
        //         code if no matches
        // }

        int day = 1;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 6:
                System.out.println("nothign to do");
            case 7:
                System.out.println("nothign to do");
            default:
                System.out.println("other day");
        }

}
}


/*
 * 
 * If statement:
 *  - runs a block of code if a condition evaluates to being true. 
 *  - syntax:
 *      if (condition) {
 *          code block if true}
 *          
 * IF-ELSE
 * 
 * if (condition) {
 *      code block if conditional was true} else{
 *      code if conditoinal was false}
 * 
 * ELSE IF
 * 
 * multiple conditions evalauted
 * 
 * syntax:
 *     if (conditional){
 *  block if true}
 *  else if (condition - only evaluated in previous was false) {
 *  block if true} else {if both were false}
 * 
 * ternary operator:
 *  - use for simple, single line conditionals. 
 *  - ? is a standing for if and else. ":"
 *  -  Used to assign a single value. 
 *  - NOT used for:
 *      - more than one conditional statement. 
 *  syntax:
 *  - variable = (condition) ? valueifTrue : valueifFalse;
 * 
 * Logical operators
 *  - && || 
 *  - && Both conditions must be true.
 *  - || one of the conditions either side has to be true. 
 * 
 *  - switches:
 *     similar to if -else-if-else flow. allows many possible blocks of code to run.
 *     condition can only evaluate: byte, short, int, String, char. 
 *      Default block (optional + placement can be anywhere.)
 * 
 * syntax:

        // switch (expression){
        //     case value1:
        //         execute code;
        //         break;
        //     case value2:
        //         execute code;
        //         break;
        //     default:
        //         code if no matches
        // }
 *  
 * 
 * 
 * Originates in C - akkiws for multiple cases to share logic. avoidign repition.
 * Legacy code uses it! - backards compatibility. 
 * Performance critical/optimised. 
 * Sequential actions
 * 
 * If using fall through add comments to make clear its suppossed to be there.
 * eg:
 *  switch (day){
 *  case 1, 2 -> "shared fall through logic";
 *  case 3.. ... ... 
 * }
 * 
 * no extra conditionals liek (day > 5).
 * if values might change dont use switches (constants not dynamics)
 * 
 */