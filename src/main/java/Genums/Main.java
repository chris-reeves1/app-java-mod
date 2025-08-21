package Genums;

public class Main {
public static void main(String[] args) {

    int result = Operation.PLUS.apply(1, 2);
    System.out.println(result);

    System.out.println(Level.HIGH.getSeverity());

    for (Day d : Day.values()) System.out.println(d);
    Day x = Day.valueOf("MONDAY");
    System.out.println(x.ordinal());  // 0
    System.out.println(x.name()); // "Monday"

    Day today = Day.FRIDAY;

    switch(today) {
        case MONDAY:
            System.out.println("...");
            break;
        case FRIDAY:
            System.out.println("....");
            break;
}
}
}

/*
 * ENUMS:
 *  - special data type:
 *      - allows us to define list of constants. 
 *      - reference obj - complied as a final static class. 
 *      - cant extend from an enum. 
 *      - implicitly public, static, and final. 
 * 
 * Gives us type safety!
 * - ensures only valid values are used. 
 * 
 * - readability/ maintainability. 
 * 
 * - Avoid magic numbers + strings
 * 
 * - methods + built-ins
 *  values - get all enum constants
 * valuesof - convert to a string
 * 
 *  Add our own mehtods + constructors. 
 * 
 * Over ridding/ per-constant behaviour. 
 * 
 * 
 * enummap - tomorrow morning. 
 * 
 */