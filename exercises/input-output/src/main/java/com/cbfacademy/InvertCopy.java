package com.cbfacademy;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.util.*;

public class InvertCopy {
    // the ArrayList that will contain the lines of the text file
    ArrayList<String> linesArray = new ArrayList<>();

    // method to create an ArrayList with each line in an index. This ArrayList will
    // then be reversed.
    public ArrayList<String> createReverseArray(String inputFilePath) {
        try (
                LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(inputFilePath))) {
            String line = null;

            // Read all lines; Add each line to the ArrayList
            while ((line = lineNumberReader.readLine()) != null) {
                linesArray.add(line);
            }

            // reverse the linesArray ArrayList
            Collections.reverse(linesArray);

        } catch (IOException e) {
            System.out.println("File read exception: " + e.getMessage());
        }

        // return the ArrayList containing the lines in the text file, reversed
        return linesArray;

    }

    // method to create a new text file at a specified path
    public void createOutputFile(String outputFilePath) {
        try {
            File myObj = new File(outputFilePath);

            // createNewFile() method can be used to create a new file. This method returns
            // a boolean.
            if (myObj.createNewFile()) {
                // true is returned if file successfully created
                System.out.println("File created: " + myObj.getName());
            } else {
                // false is returned if file already exists
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            // handle exception
            System.out.println("File creation exception: " + e.getMessage());
        }
    }

    // method to write the lines in the ArrayList into a text file, line by line
    public void writeReverseFile(String outputFilePath) {
        try {
            // WRITE ARRAY LINES INTO A FILE
            // create an instance of the file writer
            FileWriter myWriter = new FileWriter(outputFilePath);

            // iterate over the lines in the array
            for (String string : linesArray) {
                // add each line into the new file, with a new line
                myWriter.write(string + "\n");
            }

            // close the instance of the fileWriter
            myWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        String inputFilePath = "C:///Users/kabhu/cbfacademy/java-exercises-kirstyabhus/exercises/input-output/src/main/resources/exercise.txt";

        String outputFilePath = "C://Users//kabhu//cbfacademy//java-exercises-kirstyabhus//exercises//input-output//src//main//java//com//cbfacademy//invertedExercise2.txt";

        // create an instance of the invertFile class
        InvertCopy invertFile = new InvertCopy();

        invertFile.createReverseArray(inputFilePath);
        invertFile.createOutputFile(outputFilePath);
        invertFile.writeReverseFile(outputFilePath);

        // FILE READING -> Read and output the lines of the reversed file
        try (Stream<String> stream = Files.lines(Paths.get(outputFilePath))) {
            stream.forEach(System.out::println);
        } catch (

        IOException e) {
            System.out.println("File reading exception: " + e.getMessage());
        }

    }
}
