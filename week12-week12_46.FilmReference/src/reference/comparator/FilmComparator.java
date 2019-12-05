/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author CraciunA2
 */
public class FilmComparator implements Comparator<Film> {

    private final Map<Film, List<Rating>> ratings;
    private final Map<Film, Double> averageRatings = new HashMap<Film, Double>();

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }

    public void average(Map<Film, List<Rating>> ratings) {

        for (Film film : ratings.keySet()) {
            double average = 0;
            for (Rating rating : ratings.get(film)) {
                average = average + rating.getValue();
            }
            average = average / this.ratings.get(film).size();
            averageRatings.put(film, average);
        }
    }

    @Override
    public int compare(Film o1, Film o2) {
        average(ratings);
        if (averageRatings.get(o1) == averageRatings.get(o2)) {
            return 0;
        } else if (averageRatings.get(o1) > averageRatings.get(o2)) {
            return -1;
        } else {
            return 1;
        }
    }

}
