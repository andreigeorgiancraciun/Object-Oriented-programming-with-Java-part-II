/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CraciunA2
 */
public class Plane {
    
    private final String id; 
    private final int capacity;
    
    public Plane(String id, int capacity){
        this.id = id;
        this.capacity = capacity;
    }
    
    public String getName(){
        return this.id;
    }
    
    @Override
    public String toString() {
        return this.id + " (" + this.capacity + " ppl)";
    }
    
    
}
