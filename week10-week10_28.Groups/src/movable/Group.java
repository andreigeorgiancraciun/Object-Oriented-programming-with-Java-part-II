/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;

/**
 *
 * @author CraciunA2
 */
public class Group implements Movable {

    private ArrayList<Movable> list;

    public Group() {
        list = new ArrayList<Movable>();
    }

    public void addToGroup(Movable movable) {
        list.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for( Movable m : list){
            m.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String output = "";
        
        for (Movable m : list) {
            output += m.toString() + "\n";
        }
        
        return output;
    }

}
