/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author CraciunA2
 */
public class Thermometer implements Sensor{
    
    private boolean thermometerStatus;
    
    public Thermometer(){
        this.thermometerStatus = false;
    }
    
    @Override
    public boolean isOn() {
        return this.thermometerStatus;
    }

    @Override
    public void on() {
        this.thermometerStatus = true;
    }

    @Override
    public void off() {
        this.thermometerStatus = false;
    }

    @Override
    public int measure() {
        if(this.thermometerStatus == false){
            throw new IllegalStateException();
        }
        
        return new Random().nextInt(60) - 30;
                
    }
    
}
