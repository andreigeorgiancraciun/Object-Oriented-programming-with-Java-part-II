
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CraciunA2
 */
public class PhoneBook {

    private Map<String, Set<String>> phoneBook;
    private Map<String, String> nameByNumber;
    private Map<String, Address> address;
    private Map<Address, String> nameByAddress;

    public PhoneBook() {
        this.phoneBook = new HashMap<String, Set<String>>();
        this.nameByNumber = new HashMap<String, String>();
        this.address = new HashMap<String, Address>();
        this.nameByAddress = new HashMap<Address, String>();
    }

    public void addToPhoneBook(String name, String number) {

        if (!this.nameByNumber.containsKey(number)) {
            this.nameByNumber.put(number, name);
        }
        if (!this.phoneBook.containsKey(name)) {
            this.phoneBook.put(name, new HashSet<String>());
            this.phoneBook.get(name).add(number);
        } else {
            this.phoneBook.get(name).add(number);
        }

    }

    public void searchByName(String name) {
        if (this.phoneBook.containsKey(name)) {
            for (String number : this.phoneBook.get(name)) {
                System.out.println(" " + number);
            }
        } else {
            System.out.println("  not found");
        }

    }

    public void searchPersonByNumber(String number) {
        if (this.nameByNumber.containsKey(number)) {
            System.out.println(" " + this.nameByNumber.get(number));
        } else {
            System.out.println(" not found");
        }
    }

    public void addAddress(String name, Address address) {
        this.address.put(name, address);
        this.nameByAddress.put(address, name);

    }

    public void searchPersonalInformation(String name) {

        if (!this.address.containsKey(name) && !this.phoneBook.containsKey(name)) {
            System.out.println("  not found");
        } else {
            if (this.address.containsKey(name)) {
                System.out.println("  address: " + this.address.get(name));
            } else {
                System.out.println("  address unknown");
            }

            if (this.phoneBook.containsKey(name)) {
                for (String number : this.phoneBook.get(name)) {
                    System.out.println("   " + number);
                }
            } else {

                System.out.println("  phone number not found");
            }
        }

    }

    public void deleteInformation(String name) {

        this.address.remove(name);

        if (this.phoneBook.containsKey(name)) {
            for (String number : phoneBook.get(name)) {
                nameByNumber.remove(number);
            }
            this.phoneBook.remove(name);
        }

    }

    public void filteredListing(String keyword) {

        boolean keywordNotFound = true;
        Map<String, Set<String>> phoneBookSorted = new TreeMap<String, Set<String>>(phoneBook);

        if (keyword.isEmpty()) {
            keywordNotFound = false;
            for (String number : phoneBookSorted.keySet()) {
                System.out.println("\n " + number);
                searchPersonalInformation(number);
            }
        }

        // cauta dupa nume in phoneBook
        for (String number : phoneBookSorted.keySet()) {
            if (number.contains(keyword)) {
                keywordNotFound = false;
                System.out.println("\n " + number);
                searchPersonalInformation(number);
            }
        }

        //cauta in adresa, strada si orasul
        for (Address a : this.address.values()) {
            if (a.getStreet().contains(keyword) || a.getCity().contains(keyword)) {
                keywordNotFound = false;
                System.out.println("\n " + this.nameByAddress.get(a));
                searchPersonalInformation(this.nameByAddress.get(a));

            }
        }

        if (keywordNotFound) {
            System.out.println(" keyword not found");
        }

    }

}
