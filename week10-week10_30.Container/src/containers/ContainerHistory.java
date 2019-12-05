/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author CraciunA2
 */
public class ContainerHistory {

    private ArrayList<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double situation) {
        history.add(situation);
    }

    public void reset() {
        history.clear();
    }

    @Override
    public String toString() {

        return history.toString();
    }

    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        }
        return Collections.max(history);
    }

    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        }
        return Collections.min(history);
    }

    public double average() {
        if (history.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (double d : history) {
            sum = sum + d;
        }

        return sum / history.size();
    }

    public double greatestFluctuation() {
        if (history.size() <= 1) {
            return 0;
        }

        double maxFluctuation = 0;

        for (int i = 1; i < history.size(); i++) {
            double diff = Math.abs(history.get(i) - history.get(i - 1));

            if (diff > maxFluctuation) {
                maxFluctuation = diff;
            }
        }

        return maxFluctuation;
    }

    public double variance() {
        if (history.size() <= 1) {
            return 0;
        }

        double average = average();
        double variance = 0;

        for (Double d : history) {
            variance += Math.pow((d - average), 2);
        }
        variance /= (history.size() - 1);

        return variance;
    }

}
