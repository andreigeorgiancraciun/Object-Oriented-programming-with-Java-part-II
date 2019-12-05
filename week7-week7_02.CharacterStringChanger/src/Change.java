/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CraciunA2
 */
public class Change {

    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString) {
        String newWord = "";

        for (int i = 0; i < characterString.length(); i++) {
            if (characterString.charAt(i) == fromCharacter) {
                newWord = newWord + toCharacter;
            } else {
                newWord = newWord + characterString.charAt(i);
            }
        }

        return newWord;
    }
    
}
