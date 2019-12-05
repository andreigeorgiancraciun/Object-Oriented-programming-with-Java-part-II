
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CraciunA2
 */
public class Calculator {

    private int number = 0;

    public void plus(int secondNumber) {
        number = number + secondNumber;
    }

    public void minus(int secondNumber) {
        number = number - secondNumber;
    }

    public int getNumber() {
        return number;
    }

    void setNumber(int i) {
        number = 0;
    }

    

}
