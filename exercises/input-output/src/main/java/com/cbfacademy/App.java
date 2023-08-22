package com.cbfacademy;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.io.IOException;
import java.io.FileWriter;

public class App {

    public static void main(String[] args) {

        String filePath = "C:///Users/kabhu/cbfacademy/java-exercises-kirstyabhus/exercises/input-output/src/main/resources/exercise.txt";

        // FILE READING (upgraded)

        // try-catch blcok is necessary because it throws a IOException if an error
        // occurs
        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("File reading exception: " + e.getMessage());
        }

        // CREATE A NEW FILE
        // need to specify full path to create and write in the file
        String filePath2 = "C://Users//kabhu//cbfacademy//java-exercises-kirstyabhus//exercises//input-output//src//main//java//com//cbfacademy//filename.txt";

        // try-catch blcok is necessary because it throws a IOException if an error
        // occurs
        try {
            File myObj = new File(filePath2);
            // createNewFile() method can be used to create a new file. This method returns
            // a boolean.
            if (myObj.createNewFile()) {
                // true is returned if file successfully created
                System.out.println("File created: " + myObj.getName());
            } else {
                // false is returned if file already exists
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("File creation exception: " + e.getMessage());
        }

        // FILE WRITING (upgraded)

        // try-catch blcok is necessary because it throws a IOException if an error
        // occurs
        try {
            // a FileWriter instance is created, which takes the name of the file to write
            // in (if file doesn't exist, new file is created. if file does exist, it's
            // overwritten)
            FileWriter myWriter = new FileWriter(filePath2);
            // write method writes text into the file
            myWriter.write("Hello Kirsty");
            // after writing, FileWriter instance is closed
            myWriter.close();
            System.out.println("Writing to the file was successful.");
        } catch (IOException e) {
            System.out.println("File writing exception: " + e.getMessage());
        }

    }

}