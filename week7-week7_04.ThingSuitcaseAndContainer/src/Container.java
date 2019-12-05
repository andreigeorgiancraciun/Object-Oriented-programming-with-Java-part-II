
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
public class Container {

    private final int maxWeight;
    private ArrayList<Suitcase> suitcases;
    private int curentWeight;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
        this.curentWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.curentWeight + suitcase.totalWeight() <= this.maxWeight) {
            suitcases.add(suitcase);
            this.curentWeight = this.curentWeight + suitcase.totalWeight();
        }
    }

    @Override
    public String toString() {
        if (suitcases.isEmpty()) {
            return "empty (" + this.curentWeight + " kg)";
        } else if (suitcases.size() == 1) {
            return suitcases.size() + " suitcases (" + this.curentWeight + " kg)";
        } else {
            return suitcases.size() + " suitcases (" + this.curentWeight + " kg)";
        }
    }

    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();
        }
    }
}
