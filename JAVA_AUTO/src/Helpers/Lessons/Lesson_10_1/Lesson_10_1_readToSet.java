package Helpers.Lessons.Lesson_10_1;

import java.io.LineNumberReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Lesson_10_1_readToSet {
     String pathToFile;
     public void readFile(String file){

         pathToFile = file;
         String current;
         Set<String> uniqueWordsAlice = new HashSet<>();
         try {

             LineNumberReader in = new LineNumberReader(new FileReader(pathToFile));
             while ((current = in.readLine()) != null){
                 Collections.addAll(uniqueWordsAlice, current.split("\\W+"));
//                 System.out.println(in.getLineNumber());
             }
         } catch (FileNotFoundException s) {
             System.out.println("Error: File not found");
         } catch (IOException ex) {
             ex.printStackTrace();
         }
         System.out.println("Unique words count - " + uniqueWordsAlice.size());
     }
}
