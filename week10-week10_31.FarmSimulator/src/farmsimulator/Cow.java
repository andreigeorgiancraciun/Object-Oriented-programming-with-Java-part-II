/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author CraciunA2
 */
public class Cow implements Milkable, Alive {

    private String name;
    private int udderCapacity;
    private double milk;
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow() {
        this(NAMES[new Random().nextInt(NAMES.length)]);

    }

    public Cow(String name) {
        this.name = name;
        this.udderCapacity = 15 + new Random().nextInt(26);
        this.milk = 0;
    }

    public String getName() {
        return this.name;
    }

    public double getCapacity() {
        return this.udderCapacity;
    }

    public double getAmount() {
        return this.milk;
    }

    @Override
    public String toString() {
        return getName() + " " + Math.ceil(getAmount()) + "/" + Math.ceil(getCapacity());
    }

    @Override
    public double milk() {
        double prevMilk = this.milk;
        this.milk = 0;
        return prevMilk;
    }

    @Override
    public void liveHour() {
        double newMilk = 0.7 + (2.0 - 0.7) * new Random().nextDouble();
        if (newMilk + this.milk < getCapacity()) {
            this.milk = this.milk + newMilk;
        } else {
            this.milk = getCapacity();
        }
    }

}
