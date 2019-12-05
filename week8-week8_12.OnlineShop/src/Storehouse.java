
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
public class Storehouse {

    private Map<String, Integer> map;
    private Map<String, Integer> stock;

    public Storehouse() {
        this.map = new HashMap<String, Integer>();
        this.stock = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        this.map.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        if (!this.map.containsKey(product)) {
            return -99;
        }
        return this.map.get(product);

    }

    public int stock(String product) {
        if (this.map.containsKey(product)) {
            return this.stock.get(product);
        } else {
            return 0;
        }

    }

    public boolean take(String product) {

        if (this.stock.containsKey(product)) {
            if (this.stock.get(product) >= 1) {
                int stock1 = this.stock.get(product) - 1;
                this.stock.put(product, stock1);
                return true;
            }
        }

        return false;

    }
    
    public Set<String> products(){
        Set<String> set = new HashSet<String>();
        
        for(String product : this.map.keySet()){    
            set.add(product);
        }
        
        return set;
    }
    
    

}
