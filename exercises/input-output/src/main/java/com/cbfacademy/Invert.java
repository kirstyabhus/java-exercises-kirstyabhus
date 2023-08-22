package com.cbfacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Invert {
    public static void main(String[] args) {

        String filePath = "C:///Users/kabhu/cbfacademy/java-exercises-kirstyabhus/exercises/input-output/src/main/resources/exercise.txt";
        // FILE READING (upgraded)
        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("File reading exception: " + e.getMessage());
        }

    }
}
