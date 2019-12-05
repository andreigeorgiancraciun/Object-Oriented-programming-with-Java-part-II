/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CraciunA2
 */
public class Farm implements Alive {

    private String owner;
    private Barn barn;
    private List<Cow> cows;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }

    public String getOwner() {
        return this.owner;
    }

    public void addCow(Cow cow) {
        cows.add(cow);
    }

    public String showCows() {
        String outputNoAnimals = "No cows.";
        String output = "Animals:";

        for (Cow cow : cows) {
            output += "\n        " + cow.toString();
        }

        if (cows.isEmpty()) {
            return outputNoAnimals;
        }

        return output;
    }

    @Override
    public String toString() {
        return "Farm owner: " + getOwner() + "\n"
                + "Barn bulk tank: " + barn.toString() + "\n" + showCows();

    }

    @Override
    public void liveHour() {
        for (Cow cow : cows) {
            cow.liveHour();
        }
    }

    public void installMilkingRobot(MilkingRobot robot) {
        barn.installMilkingRobot(robot);
    }

    public void manageCows() {

        barn.takeCareOf(cows);

    }
}
