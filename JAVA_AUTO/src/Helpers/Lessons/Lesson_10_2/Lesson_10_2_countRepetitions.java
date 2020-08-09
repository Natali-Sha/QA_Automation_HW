package Helpers.Lessons.Lesson_10_2;

import java.io.LineNumberReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lesson_10_2_countRepetitions {
    String pathToFile;
    public void readFile(String file){

        pathToFile = file;
        String current;
        Map<String, Integer> allWords = new HashMap<>();
        try {

            LineNumberReader in = new LineNumberReader(new FileReader(pathToFile));

            while ((current = in.readLine()) != null){

                for (String s: current.split("\\W+")) {
                    allWords.merge(s,1,Integer::sum);
                }

             //   System.out.println(in.getLineNumber());
            }
        } catch (FileNotFoundException s) {
            System.out.println("Error: File not found");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        for (Map.Entry<String,Integer> entry : allWords.entrySet()){
            System.out.println("'" + entry.getKey() +
                    "'"+ ": " + entry.getValue() +" times");

        }System.out.println(allWords.size());

    }

}
