package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JTextField top = new JTextField();
        JButton center = new JButton("Copy!");
        JLabel bottom = new JLabel();
        
        container.add(top);
        container.add(center);
        container.add(bottom);
        
        AreaCopier area = new AreaCopier(top, bottom);
        center.addActionListener(area);
        
        
    }
}
