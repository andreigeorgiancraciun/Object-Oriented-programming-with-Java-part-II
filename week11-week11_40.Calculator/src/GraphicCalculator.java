
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private Calculator calc = new Calculator();

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JTextField output = new JTextField("0");
        output.setEnabled(false);
        container.add(output);
        
        JTextField input = new JTextField("");
        container.add(input);
        
        JPanel panel = new JPanel(new GridLayout(1, 3));
                
        JButton addButton = new JButton("+");
        JButton minusButton = new JButton("-");
        JButton clear = new JButton("Z");
        panel.add(addButton);
        panel.add(minusButton);
        panel.add(clear);
        container.add(panel);
        
        clear.setEnabled(false);
        
        
        Plus plus = new Plus(calc, input, output, clear);
        addButton.addActionListener(plus);
        
        Minus minus = new Minus(calc, input, output, clear);
        minusButton.addActionListener(minus);
        
        Reset reset = new Reset(calc, input, output, clear);
        clear.addActionListener(reset);
        
            
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
