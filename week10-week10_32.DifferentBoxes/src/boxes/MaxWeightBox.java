/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CraciunA2
 */
public class MaxWeightBox extends Box{

    private int maxWeight;
    
    private List<Thing> box;
    
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        
        this.box = new ArrayList<Thing>();
    }
    
    public int getCurrentWeight(){
        int currentWeight = 0;
        for(Thing t : box){
            currentWeight = currentWeight + t.getWeight();
        }
        
        return currentWeight;
    }

    @Override
    public void add(Thing thing) {
        if(thing.getWeight() + getCurrentWeight() <= this.maxWeight ){
            box.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return box.contains(thing);
    }
    
}
