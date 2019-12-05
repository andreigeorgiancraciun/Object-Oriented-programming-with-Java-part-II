
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CraciunA2
 */
public class Printer {

    private File filename;

    public Printer(String fileName) throws Exception {
        this.filename = new File(fileName);

    }

    public void printLinesWhichContain(String word) throws FileNotFoundException {

        Scanner reader = new Scanner(this.filename,"UTF-8");

        if (word.equals("")) {
            while (reader.hasNext()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
        } else {
            while (reader.hasNext()) {
                String line = reader.nextLine();
                String[] words = line.split(" ");

                for (String w : words) {
                    if (w.contains(word)) {
                        System.out.println(line);
                    }
                }
            }

        }

    }

}
