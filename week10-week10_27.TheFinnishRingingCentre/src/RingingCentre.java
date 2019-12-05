
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CraciunA2
 */
public class RingingCentre {

    private Map<Bird, List<String>> map = new HashMap<Bird, List<String>>();

    public void observe(Bird bird, String place) {

        if (!this.map.containsKey(bird)) {
            map.put(bird, new ArrayList<String>());
            this.map.get(bird).add(place);
        } else {
            this.map.get(bird).add(place);
        }

    }

    public void observations(Bird bird) {

        try {
            System.out.println(bird + " observations: " + this.map.get(bird).size());
            for (String location : this.map.get(bird)) {
                System.out.println(location);
            }
        } catch (NullPointerException n) {
            System.out.println(bird + " observations: 0" );
        }

    }
}
