
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
public class PromissoryNote {
    
    private HashMap<String, Double> map;
    
    public PromissoryNote(){
        
        this.map = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value){
        
        this.map.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose){
        
        if (this.map.get(whose) == null){
            return 0;
        }else {
            return this.map.get(whose);
        }
    
    }
}
