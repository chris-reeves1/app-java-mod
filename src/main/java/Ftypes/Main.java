package Ftypes;

public class Main {
public static void main(String[] args) {
       





    // System.out.println(Counter.count); // output 0

    // new Counter();
    // new Counter();

    // System.out.println(Counter.count); // output 2

    // Counter counter = new Counter();

    // System.out.println(counter.count); // output 3
    
    
    
    
    
    
    
    // Engine engine = new Engine();
        // Car car = new Car(engine);
        // car.startCar();

//  Person person = new Person(12, "c");



//     Person person1 = new Person();
//     // access and modify attributes
// //         person1.age = 20;
//         person1.name = "chris";

//         Person person2 = person1;
//         person2.age = 25;

//     person1.introduce();

//     //Person person3 = null;
//     //person3.introduce();

//     Person person4 = new Person();
//     person4.setAge(-15);
//     person4.setName("c");
//     person4.introduce();

//     Person person5 = new Person();
//     Person person6 = person5;
//     person5.age = 10;
//     System.out.println(person5 == person6);
//     System.out.println(person5 == person1);

//     // same as ==
//     System.out.println(person5.equals(person6)); // comparing references 

//     // String implementation of equals

//     String st1 = new String("hello1");
//     String st2 = new String("hello");

//     System.out.println(st1.equals(st2)); // true for content. 



// }
// }

// class Person{
//     // fields (makes the state of an object)
//     int age;
//     String name; 

//     // methods
//     public void introduce(){
//         System.out.println("hi my name is " + name + " age is " + age);
//     }

//     // getter for age 
//         public int getAge(){
//             return age;
//         }

//     // setter for age
//         public void setAge(int age){
//             if (age > 0 ) {
//                 this.age = age;
//             }
//         }

//         public String getName() {
//             return name;
//         }

//         public void setName(String name) {
//             this.name = name;
//         }

}
}

// unatural hierarchy 

// class Engine{
//     public void start(){
//         System.out.println("engine started...");
//     }
// }

// class Car extends Engine {
//     // inherits all of engine functionality.  
// }

// class Engine {
//     public void start(){
//          System.out.println("engine started...");
//      }
// }

// class Car {
//     private Engine engine;

//     //constructors
//     public Car(Engine engine){
//         this.engine = engine;
//     }

//     public void startCar(){
//         engine.start(); // delegating behaviour
//         System.out.println("Car is running!");
//     }
//}

// class Person {
//     int age;
//     String name;

//     public Person(){
//             this.age = 1;
//             this.name = "Unknown";
//     }
//     // parametrized constructors
//     public Person(int age, String name){
//             this.age = age;
//             this.name = name;
// }
//     // single-param constructors
//     public Person(int age){
//             this.age = age;
// }
// }


// class Counter{
//        static public int count = 0; //static field 
//        public Counter(){
//            count++; 
//   }
//   }

class Person{
    private String name;
    private int age;
    
    // private contructor
    private Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // factory method
    public static Person createChild(String name){
        return new Person(name, 10);
    }


}






