package JFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.gson.Gson;

public class Main {
public static void main(String[] args) throws IOException {
    System.out.println(new File("example.txt").getAbsolutePath());

    FileReader fileReader = new FileReader("example.txt");
    BufferedReader bufferedReader = new BufferedReader(fileReader);

    String line;

    while ((line = bufferedReader.readLine()) != null){
        System.out.println(line);
    }
    bufferedReader.close();

    // write:

    FileWriter fileWriter = new FileWriter("output.txt");
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

    bufferedWriter.write("hello this is line 1");
    bufferedWriter.newLine();
    bufferedWriter.write("more text on line 2");

    bufferedWriter.close();

        // NIO

        // Path filePath = Paths.get("example.txt");
        // for (String line1 : Files.readAllLines(filePath)){
        //     System.out.println(line1);
        // }

        // Files.write(Paths.get("example.txt"), "more text".getBytes());

        Path p = Path.of("example.txt");
        Files.writeString(p," a new line -again!!"); 

        // json/gson

        Person person = new Person("c", 20);

        // creating gson obj - should only be 1. 
        Gson gson = new Gson();

        // serialiseing jav -> json    
        String json = gson.toJson(person);
        System.out.println(json);
        
        //  write to a json file
        Path out = Path.of("data.json");
        Files.writeString(out, json);

        // Read from the file
        String loaded = Files.readString(out);

        // deserialise and remake obj
        Person p1 = gson.fromJson(loaded, Person.class);
        System.out.println(p1.getName() + p1.getAge());
}
}

class Person{
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}