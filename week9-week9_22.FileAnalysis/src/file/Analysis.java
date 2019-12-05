/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author CraciunA2
 */
public class Analysis {

    private File file;
    private Scanner reader;

    public Analysis(File file) throws FileNotFoundException {
        
        this.file = file;

    }

    public int lines() throws FileNotFoundException {
        this.reader = new Scanner(file);
        int nrOfLines = 0;
        while (reader.hasNextLine()) {
           
            reader.nextLine();
            nrOfLines++;
            
        }

        return nrOfLines;
    }

    public int characters() throws FileNotFoundException {
        this.reader = new Scanner(file);
        int nrOfChar = 0;
        while (reader.hasNextLine()) {

            String word = reader.nextLine();
            
            nrOfChar = nrOfChar + word.length() + 1;

        }

        return nrOfChar;
    }
}
