
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
    private PhoneBook phoneBook = new PhoneBook();
    

    public void start() {

        availableCommands();

        command();

    }

    public void command() {
        while (true) {
            System.out.print("command: ");
            String numberOfCommand = reader.next();
            if (numberOfCommand.equals("x")) {
                break;
            }
            commandOption(numberOfCommand);
            System.out.println("");
        }
    }

    public void availableCommands() {
        System.out.println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit\n");
    }

    public void commandOption(String numberOfCommand) {
        if (numberOfCommand.equals("1")) {
            System.out.print("whose number: ");
            String numberName = reader.next();
            System.out.print("number: ");
            String number = reader.next();

            phoneBook.addToPhoneBook(numberName, number);
        }
        if (numberOfCommand.equals("2")) {
            System.out.print("whose number: ");
            String numberName = reader.next();

            phoneBook.searchByName(numberName);

        }
        if (numberOfCommand.equals("3")) {
            System.out.print("number: ");
            String number = reader.next();

            phoneBook.searchPersonByNumber(number);
        }
        if (numberOfCommand.equals("4")) {
            System.out.print("whose address: ");
            String name = reader.next();
            System.out.print("street: ");
            String street = reader.next();
            System.out.print("city: ");
            String city = reader.next();

            phoneBook.addAddress(name, new Address(street, city));
        }
        if (numberOfCommand.equals("5")) {
            System.out.print("whose information: ");
            String name = reader.next();
            
            phoneBook.searchPersonalInformation(name);
        }
        if (numberOfCommand.equals("6")) {
            System.out.print("whose information: ");
            String name = reader.next();
            
            phoneBook.deleteInformation(name);
        }
        if (numberOfCommand.equals("7")) {
            System.out.print("keyword (if empty, all listed): ");
            String name = reader.next();
            phoneBook.filteredListing(name);
        }
         
         
        
    }

}
