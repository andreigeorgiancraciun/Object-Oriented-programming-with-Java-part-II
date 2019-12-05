/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author CraciunA2
 */
public class BulkTank {

    private final double capacity;
    private double volume;

    public BulkTank() {
        this(2000);
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
        this.volume = 0;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getVolume() {
        return this.volume;
    }

    public double howMuchFreeSpace() {
        return getCapacity() - getVolume();
    }

    public void addToTank(double amount) {
        if (this.volume + amount < this.capacity) {
            this.volume = this.volume + amount;
        }else {
            this.volume = this.capacity;
        }

    }

    public double getFromTank(double amount) {

        if (this.volume - amount < 0) {
            this.volume = 0;
        } else {
            this.volume = this.volume - amount;

        }
        return getVolume();
    }

    @Override
    public String toString() {
        return Math.ceil(getVolume()) + "/" + Math.ceil(getCapacity());
    }

}
