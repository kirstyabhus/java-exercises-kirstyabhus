package com.cbfacademy;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.io.IOException;;

public class App {

    public static void main(String[] args) {

        String filePath = "C:///Users/kabhu/cbfacademy/java-exercises-kirstyabhus/exercises/input-output/src/main/resources/exercise.txt";

        // file reading (upgraded)
        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("File reading exception: " + e.getMessage());
        }

        // create a new file
        // try-catch blcok is necessary because it throws a IOException if an error
        // occurs
        try {
            File myObj = new File("filename.txt");
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

        // file writing

        String filePath2 = "C:/Users/kabhu/cbfacademy/java-exercises-kirstyabhus/exercises/input-output/src/main/java/com/cbfacademy/hello.txt";
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath2);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter))

        {
            bufferedWriter.write("Kirsty is 21 years old\n");
            bufferedWriter.write("Hello\n");
            bufferedWriter.write("Hi\n");

            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}