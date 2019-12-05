/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author CraciunA2
 */
public class Circle extends Figure {
    
    public int diametre;

    public Circle(int x, int y, int diameter) {
        super(x, y);
        this.diametre = diameter;
    }

    
    @Override
    public void draw(Graphics graphics) {
        graphics.fillOval( getX() , getY() , diametre, diametre);
    }
    
    
    
}
