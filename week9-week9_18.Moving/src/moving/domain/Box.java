/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;

/**
 *
 * @author CraciunA2
 */
public class Box implements Thing {

    private int maximumCapacity;
    private ArrayList<Thing> things;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.things = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing) {
        if (thing.getVolume() + getVolume() <= this.maximumCapacity) {
            this.things.add(thing);
            return true;
        }
        
        return false;
    }

    @Override
    public int getVolume() {
        int currentVolume = 0;
        for (Thing thing : things) {
            currentVolume = currentVolume + thing.getVolume();
        }

        return currentVolume;
    }

}
