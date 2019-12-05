
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
public class Box implements ToBeStored {

    private double maxWeight;
    private ArrayList<ToBeStored> boxes = new ArrayList<ToBeStored>();

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void add(ToBeStored thing) {

        if (thing.weight() + weight() <= maxWeight) {
            this.boxes.add(thing);
        }
    }

    @Override
    public String toString() {
        return "Box: " + this.boxes.size() + " things, total weight " + weight() + " kg";
    }

    @Override
    public double weight() {
        double sum = 0;
        for (ToBeStored tbs : this.boxes) {
            sum = sum + tbs.weight();
        }
        return sum;
    }

}
