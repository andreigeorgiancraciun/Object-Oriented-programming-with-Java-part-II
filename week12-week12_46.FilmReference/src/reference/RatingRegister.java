/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author CraciunA2
 */
public class RatingRegister {

    public Map<Film, List<Rating>> list;
    public Map<Person, HashMap<Film, Rating>> personList;

    public RatingRegister() {
        this.list = new HashMap<Film, List<Rating>>();
        this.personList = new HashMap<Person, HashMap<Film, Rating>>();
    }

    public void addRating(Film film, Rating rating) {
        if (!list.containsKey(film)) {
            list.put(film, new ArrayList<Rating>());
            list.get(film).add(rating);
        } else {
            list.get(film).add(rating);
        }

    }

    public List<Rating> getRatings(Film film) {
        
        return list.get(film);
    }

    public Map<Film, List<Rating>> filmRatings() {
        return list;
    }

    public void addRating(Person person, Film film, Rating rating) {
        if (!personList.containsKey(person)) {
            personList.put(person, new HashMap<Film, Rating>());
            personList.get(person).put(film, rating);

            addRating(film, rating);

        } else if(!personList.get(person).containsKey(film)) {
            personList.get(person).put(film, rating);
            addRating(film, rating);

        }
    }

    public Rating getRating(Person person, Film film) {
        if (!personList.containsKey(person)) {
            return Rating.NOT_WATCHED;
        } else if (!personList.get(person).containsKey(film)) {
            return Rating.NOT_WATCHED;
        } 
        
        return personList.get(person).get(film);
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {

        if (!personList.containsKey(person)) {
            return new HashMap();
        }
        
        return personList.get(person);
        
    }

    public List<Person> reviewers() {
        List<Person> persons = new ArrayList<Person>();

        for (Person person : personList.keySet()) {
            persons.add(person);
        }

        return persons;
    }

}
