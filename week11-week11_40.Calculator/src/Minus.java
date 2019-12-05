
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CraciunA2
 */
public class Minus implements ActionListener {

    private Calculator calculator;
    private JTextField output;
    private JTextField input;
    private JButton clear;

    public Minus(Calculator calculator, JTextField input, JTextField output, JButton clear) {
        this.input = input;
        this.output = output;
        this.calculator = calculator;
        this.clear = clear;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int inputINT;
        try{
            inputINT = Integer.parseInt(input.getText());
            calculator.minus(inputINT);
            output.setText(Integer.toString(calculator.getNumber()));
            input.setText("");
            
            if(Integer.parseInt(this.output.getText()) == 0){
                clear.setEnabled(false);
            } else {
                clear.setEnabled(true);
            }
        }catch(NumberFormatException number){
            input.setText("");
        }
        
    }

    

}

