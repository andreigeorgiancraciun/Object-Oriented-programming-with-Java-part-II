
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CraciunA2
 */
public class UserInterface {

    private Scanner reader = new Scanner(System.in);
    private List list = new List();

    public void start() {

        System.out.println("Kumpula ski jumping week\n");
        addParticipants();
        System.out.println("The tournament begins!");
        jump();
        thanks();
    }

    public void addParticipants() {
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        int participantIndex = 1;

        while (true) {
            System.out.print("  Participant name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                System.out.println("");
                break;
            } else {
                list.addParticipantsToList(new Participant(participantIndex, name));
                participantIndex++;
            }
        }
    }

    public void jump() {

        int increaseRound = 1;
        while (true) {
            System.out.println("");
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String response = reader.nextLine();
            if (!response.equals("jump")) {
                break;
            }
            round(increaseRound);
            increaseRound++;

        }
    }

    public void round(int index) {
        System.out.println("");
        System.out.println("Round " + index);
        System.out.println("");
        System.out.println("Jumping order:");
        list.printAfterFirstJumpList();
        System.out.println("");
        System.out.println("Results of round " + index);
        list.printRoundResult();

    }

    public void thanks() {
        System.out.println("");
        System.out.println("Thanks!\n"
                + "\n"
                + "Tournament results:\n"
                + "Position    Name");

        list.finalResult();
        System.out.println("");
    }

}
