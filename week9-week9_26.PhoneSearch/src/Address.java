/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CraciunA2
 */
public class Address {

    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    @Override
    public String toString() {
        return this.street + " " + this.city;
    }
    
    public String getStreet(){
        return this.street;
    }
    
    public String getCity(){
        return this.city;
    }

}
