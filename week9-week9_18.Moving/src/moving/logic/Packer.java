/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author CraciunA2
 */
public class Packer {

    private int boxerVolume;

    public Packer(int boxerVolume) {
        this.boxerVolume = boxerVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> listOfBoxes = new ArrayList<Box>();

        for (Thing t : things) {
            Box box = new Box(boxerVolume);
            box.addThing(t);
            listOfBoxes.add(box);
        }

        return listOfBoxes;
    }

}
