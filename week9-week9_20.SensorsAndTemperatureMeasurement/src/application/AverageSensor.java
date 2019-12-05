/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CraciunA2
 */
public class AverageSensor implements Sensor {

    private List<Sensor> listOfSensor;
    private List<Integer> readings;

    public AverageSensor() {
        this.listOfSensor = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    @Override
    public boolean isOn() {
        for (Sensor s : this.listOfSensor) {
            if (!s.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor s : this.listOfSensor) {
            s.on();
        }
    }

    @Override
    public void off() {
        for (Sensor s : this.listOfSensor) {
            s.off();
        }
    }

    @Override
    public int measure() {
        if (isOn() == false || this.listOfSensor.isEmpty()) {
            throw new IllegalStateException();
        }

        return average();
    }

    public int average() {
        int sum = 0;
        for (Sensor s : this.listOfSensor) {
            sum = sum + s.measure();
        }

        readings.add(sum / this.listOfSensor.size());
        return sum / this.listOfSensor.size();
    }

    public void addSensor(Sensor additional) {
        this.listOfSensor.add(additional);
    }

    public List<Integer> readings() {

        return readings;
    }

}
