/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author CraciunA2
 */
public class Barn {

    private MilkingRobot robot;
    private BulkTank tank;

    public Barn(BulkTank tank) {
        this.tank = tank;
    }

    public BulkTank getBulkTank() {
        return tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.robot = milkingRobot;
        this.robot.setBulkTank(tank);
    }

    public void takeCareOf(Cow cow) {
        if (robot == null) {
            throw new IllegalStateException("Robot not connected");
        }
        
        
        robot.milk(cow);
    }

    public void takeCareOf(Collection<Cow> cows) {
        if (robot == null) {
            throw new IllegalStateException("Robot not connected");
        }

        for (Cow cow : cows) {
            robot.milk(cow);
        }

    }

    @Override
    public String toString() {
        return Math.ceil(tank.getVolume()) + "/" + Math.ceil(tank.getCapacity());
    }

}
