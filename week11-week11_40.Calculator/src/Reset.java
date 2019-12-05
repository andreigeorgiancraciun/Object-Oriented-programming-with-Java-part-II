
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
public class Reset implements ActionListener {

    private JTextField output;
    private JTextField input;
    private Calculator calculator;
    private JButton clear;

    public Reset(Calculator calculator, JTextField input, JTextField output, JButton clear) {
        this.input = input;
        this.output = output;
        this.calculator = calculator;
        this.clear = clear;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        calculator.setNumber(0);
        input.setText("");
        output.setText("0");
        clear.setEnabled(false);

    }

}