/*
 * Types:
 *  - primitives
 *  - references
 *      - differences: 1) type of data they can hold, and actions they can perform.
 *  
 *  immutable vs mutable
 *  - Custom objects can be modified (in a sense)
 *  - Strings cant be changed - always results in a new string. 
 * 
 *  - Best practices for creating objects:
 *      - Encapsulation - private attributes public getters/setters. 
 *      - Avoid magic numbers + defaults for attributes. 
 *      - Use meaningful names 
 * 
 * COMPARRISONS
 *  - == and equals
 *  - 
 * primitives ==:
 *  - checks the values stored are the same.
 * 
 * objects:
 *  - checks in both variables point to the same object in memory. 
 * 
 * Equals:
 * - Used to compare the state/content of an object.
 * - By default looks for reference equality - same as ==.
 * - However - is overridden by different class implementations:
 *  - String, Integer, List override .equals to to compare content. 
 * 
 * REASSIGNMENT
 *  - multiple refs to an object  - if one is reassigned to a new obj it has nbo affect 
 *      on the other original references. 
 * 
 *          Person person1 = new Person();
 *          Person person2 = person1; Both point to same obj.
 * 
 * 
 *          person2 = new Person(); - reassign and does not affect person1 or the 
 *                                      original obj. 
 * 
 *  Encapsulation:
 *      -  Restricting access to fields and methods. 
 *      -  Protects the internal state of objs/classes
 *      -  how data is accessed
 *      -  modularity and maintainability. 
 *  features:
 *  - private fields
 *  - getters/setters
 * 
 * 
 *  ABSTRACTION
 *  - Process of hiding the implementation details of an object.
 *  - Reduces complexity. 
 * 
 *  IMPLEMENTATION: 
 *  - Abstract base classes
 *  - Interfaces: defines behaviour.
 * 
 *  Key ides for defininf refernece types:
 *  - Clear purpose and single responsibility. 
 *  - proper encapulation
 *  - logical equality.
 *  - Memory usage, mutability.
 *  - inheritance, composition and interfaces.
 *  - Documentation + testability. 
 * 
 * 
 *  COMPOSITON:
 *  - Encapsulates behaviour. 
 *  - flexibility
 *  - prevents tight coupling. 
 *  - promotes code reuse.
 * 
 *  State.
 * 
 *  CONSTUCTORS:
 *  - A block of code called upon object creation.
 *  - initialse with specific values or defaults.
 * 
 *  - Same name as the class.
 *  - No return type - not even void. 
 * 
 *  - needed for:
 *      - obj initialisation
 *      - Encapsulation of set-up logic
 *      - mandatory initialisations
 * 
 *  - Default constructor:
 *      - Takes no params
 *      - initialses to defaults
 *      - only used if no other constructor is defined. 
 * 
 *  - Constructor overloading:
 *          -  Define multiple constructors, with diff param signatures. 
 *          -  Allows initialiseation in a variety of ways.
 *          -  order, number of, type - all overload consructor. 
 *
 *  - constructor chaining - cover later
 * 
 * - factory method:
 *      - returns an instancew of the class. 
 * 
 *      what it does?
 *          - decouple creation logic from main class logic. 
 *          - allows for flexible creation. 
 *          - General readability/maintainability
 * 
 *      positives:
 *          - encapsulation
 *          - flexible obj creation
 *          - readibility
 *          - avoid overloading
 *          - testing easier
 * 
 *      negatives:
 *          - added complexity
 *          - Overhead
 * 
 * 
 *  Static fields
 *   - A variable declared with static keyword.
 *   - shared amongst all class instances.
 *   example:
 * 
 *  public class Counter{
 *      static public int count = 0; //static field 
 *      public Counter(){
 *          count++; 
 * }
 * }
 * 
 * USE_CASE:
 *  - shared state - represents shared data. 
 *  - constants - attributes that need to be consistant accross objs.
 * 
 * ACCESS:
 *  - directly through the class name. 
 *  - Through an instance - its discouraged. 
 * 
 *  THIS - will do later
 * 
 * Access control:
 * 
 *  - Classes
 *  2 choice at top level:
 *      - public: accessible anywhere
 *      - default: package-private. Only acessible inside of the same package (folder)
 * 
 * fields and methods:
 *      - all 4 access levels
 *      
 *      - public: 
 *          Accessible from anywhere
 *          Use sparingly, think in terms of public api exposure.
 * 
 *      - protected:
 *          Available in same package and sub-classes (anywhere).
 *          Think in terms of inherited. 
 * 
 *      - default:
 *          Same package only
 *          utils for packages only.
 * 
 *      - private:
 *          Accessible only within the same class. 
 *          FUll encapsulation. 
 * 
 * 
 *      
 * fields:
 *  - private for all unless very specific reason not to.
 *  - getters and setters to access/change
 * 
 * methods:
 *  - internal logic? - private
 *  - should it be overridden? - Public
 *  - sparingly for public
 * 
 * classes:
 *  - prefer default
 *  - Use public for only top-level clases/entry points. Externally accessed/used classes.
 * 
 * 
 * Common problems:
 *  - Excessive public.
 *  - NO access control.
 *  - lacking encapsulation.
 *  - improper use of protected. 
 * 
 * 
 */