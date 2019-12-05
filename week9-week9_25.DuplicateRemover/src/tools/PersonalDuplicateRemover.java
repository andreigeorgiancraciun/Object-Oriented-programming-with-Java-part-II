/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author CraciunA2
 */
public class PersonalDuplicateRemover implements DuplicateRemover {

    private Set<String> set;
    private int nrOfDuplicates; 
    
    public PersonalDuplicateRemover(){
        this.set = new HashSet<String>();
        this.nrOfDuplicates = 0;
    }
    
    @Override
    public void add(String characterString) {
        this.set.add(characterString);
        nrOfDuplicates++;
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return nrOfDuplicates - this.set.size();
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return set;
    }

    @Override
    public void empty() {
        this.nrOfDuplicates = 0;
        this.set.clear();
    }   
    
}
