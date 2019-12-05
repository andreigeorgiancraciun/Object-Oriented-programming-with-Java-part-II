
import java.util.HashMap;
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
public class ShoppingBasket {

    private Map<String, Purchase> shoppingBasket;

    public ShoppingBasket() {
        this.shoppingBasket = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        if (!this.shoppingBasket.containsKey(product)) {
            this.shoppingBasket.put(product, new Purchase(product, 1, price));
        } else {
            this.shoppingBasket.get(product).increaseAmount();
        }
    }

    public int price() {
        int price = 0;
        for (Purchase p : shoppingBasket.values()) {
            price = price + p.price();
        }
        return price;
    }

    public void print() {
        for (Purchase p : shoppingBasket.values()) {
            System.out.println(p);
        }
    }
}
