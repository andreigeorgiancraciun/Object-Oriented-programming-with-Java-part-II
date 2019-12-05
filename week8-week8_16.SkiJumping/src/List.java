
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CraciunA2
 */
public class List {

    private ArrayList<Participant> list = new ArrayList<Participant>();

    public void addParticipantsToList(Participant p) {
        list.add(p);
    }

    public void printAfterFirstJumpList() {
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            Participant p = list.get(i);

            System.out.println("  " + (i + 1) + ". " + p.getName() + " ("
                    + p.getScore() + " points)");
        }
    }

    public void printRoundResult() {
        for (Participant p : list) {
            System.out.println("  " + p.getName());
            p.Lenght();
            p.Votes();
            System.out.println("    length: " + p.getLenght());
            System.out.print("    judge votes: ");
            p.getVotes();
            p.score();
        }
    }

    public void finalResult() {

        Collections.sort(list);
        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++) {
            Participant p = list.get(i);

            System.out.println((i + 1) + "           " + p.getName() + " ("
                    + p.getScore() + " points)");
            System.out.print("            jump lengths: ");
            p.printArrayOfLengths();
        }
    }

}
