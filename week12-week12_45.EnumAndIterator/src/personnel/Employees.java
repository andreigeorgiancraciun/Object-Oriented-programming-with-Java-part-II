/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author CraciunA2
 */
public class Employees {

    private final ArrayList<Person> personList;

    public Employees() {
        this.personList = new ArrayList<Person>();
    }

    public void add(Person person) {
        personList.add(person);
    }

    public void add(List<Person> persons) {
        for (Person person : persons) {
            personList.add(person);
        }
    }

    public void print() {
        Iterator<Person> iterator = personList.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person);
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = personList.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation().equals(education)) {
                System.out.println(person);
            }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = personList.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                iterator.remove();
            }
        }
    }

}
