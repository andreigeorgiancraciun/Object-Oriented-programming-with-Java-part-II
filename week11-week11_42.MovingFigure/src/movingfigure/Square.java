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
public class Square extends Figure {

    private final int sideLenght;

    public Square(int x, int y, int sideLength) {
        super(x, y);
        this.sideLenght = sideLength;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(getX(), getY(), sideLenght, sideLenght);
    }
    
}
