/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CraciunA2
 */
public class Flight {

    private final Plane plane;
    private final String from;
    private final String to;

    public Flight(Plane plane, String from, String to) {
        this.plane = plane;
        this.from = from;
        this.to = to;
    }
    

    @Override
    public String toString() {
        return this.plane + " (" + this.from + "-" + this.to + ")";
    }
}
