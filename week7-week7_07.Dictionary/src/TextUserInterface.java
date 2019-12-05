
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
public class TextUserInterface {

    private Scanner reader = new Scanner(System.in);
    private Dictionary dictionary = new Dictionary();

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;

    }

    public void start() {

        System.out.println("Statements:\n"
                + "  add - adds a word pair to the dictionary\n"
                + "  translate - asks a word and prints its translation\n"
                + "  quit - quits the text user interface");

        while (true) {

            System.out.print("Statement: ");
            String typing = reader.nextLine();

            if (typing.toLowerCase().trim().equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (typing.toLowerCase().trim().equals("add")) {
                System.out.print("In Finnish: ");
                String inFinnish = reader.nextLine();
                System.out.print("Translation: ");
                String Translation = reader.nextLine();
                this.dictionary.add(inFinnish, Translation);
            } else if (typing.toLowerCase().trim().equals("translate")) {
                System.out.print("Give a word: ");
                String wordInFinnish = reader.nextLine();
                System.out.println(this.dictionary.translate(wordInFinnish));
            } else {
                System.out.println("Unknown statement");
            }
        }

    }

}
