/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.Random;

/**
 *
 * @author CraciunA2
 */
public class Vampire {

    private int x;
    private int y;
    private int minX = 0;
    private int maxX;
    private int minY = 0;
    private int maxY;

    private String vampireName = "v";

    public Vampire(int maxX, int maxY) {
        this.x = new Random().nextInt(maxX);
        this.y = new Random().nextInt(maxY);
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public String getVampire() {
        return this.vampireName;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
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
        return getVampire() + " " + getX() + " " + getY();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.x;
        hash = 23 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vampire other = (Vampire) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }

    public void randomMove(char move) {
        if (move == 's') {
            moveDown();
        }

        if (move == 'a') {
            moveLeft();
        }

        if (move == 'w') {
            moveUp();
        }

        if (move == 'd') {
            moveRight();
        }
    }

}
