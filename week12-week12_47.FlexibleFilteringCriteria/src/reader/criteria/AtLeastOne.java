/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author CraciunA2
 */
public class AtLeastOne implements Criterion{
    
    private Criterion [] containsWordsArray;
    
    public AtLeastOne(Criterion... c1){
        
        containsWordsArray = new Criterion[c1.length];
        
        for(int i = 0; i < c1.length; i++){
            containsWordsArray[i] = c1[i];
        }
    }

    @Override
    public boolean complies(String line) {
        for (Criterion containsWordsArray1 : containsWordsArray) {
            if(containsWordsArray1.complies(line)){
                return true;
            }
        }
        
        return false;
    }
    
}
