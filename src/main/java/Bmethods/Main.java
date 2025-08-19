package Bmethods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        // Scanner sc = new Scanner(System.in);

        // // common methods:
        // // nextInt(), next(), nextDouble(), nextLine(). 

        // System.out.println("Enter an age: ");
        // int age = Integer.parseInt(sc.nextLine().trim());

        // // System.out.println("Enter a double: ");
        // // double d = sc.nextDouble();

        // // sc.nextLine();

        // System.out.println("Enter name: ");
        // String name = sc.nextLine();

        // System.out.println(name + " - " + age);
        
        // sc.close();

        // printf used with system.out. .formatt - format string in var then 
        // print with println. 
        
        // System.out.printf("Integer: %d%nString: %s%nFloat: %.2f%n", 42, "ello", 3.11555);

        // String name = "chris";
        // int age = 20;
        // double d = 10.555;
        // String l = String.format("Name: %s, Age: %d, d: %.2f", name, age, d);
        // System.out.println(l);
    }
}





/*
 * A method is a block of code that does one job - returns something or does a task. 
 * 
 * accessmodifier static/not returntype methodname(parameters, type name,)
 * 
 * public, private, protected, default.
 * 
 * public - anyone can access.
 * private - only this class can call it. 
 * protected - same package + subclasses
 * default - same package only.  
 * 
 * returntype: void(returns nothing), data types - Strings, int, bool etc.
 * 
 * params - none - one - many. 
 * 
 * public void name()
 * private int addCalc(int a, int b)
 * static double areaCalc(double a) 
 * 
 * Method overloading:
 * 
 * Overloading achieved by changing either:
 * - order of params
 * - number of params
 * - type of params 
 * 
 * 
 * 
 * 
 * public static void main(String[] args) {
        updateSalary();

        Main testObj = new Main();
        int x = testObj.factorial(5);
        System.out.println(x);

        Greeter g = new Greeter();
        g.greet();
        g.greet("not a default name");

        Other o = new Other();
        o.test("dfbv");
    }


public static void updateSalary() {
    System.out.println("updated");
}

public int factorial(int n){   // recusrssion
    if (n <=1) return 1;  // base-case 
    return n * factorial(n - 1);
}

}

class Greeter{
    public void greet(String name) {
        System.out.println("hello " + name);
    }
public void greet(){
    greet("this is my default name");
}
}
 */