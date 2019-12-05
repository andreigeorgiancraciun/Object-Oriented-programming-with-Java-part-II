/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author CraciunA2
 */
public class CompoundFigure extends Figure {

    private List<Figure> figures;

    public CompoundFigure(int x, int y) {
        super(x, y);
    }

    public CompoundFigure() {
        this.figures = new ArrayList<Figure>();
    }

    @Override
    public void draw(Graphics graphics) {
        for (Figure f : figures) {
            f.draw(graphics);
        }
    }

    public void add(Figure f) {

        this.figures.add(f);

    }
    
    @Override
    public void move(int dx, int dy){
        for (Figure f : figures) {
            f.move(dx, dy);
        }
    }

}
