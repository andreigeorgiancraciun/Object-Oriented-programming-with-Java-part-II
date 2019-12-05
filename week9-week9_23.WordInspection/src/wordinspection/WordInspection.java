/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CraciunA2
 */
public class WordInspection {

    private File file;

    public WordInspection(File file) {
        this.file = file;

    }

    public int wordCount() throws FileNotFoundException {
        Scanner reader = new Scanner(file, "UTF-8");
        int nrOfWord = 0;

        while (reader.hasNextLine()) {
            nrOfWord = nrOfWord + reader.nextLine().split(" ").length;
        }

        return nrOfWord;
    }

    public List<String> wordsContainingZ() throws FileNotFoundException {
        List<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(file, "UTF-8");

        while (reader.hasNext()) {
            String word = reader.next();

            if (word.contains("z")) {
                words.add(word);
            }
        }

        return words;
    }

    public List<String> wordsEndingInL() throws FileNotFoundException {
        List<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(file, "UTF-8");

        while (reader.hasNext()) {
            String word = reader.next();

            if (word.endsWith("l")) {
                words.add(word);
            }
        }

        return words;
    }

    public List<String> palindromes() throws FileNotFoundException {
        List<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(file, "UTF-8");

        while (reader.hasNext()) {
            String word = reader.next();
            String newWord = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                newWord = newWord + word.charAt(i);
            }

            if (word.equals(newWord)) {
                words.add(word);
            }
        }

        return words;
    }

    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException {
        List<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(file, "UTF-8");

        while (reader.hasNext()) {
            String word = reader.next();
            if (word.contains("a") && word.contains("e") && word.contains("i") && word.contains("o") &&
                    word.contains("u") && word.contains("y") && word.contains("ä") && word.contains("ö")) {
                words.add(word);
            }

        }
        return words;
    }

}
