
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CraciunA2
 */
public class Dictionary {
    
    private HashMap<String, String> map;
    
    public Dictionary(){
        this.map = new HashMap<String, String>();
    }
    
    public String translate(String word){
        return this.map.get(word);
    }
    
    public void add(String word, String translation){
        this.map.put(word, translation);
    }
    
    public int amountOfWords(){
        return this.map.size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> list = new ArrayList<String>();
        
        for(String key : map.keySet() ){
            list.add(key + " = " + this.map.get(key));
        }
        
        return list;
    }
    
}
