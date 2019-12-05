/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author CraciunA2
 */
public class Dungeon {

    private String[][] field;
    private Player player;

    private List<Vampire> vampList = new ArrayList<Vampire>();
    private List<Vampire> vampToRemove = new ArrayList<Vampire>();
    private Scanner reader = new Scanner(System.in);
    private int rounds;
    private boolean vampireMove;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.field = new String[height][length];
        this.player = new Player(length, height);
        this.rounds = moves;
        this.vampireMove = vampiresMove;
        createField();
        createVampires(vampires, length, height);
        populateFieldWithVampires();
    }

    public void run() {

        for (int i = rounds; i > 0; i--) {
            System.out.println(i + "\n");
            showField();
            yourTurn();
            if (vampList.isEmpty()) {
                System.out.println("YOU WIN");
                break;
            }
        }
        
        System.out.println("YOU LOSE");

    }

    public void createField() {

        for (String[] row : field) {
            for (int j = 0; j < row.length; j++) {
                row[j] = ".";
            }
        }
        field[player.getY()][player.getX()] = player.getPlayer(); // player first position
    }

    public void createVampires(int Vampires, int length, int height) {
        while (vampList.size() < Vampires) {
            Vampire vamp = new Vampire(length, height);

            if (!(vamp.getY() == 0 && vamp.getX() == 0)) {
                if (!vampList.contains(vamp)) {
                    vampList.add(vamp);
                }
            }

        }
    }

    public void populateFieldWithVampires() {

        for (Vampire vamp : vampList) {
            field[vamp.getY()][vamp.getX()] = vamp.getVampire();
        }
    }

    public void showField() {

        printLocation();

        for (String[] row : field) {
            for (String element : row) {
                System.out.print(element);
            }
            System.out.println("");
        }

        System.out.println("");
    }

    public void printLocation() {

        System.out.println(player);
        for (Vampire vamp : vampList) {
            System.out.println(vamp);
        }

        System.out.println("");

    }

    public void yourTurn() {

        String yourCommands = reader.nextLine();

        for (int i = 0; i < yourCommands.length(); i++) {
            char oneLetter = yourCommands.charAt(i);
            playerMove(oneLetter);

        }

    }

    public void playerMove(char oneLetter) {

        if (oneLetter == 's') {
            int oldX = player.getX();
            int oldY = player.getY();
            player.moveDown();
            updatePlayerPosition(oldX, oldY);
            vampireMove(vampireMove);
        }

        if (oneLetter == 'a') {
            int oldX = player.getX();
            int oldY = player.getY();
            player.moveLeft();
            updatePlayerPosition(oldX, oldY);
            vampireMove(vampireMove);
        }

        if (oneLetter == 'w') {
            int oldX = player.getX();
            int oldY = player.getY();
            player.moveUp();
            updatePlayerPosition(oldX, oldY);
            vampireMove(vampireMove);
        }

        if (oneLetter == 'd') {
            int oldX = player.getX();
            int oldY = player.getY();
            player.moveRight();
            updatePlayerPosition(oldX, oldY);
            vampireMove(vampireMove);
        }
    }

    public void vampireMove(boolean vampireMove) {
        
        if(vampireMove == true){
            char[] moves = {'w', 'a', 's', 'd'};

            for (int i = 0; i < vampList.size(); i++) {
                int number = new Random().nextInt(4);

                int oldX = vampList.get(i).getX();
                int oldY = vampList.get(i).getY();

                vampList.get(i).randomMove(moves[number]);

                int newX = vampList.get(i).getX();
                int newY = vampList.get(i).getY();

                if (field[newY][newX].contains("@")) {

                    vampToRemove.add(vampList.get(i));
                    field[oldY][oldX] = ".";

                } else if (field[newY][newX].contains("v")) {
                    vampList.get(i).setX(oldX);
                    vampList.get(i).setY(oldY);

                } else if (field[newY][newX].contains(".")) {
                    field[newY][newX] = vampList.get(i).getVampire();
                    field[oldY][oldX] = ".";
                    vampList.get(i).setX(newX);
                    vampList.get(i).setY(newY);
                }

            }
            vampList.removeAll(vampToRemove);
        
        }
        
    }

    public void updatePlayerPosition(int oldX, int oldY) {
        int newX = player.getX();
        int newY = player.getY();

        field[oldY][oldX] = ".";

        if (field[newY][newX].contains("v")) {
            for (int i = 0; i < vampList.size(); i++) {
                if (vampList.get(i).getX() == newX && vampList.get(i).getY() == newY) {
                    vampToRemove.add(vampList.get(i));
                }
            }
        }

        vampList.removeAll(vampToRemove);

        field[newY][newX] = player.getPlayer();

    }

}
