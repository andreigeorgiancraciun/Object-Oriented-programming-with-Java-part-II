/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CraciunA2
 */
public class Calculator {

    private Reader reader = new Reader();
    private int counterStatictisc = 0;

    private int[] userInput() {

        int[] values = new int[2];
        System.out.print("value1: ");
        values[0] = reader.readInteger();
        System.out.print("value2: ");
        values[1] = reader.readInteger();
        
        counterStatictisc++;

        return values;

    }

    private void sum() {
        int[] values = userInput();

        System.out.println("sum of the values " + (values[0] + values[1]));
    }

    private void difference() {
        int[] values = userInput();

        System.out.println("difference of the values " + (values[0] - values[1]));
    }

    private void product() {
        int[] values = userInput();

        System.out.println("product of the values " + (values[0] * values[1]));
    }

    private void statistics() {
        System.out.println("Calculation done " + this.counterStatictisc);
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

}
