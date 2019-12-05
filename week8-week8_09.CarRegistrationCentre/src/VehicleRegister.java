
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CraciunA2
 */
public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();

    public boolean add(RegistrationPlate plate, String owner) {

        if (this.owners.containsKey(plate)) {
            return false;
        }

        this.owners.put(plate, owner);

        return true;
    }

    public String get(RegistrationPlate plate) {

        if (!this.owners.containsKey(plate)) {
            return null;
        }

        return this.owners.get(plate);

    }

    public boolean delete(RegistrationPlate plate) {

        if (!this.owners.containsKey(plate)) {
            return false;
        }

        this.owners.remove(plate);
        return true;

    }

    public void printRegistrationPlates() {

        for (RegistrationPlate reg : this.owners.keySet()) {
            System.out.println(reg);
        }

    }

    public void printOwners() {
        ArrayList<String> alreadyPrinted = new ArrayList<String>();

        for (String owner : owners.values()) {
            if (!alreadyPrinted.contains(owner)) {
                System.out.println(owner);
                alreadyPrinted.add(owner);
            }
        }

    }

}
