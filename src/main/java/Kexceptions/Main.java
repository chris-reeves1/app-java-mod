package Kexceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
 public static void main(String[] args) {

        try {
            level1();
        } catch (ArithmeticException e){}
    // try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))){
    //     String line;
    //     while ((line = reader.readLine()) != null){
    //         System.out.println(line);
    //     }
    // } catch (IOException e) {
    //     System.out.println(e.getMessage());
    // }






    // try{
    //     validateAge(15);
    // } catch (IllegalArgumentException e) {
    //     System.out.println(e.getMessage());
    // }
    

    
    // try {
    //     FileReader file = new FileReader("nonExistingFile.txt");
    // } catch (FileNotFoundException e) {
    //     System.out.println("[ERROR] - File not found: " + e.getMessage());
    // } finally {
    //     System.out.println("finally-block doing stuff...");
    // }

    // try {
    //     int result = 10 / 0;
    // } catch (ArithmeticException e) {
    //     System.out.println("[ERROR] - " + e.getMessage());
    // } finally {
    //     System.out.println("finally-block doing stuff...");
    // }


 }

public static void level1(){
    level2();
}

public static void level2(){
    level3();
}

public static void level3(){
    int result = 10/0;
}



//  public static void validateAge(int age) throws IllegalArgumentException{
//     if (age < 18) {
//         throw new IllegalArgumentException("Age must be over 18");
//     }
//  }
}




/*
 * Exception hanlding is a mechanic to deal with runtime errors.
 *  Allows flow to be maintained.
 *  Combination try, catch, finally - throw/throws.
 * 
 *  types:
 *  - checked:
 *      - checked at compile-time, must be handled up front try-catch or throws. 
 *      - ioexceptions
 *      - sqlexceptions
 * 
 *  - unchecked:
 *      - Exceptions occur at runtime.
 *      - arthimicexception
 *      - arrayoutofboundsexception
 * 
 * 
 *  errors:
 *         serious ussies that cant be handled:
 *          - outofmemoryerror, stackoverflowserrors. 
 * 
 * 
 * try - block of code that might throw an exception.
 * 
 * catch - block that handles the exception - it consumes it. log/print etc
 * 
 * finally - optional BLock that is always executed. further logging. closeing resoiurces.
 * 
 * throw - explicitly throw the exception. 
 * 
 * throws - declares what exceptions a method can throw. 
 * 
 * basic syntax:
 * 
 *  try {
 *      // code that may throw an exception
 * } catch (Exceptiontype e) {
 *      // handles error e + print outcome. 
 * } catch (Exceptiontype2 e) {
 *      // handle the error. 
 * } finally {
 *  db.close
 * file.cose()}
 *  
 * Best practice:
 *  - Be specific, dont catch genewric exceptions by default.
 *  - Use finally
 *  - Dont silently consume. 
 * 
 * try-with implements the closable interface - auto close resources. 
 * 
 * syntax:
 *      try (RourseType resource = new ResourceType()) {
 *          // code to try
 * } catch (exception) {}
 * 
 * bubbling up - propagation. 
 * low down call stack errors can be handled or left to bubble up- eventually to main.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */