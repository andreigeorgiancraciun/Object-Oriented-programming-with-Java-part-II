/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.applicationlogic;

/**
 *
 * @author CraciunA2
 */
public class PersonalCalculator implements Calculator {
    
    private int number = 0;

    @Override
    public int giveValue() {
        return this.number;
    }

    @Override
    public void increase() {
        this.number++;
    }
    
    
    
}
