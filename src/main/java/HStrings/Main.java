package HStrings;

public class Main {
    public static void main(String[] args) {
        
       StringBuilder sb = new StringBuilder("hello");
        
       sb.append(" world");
       sb.insert(5, ",");
       sb.replace(0, 5, "hi");
       sb.reverse();
       System.out.println(sb); // 

    }
}



/*
 * STRINGS
 * 
 * Most commonly use data type.
 * 
 * Immutable:
 *  - Once a string is created its value cannot be changed. 
 *  - Anything that seems to be changing a string makes a new object.
 *  
 *  - String pool - memory optimization
 *  - security
 *  - Thread safety
 * 
 *  - why not primitives?
 *      - complexity
 *      - flexibility, esp in classes.
 *  
 * 
 * METHODS:
    *  - Comparrison
        *  - "==" - compare references
        *  - .equals() - Compare content of obj
        *  - compareTo() - lexigraphically compare 2 strings. 
 * 
 *      - Transformation:
 *          - toUpperCase(), toLowerCase(), trim()
 * 
 *      - substrings:
 *          - subString()
 *          
 *      - search:
 *           indexof(), lastindexof(), contains()
 * 
 *      - splitting/ joining
 *          split(), join()
 * 
 *  Null and empty strings:
 *  - an empty string "". 
 *  - A null string - no object in memory.
 * 
 *  - String Builder:
 *  
 *  - Concatination - due to immutability we repeatedly create new string objects
 *  - this is inefficient. 
 * 
 * -  StringBuilder is a mutable class - allows for string manipulation.
 *      
 *  - Basic methods:
 *      - append(String str) - appends a string to the callign object.
 *      - insert(int ?, String str) - control of where to insert a string. 
 *      - delete(int start, int stop)
 *      - replace()
 *      - reverse()
 *  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */