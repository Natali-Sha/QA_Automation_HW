package Helpers.Lessons.Lesson_9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteToFile_Lesson_9 {
    public void writeToFile(String text) {

        String pathToFile = "var/writeHere.txt";
        Path p1 = Paths.get(pathToFile);
        try (BufferedWriter writer = Files.newBufferedWriter(p1, StandardCharsets.UTF_8)) {
            writer.write(text);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
//        finally {
//            try {
//                BufferedReader in = new BufferedReader(new FileReader(pathToFile));
//                System.out.println("Now we printing first line from file:");
//                System.out.println(in.readLine());
//                System.out.println("Now we printing second line from file:");
//                System.out.println(in.readLine());
//
//            } catch (FileNotFoundException s) {
//                System.out.println("Error: File not found");
//            }catch (IOException ex) {
//                ex.printStackTrace();
//            }
        }
    }

