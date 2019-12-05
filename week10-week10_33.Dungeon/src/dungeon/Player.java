/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author CraciunA2
 */
public class Player {

    private int x;
    private int y;
    private int minX = 0;
    private int maxX;
    private int minY = 0;
    private int maxY;

    String playerName = "@";

    public Player(int maxX, int maxY) {
        this.x = 0;
        this.y = 0;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public String getPlayer() {
        return this.playerName;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void moveDown() {
        if (this.y + 1 < maxY) {
            this.y++;
        }
    }

    public void moveUp() {
        if (this.y - 1 >= minY) {
            this.y--;
        }
    }

    public void moveLeft() {
        if (this.x - 1 >= minX) {
            this.x--;
        }
    }

    public void moveRight() {
        if (this.x + 1 < maxX) {
            this.x++;
        }
    }

    @Override
    public String toString() {
        return getPlayer() + " " + getX() + " " + getY();
    }
    
    

}
