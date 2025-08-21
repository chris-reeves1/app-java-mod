package Aintro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args){
        

        
        // int x = 10; // primitive type - directly stored in stack memory.
        // String name = "chris"; // Reference type - references an object.
                                // the ref is stored on the stack, obj in heap.
                                
        // primitives:

        // int a = 5;
        // int b = a; // - copy of the value. 

        // b = 10;

        // System.out.println(a);
        // System.out.println(b);

        // reference types -- allows multiple refs to the same object

        // int[] arr = {1, 2, 3}; 
        // int[] ref = arr;

        // ref[0] = 100;

        // System.out.println(arr[0]);
        // System.out.println(ref[0]);

        // int i = 5;
        // int result = ++i; //pre-increment
        // System.out.println(i);
        // System.out.println(result);

        // int i = 5;
        // int result = i++; //post-increment
        // System.out.println(i);
        // System.out.println(result);

        // for (int i = 0; i < 5; i++) {
        //     System.out.println(i);
        // }


        // int num = 100;

        // long l = num;
        // System.out.println(l);


        // explicit:

        // double d = 100.5; //truncates 0.5

        // int num = (int) d;

        // System.out.println(num);

        // parsing(String to primitive)

        // String intString = "123";
        // int number = Integer.parseInt(intString);
        // System.out.println(number);

        // String doubleString = "45.65";
        // double d = Double.parseDouble(doubleString);
        // System.out.println(d);

        // String booleanString = "true";
        // boolean b = Boolean.parseBoolean(booleanString);
        // System.out.println(b); 
    }
}


/*
 * 
 * public: access-control - available outside of the class.  
 * static: No instance required. - called by the class itself.
 * void: This is the return type of the method - doesnt return anything. 
 * main: just a name but JVM looks for this. 
 * args: an array of string objects to pass to the cli when executed.
 * 
 * naming conventions:
 * - Always start with a letter - never a number. 
 * - Dnt used reserved words
 * - case-sensitive.
 * - classes: PascalCase.
 * - methods +  vars: camelCase.
 * - packages lowercase. 
 * 
 *  variables:
 *  must be declared with a type. 
 *  Local variables are only valid within their block.
 *  Must be initialised with a value. 
 * 
 *  primitives:
 *  - type is copied when assigned or passed.
 *  reference:
 *  - allows multiple references to the same object.
 * 
 *  standard mathetical symbols. 
 * 
 *  Incrementing
 *  - ++ and -- : commonly used in loops, increments by the value of 1.  
 * 
 * - ++x or x++
 * pre: increment happens before valeu is used in an expression. 
 * post: this happens after an expression. 
 * 
 * 
 * 
 *  Casting:
 * 
 * implicit casting - that, that can be naturally casted. (widening).
 * small -> big. ie byte - short - int - long - float - double. 
 * 
 * explicit casting (narrowing): larger to smaller: 
 *  - data loss/truncated - loss of precision.
 * 
 */