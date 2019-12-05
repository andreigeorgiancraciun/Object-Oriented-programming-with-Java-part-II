
import java.util.ArrayList;
import java.util.Arrays;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CraciunA2
 */
public class Participant implements Comparable<Participant> {

    private String name;
    private int score;
    private int index;
    private int lenght;
    private int[] votes = new int[5];
    private ArrayList<Integer> lenghtHistory = new ArrayList<Integer>();

    public Participant(int index, String name) {
        this.name = name;
        this.score = 0;
        this.index = index;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    public int getIndex() {
        return this.index;
    }

    public int getLenght() {
        return lenght;
    }

    public void getVotes() {
        System.out.println(Arrays.toString(votes));
    }

    @Override
    public String toString() {
        return "  " + this.index + ". " + this.name + " (" + this.score + " points)";
    }

    public void Lenght() {
        this.lenght = 60 + (int) (Math.random() * ((120 - 60) + 1));
        lenghtHistory.add(lenght);

    }

    public void Votes() {
        for (int i = 0; i < votes.length; i++) {
            this.votes[i] = 10 + (int) (Math.random() * ((20 - 10) + 1));
        }
    }

    public void score() {
        Arrays.sort(votes);

        this.score = this.score + getLenght() + votes[1] + votes[2] + votes[3];
    }

    @Override
    public int compareTo(Participant other) {
        return this.score - other.getScore();
    }

    public void printArrayOfLengths() {
        if (lenghtHistory.size() >= 1) {
            System.out.print(this.lenghtHistory.get(0) + " m");
        }

        for (int i = 1; i < this.lenghtHistory.size(); i++) {
            System.out.print(", " + lenghtHistory.get(i) + " m");
        }

        System.out.println("");
    }

}
