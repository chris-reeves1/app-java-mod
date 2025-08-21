package Icollections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        // List<String> myList = new ArrayList<>();
        // myList.add("person1");
        // myList.add("Person2");

        // List<Integer> newList = new ArrayList<>();
        // newList.add(0);
        // newList.add(1);
        // System.out.println("Element at index 1 is " + newList.get(1));
        // newList.add(3);
        // newList.add(5);
        // System.out.println("updated full list = " + newList);

        // ArrayList list = new ArrayList();

        // list.add("a string");
        // list.add(0); // allowed but not compile safe or type/safe. 


        // ArrayList<String> newlist = new ArrayList<>();
        // newlist.add("a string");
        // newlist.add(10);

        // ArrayLists:

        //     ArrayList<String> car = new ArrayList<>();
        //     car.add("zFord");
        //     car.add("ahonda");
        //     car.add(0, "BMW");
        // //  - Accessing items:
        
        //     car.get(0); 

        // // Change an item

        //     car.set(0, "peugot");

        // // Remove an item
        //     car.remove(0);
            
        // // clear a list

        //     //car.clear();

        // // find the size

        //     car.size();

        // // iterate 

        // for (int i = 0; i < car.size(); i++){
        //     System.out.println(car.get(i));
        // }

        // // sort
        // Collections.sort(car);
        // for (String i : car){
        //     System.out.println(i);
        // }

        // // array dequeue
        // // A resizable queue - double ended queue. 
        // // FIFO + LIFO. 
        
        // ArrayDeque<Integer> deque = new ArrayDeque<>();

        // // methods:

        // //Adding to head of queue:

        //     deque.addFirst(10);
        //     deque.offerFirst(20); // return true if successful 

        // // add to the tail:
        //     deque.addLast(30);
        //     deque.offerLast(40);

        // // remove from head:
        //     deque.removeFirst(); // throws an exception if nothing at head.
        //     deque.pollFirst(); // returns null if empty. 
            
        // // remove from tail:

        //     deque.removeLast();
        //     deque.pollLast();

        
        // // access elements
        //     System.out.println(deque.getFirst()); // throws an exception if empyt.
        //     System.out.println(deque.peekFirst()); // returns null if empty. 

        // other methods
            // - size,
            // - isempty(),
            // - toarray(),
            // - contains:
            // - clear()  


        // HASHMAP
        HashMap<String, Integer> map = new HashMap<>();

        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);

        System.out.println(map);

        // common methods:

        // add and change:

        map.put("d", 40);
        System.out.println(map);
        map.put("a", 50);
        System.out.println(map);
        map.putIfAbsent("e", 70); // only put if absent!
        map.putIfAbsent("e", 170);
        System.out.println(map);

        // Access

       System.out.println( map.get("a"));
       System.out.println( map.get("z")); // null if not there! 
       System.out.println( map.getOrDefault("z", 0)); // output 0

        // remove elements
        map.remove("a");
        map.remove("b", 20); // will be removed
        map.remove("c", 31); // not removed
        System.out.println(map);

        // contains:

        System.out.println(map.containsKey("b"));
        System.out.println(map.containsValue(600));
    
        // iteration - keySet, values, entryset

            for (String key : map.keySet()){
                System.out.println(key);
            }

            for (Integer value : map.values()){
                System.out.println(value);
            }

            // for (HashMap<> x; ?; map.entrySet()){
            //     System.out.println("key: " + x.getkey());
            // }

            // for (Map.Entry<String, Integer> entry : map.entrySet()) {
            // String key = entry.getKey();
            // Integer value = entry.getValue();
            // System.out.println("Key: " + key + ", Value: " + value);


            // }

            // Merge:
            map.replace("e", 170);
            System.out.println(map);
            map.replaceAll((key, value) -> value + 10);
            map.merge("c", 10, (oldValue, newValue) -> oldValue + newValue);
            System.out.println(map);


    }
}




/*
 * COLLECTIONNS
 * 
 * Drawbacks of Arrays:
 * - Fixed size. 
 * - No built-in methods.
 * 
 * collections:
 *  - A framework in Java - (java.utils)
 *  - Dynamic way to manage groups of data.
 *  
 * 
 *  Characterisics:
 *  - dynamic sizing - grow or shrink at runtime.
 *  - Generic - handle any type of data.
 *  
 *  Types:
 *      - lists: Ordered, allows duplicates, (eg; arraylists, linkedLists...)
 *      - maps: Unordered, key value pairs (eg; hashMap, treemap)
 *      - sets Unordered, unique elements (eg; hashset, treeset)
 * 
 *  advanatages:
 *  - resizing
 *  - Built-in methods
 *  - supports advanced concepts - filtering, sorting etc.
 * 
 *  generics: allows us to define type parameters for classes, methods, interfaces etc.
 *  - Type parameters: use <T> to repreesnt a type. Tis the type argument(s).
 *  
 *  - Before generics, collections could store any data type (raw)
 * 
 *  HASHMAP:
 *  -  key-value storage
 *  -  Unique keys
 *  -  Allows null (Once for keys, multiple for values.)
 *  -  Unordered.
 * 
 * 
 * 
 *
 * 
 * 
 * 
 * 
 * 
 */