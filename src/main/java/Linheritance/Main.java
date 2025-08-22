package Linheritance;

public class Main {
public static void main(String[] args) {
    
    Animal mydog = new Dog(); // implicit upcasting


    // downcasting:

    // Animal animal = new Dog(); // uppcasting
    // Dog mydog = (Dog) animal; // downcasting



    // Dog dog = new Dog("K", 10);
    // dog.out();

    // Car car = new Car();
    // car.speed = 100;
    // car.displaySpeed(); //calls the overridden method
    // car.showSuperSpeed();

    // Dog dog = new Dog();
    // dog.name = "h";
    // dog.eat(); // inherited method eat
    // dog.bark();
}
}

class Animal{
    public void speak(){
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal{
    public void callMe(){
        System.out.println("cant be called!");
    }
}




// class Animal{
//     protected String name;
//     public void eat(){
//         System.out.println(name + " is eating");
//     }
// }


// class Dog extends Animal{
//     public void bark(){
//         System.out.println(name + "is eating");
//     }
// }


// class Vehicle{
//     protected int speed;
//     public void displaySpeed(){
//         System.out.println("speed: " +  speed);
//     }
// }

// class Car extends Vehicle{
//     @Override // checks we are overidding something. Shows other devs intent.  
//     public void displaySpeed(){
//         System.out.println("cars speed: " + speed);
//     }

//     public void showSuperSpeed(){
//         super.displaySpeed(); // accessing super class method
//     }
// }

// class Animal{
//     protected String name;
//     public Animal(String name){
//         this.name = name;
//     }
// }


// class Dog extends Animal{
//     public Dog(String name){
//         super(name); // call to superclass. 
//     }

//     public void out(){
//         System.out.println("dogss name is " + name);
//     }
// }
    

// class Animal{
//     protected String name;
//     public Animal(String name){
//         this.name = name;
//     }
// }


// class Dog extends Animal{
//     int age;
//     public Dog(String name){
//         this(name, 3); // call to superclass pushed back in the chain. 
//     }

//     public Dog(String name, int age){
//         super(name);
//         this.age = age;
//     }

//     public void out(){
//         System.out.println("dogss name is " + name);
//     }
// }



/*  INHERITANCE:
 * - Techincal implementation:
 *  class SuperClass {
 *      // fields + methods
 * }
 * 
 * class SubClass extends SuperClass {
 *  // additional fields + methods. 
 * // inherits from the parent. 
 *  //
 * }
 * RULES:
 *  - only extend once
 *  - automaticall inherit all public and protected fields and methods.
 *  - Constructors not iinhetited but need to be called.
 * 
 * 
 * subclasses
 * - Use inmherited methods + fields as is.
 * - Over-ride them.
 * - Use a decorator @override - checker to make sure child class has a unique 
 *  implementaion of method to its parent.  
 *  - super keyword calls from parent.
 *  - super() - call to super constructor - has to happen. 
 *  - Add new fields and methods. 
 * 
 * - inherited fields:
 *      - all non private fields are inherited.
 *      - Aceess depends on modifyers:
 *          - public: anywhere
 *          - protected - packages + subclasses
 *          - default - not accessible to sub classes in other packages.
 *          - private: no default access.
 * 
 * - fieled shadowing:
 *      - if shadowing (using same field names in child classes - super musty be 
 *              called with super.field_name)
 * 
 * - Constructors:
 *  - Not inherited
 *  - Called using super()
 *  - first line of a constructor must be either super() or this(). 
 * 
 *  - Overloading ocnstructors:
 *       - defined by params.  
 * 
 * 
 * 
 * Key points:
 *  - Access modifiers (protected)
 *  - dont expose sensitive data unnessarily - use getters/setters
 *  - Avoid constructor problems.
 *  - avoid shadowing. 
 *  - private not inherited.
 *  - if it is need use public methoids to get private fields. 
 * 
 * 
 * 
 * 
 * Substitution:
 *  - subtypes must be substitutable to base types. - Without altering logic. 
 *  - Polymorphism.
 *  
 * WHY?
 * - Flexibility: 
 *      - ensures objects can work with any of the superclasses subtypes.
 * - Resuabilty:
 *      - write more shared code in the superclass - all subclasses should be able to run it.
 *      - Avoid code duplication + easy  maintainability.
 * - Polymorphism:
 *      - 1 reference type, can invoke mulitple behaviours. 
 *  - abstraction:
 *      - no concrete implementation.
 * 
 * 
 * 
 * 
 * 
 * 
 */