package com.cbfacademy;

import java.io.*;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String filePath = "C:///Users/kabhu/cbfacademy/java-exercises-kirstyabhus/exercises/input-output/src/main/resources/exercise.txt";
        try (
                FileInputStream file = new FileInputStream(filePath);
                InputStreamReader streamReader = new InputStreamReader(file);
                LineNumberReader lineReader = new LineNumberReader(streamReader))

        {
            String outputLine = lineReader.readLine();
            while (outputLine != null) {
                System.out.printf("%d: %s%n", lineReader.getLineNumber(), outputLine);
                outputLine = lineReader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // output

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