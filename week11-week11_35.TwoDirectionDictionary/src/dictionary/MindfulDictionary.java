/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CraciunA2
 */
public final class MindfulDictionary {

    private Map<String, String> dictionaryKey;
    private Map<String, String> dictionaryValue;
    private File files;

    public MindfulDictionary() {
        dictionaryKey = new HashMap<String, String>();
        dictionaryValue = new HashMap<String, String>();
    }

    public MindfulDictionary(String file) {
        dictionaryKey = new HashMap<String, String>();
        dictionaryValue = new HashMap<String, String>();
        files = new File(file);

    }

    public boolean load() {
        Scanner fileReader;
        try {
            fileReader = new Scanner(this.files);
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");   // the line is split at :
                add(parts[0], parts[1]);

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MindfulDictionary.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        return true;
    }

    public void add(String word, String translation) {
        if (!dictionaryKey.containsKey(word)) {
            dictionaryKey.put(word, translation);
            dictionaryValue.put(translation, word);
        }

    }

    public String translate(String word) {
        if (dictionaryKey.containsKey(word)) {
            return dictionaryKey.get(word);
        }

        return dictionaryValue.get(word);
    }

    public void remove(String word) {
        if (dictionaryKey.containsKey(word)) {
            dictionaryValue.remove(dictionaryKey.get(word));
            dictionaryKey.remove(word);
        } else if (dictionaryValue.containsKey(word)) {
            dictionaryKey.remove(dictionaryValue.get(word));
            dictionaryValue.remove(word);
        }
    }

    public boolean save() {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(files);
            for (String s : dictionaryKey.keySet()) {
                try {
                    fileWriter.write(s + ":" + dictionaryKey.get(s) + "\n");
                } catch (IOException ex) {
                    Logger.getLogger(MindfulDictionary.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(MindfulDictionary.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        try {
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(MindfulDictionary.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

}
