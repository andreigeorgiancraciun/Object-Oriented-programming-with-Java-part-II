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
public class OneThingBox extends Box {

    private List<Thing> oneThing;
    
    public OneThingBox(){
        this.oneThing = new ArrayList<Thing>();
    }
    
    
    @Override
    public void add(Thing thing) {
        if(this.oneThing.isEmpty()){
            this.oneThing.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.oneThing.contains(thing);
    }
    
    
    
}
