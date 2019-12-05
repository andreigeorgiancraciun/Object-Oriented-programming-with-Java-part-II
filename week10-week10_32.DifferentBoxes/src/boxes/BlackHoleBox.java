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
public class BlackHoleBox extends Box{
    
    private List<Thing> blackBox;
    
    public BlackHoleBox(){
        this.blackBox = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        this.blackBox.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
    
    
}
