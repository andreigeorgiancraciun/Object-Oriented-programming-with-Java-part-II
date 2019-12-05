
import java.util.ArrayList;
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

    private Scanner reader;
    private ArrayList<Plane> plane;
    private ArrayList<Flight> flight;

    public TextUserInterface(Scanner reader) {

        this.plane = new ArrayList<Plane>();
        this.flight = new ArrayList<Flight>();
        this.reader = reader;

    }

    public void start() {

        airpotPanel();

        addMethod();

        flightService();

        printMethod();

    }

    public void airpotPanel() {
        System.out.println("Airport panel\n"
                + "--------------------\n");
    }

    public void chooseOperation() {
        System.out.println("Choose operation:\n"
                + "[1] Add airplane\n"
                + "[2] Add flight\n"
                + "[x] Exit");
    }

    public void addMethod() {

        while (true) {
            chooseOperation();
            String yourResponse = reader.nextLine();

            if (yourResponse.trim().equals("1")) {
                System.out.print("Give plane ID: ");
                String planeID = reader.nextLine();

                System.out.print("Give plane capacity: ");
                int capacity = Integer.parseInt(reader.nextLine());

                this.plane.add(new Plane(planeID, capacity));

            } else if (yourResponse.trim().equals("2")) {
                System.out.print("Give plane ID: ");
                String planeID = reader.nextLine();
                System.out.print("Give departure airport code: ");
                String from = reader.nextLine();
                System.out.print("Give destination airport code: ");
                String to = reader.nextLine();

                this.flight.add(new Flight(getPlane(planeID), from, to));

            } else if (yourResponse.trim().equals("x")) {
                System.out.println("");
                break;
            }

        }

    }

    public Plane getPlane(String id) {
        for (Plane p : this.plane) {
            if (p.getName().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public void flightService() {
        System.out.println("Flight service\n"
                + "------------\n");
    }

    public void chooseOperation2() {
        System.out.println("Choose operation:\n"
                + "[1] Print planes\n"
                + "[2] Print flights\n"
                + "[3] Print plane info\n"
                + "[x] Quit");
    }

    public void printMethod() {
        while (true) {
            chooseOperation2();
            String yourResponse = reader.nextLine();

            if (yourResponse.trim().equals("1")) {
                for (Plane p : this.plane) {
                    System.out.println(p);
                }
            } else if (yourResponse.trim().equals("2")) {
                for (Flight f : this.flight) {
                    System.out.println(f);
                }
            } else if (yourResponse.trim().equals("3")) {
                System.out.print("Give plane ID: ");
                String planeID = reader.nextLine();
                System.out.println(getPlane(planeID));
            } else if (yourResponse.trim().equals("x")) {
                System.out.println("");
                break;
            }

        }
    }

}
