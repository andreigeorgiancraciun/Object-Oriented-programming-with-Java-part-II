
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CraciunA2
 */
public class Suitcase {

    private final int maxWeight;
    private ArrayList<Thing> things;
    private int curentWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
        this.curentWeight = 0;
    }

    public void addThing(Thing thing) {
        if (this.curentWeight + thing.getWeight() <= this.maxWeight) {
            things.add(thing);
            this.curentWeight = this.curentWeight + thing.getWeight();
        }
    }

    @Override
    public String toString() {
        if (things.isEmpty()) {
            return "empty (" + this.curentWeight + " kg)";
        } else if (things.size() == 1) {
            return things.size() + " thing (" + this.curentWeight + " kg)";
        } else {
            return things.size() + " things (" + this.curentWeight + " kg)";
        }
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing.toString());
        }
    }

    public int totalWeight() {
        return this.curentWeight;
    }

    public Thing heaviestThing() {
        int maxWeight = 0;
        Thing maxThing = null;
        
        for (Thing thing : things) {
            if (thing.getWeight() > maxWeight) {
                maxWeight = thing.getWeight();
                maxThing = thing;
            }
        }
        
        if (maxWeight == 0) {
            return null;
        } else {
            return maxThing;
        }

    }
}
