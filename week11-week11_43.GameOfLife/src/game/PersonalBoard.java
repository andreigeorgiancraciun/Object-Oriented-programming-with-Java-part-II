/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

/**
 *
 * @author CraciunA2
 */
public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double d) {
        for (int i = 0; i < getBoard().length; i++) {
            for (int j = 0; j < getBoard()[i].length; j++) {
                double x = new Random().nextDouble();

                if (x < d) {
                    turnToLiving(i, j);
                } else {
                    turnToDead(i, j);
                }
            }
        }
    }

    @Override
    public boolean isAlive(int i, int i1) {
        if (i < getBoard().length && i >= 0) {
            if (i1 < getBoard()[i].length && i1 >= 0) {
                return getBoard()[i][i1];
            }
        }
        return false;
    }

    @Override
    public void turnToLiving(int i, int i1) {
        if (i < getBoard().length && i >= 0) {
            if (i1 < getBoard()[i].length && i1 >= 0) {
                getBoard()[i][i1] = true;
            }
        }
    }

    @Override
    public void turnToDead(int i, int i1) {
        if (i < getBoard().length && i >= 0) {
            if (i1 < getBoard()[i].length && i1 >= 0) {
                getBoard()[i][i1] = false;
            }
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int i, int i1) {
        int nrOfLiving = 0;
        
            if(isAlive(i, i1-1) == true) nrOfLiving++;
            if(isAlive(i-1, i1-1) == true) nrOfLiving++;
            if(isAlive(i-1, i1) == true) nrOfLiving++;
            if(isAlive(i-1, i1+1) == true) nrOfLiving++;
            if(isAlive(i, i1+1) == true) nrOfLiving++;
            if(isAlive(i+1, i1+1) == true) nrOfLiving++;
            if(isAlive(i+1, i1) == true) nrOfLiving++;
            if(isAlive(i+1, i1-1) == true) nrOfLiving++;
        
        return nrOfLiving;
    }

    @Override
    public void manageCell(int i, int i1, int i2) {
        if(isAlive(i, i1)){
            if(getNumberOfLivingNeighbours(i, i1) < 2 || getNumberOfLivingNeighbours(i, i1) > 3){
                turnToDead(i, i1);
            }
        }else {
            if(getNumberOfLivingNeighbours(i, i1) == 3){
                turnToLiving(i, i1);
            }
        }
    }

}
