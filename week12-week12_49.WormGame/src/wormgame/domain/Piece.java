/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

/**
 *
 * @author CraciunA2
 */
public class Piece {

    private int y;
    private int x;
    
    public Piece(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public boolean runsInto(Piece piece){
        return x == piece.getX() && y == piece.getY();
    }
    
    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }
    
}
