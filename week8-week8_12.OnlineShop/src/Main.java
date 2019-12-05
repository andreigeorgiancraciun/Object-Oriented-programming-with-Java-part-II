
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write some test code here
        Storehouse storehouse = new Storehouse();
        storehouse.addProduct("coffee", 5, 10);
        storehouse.addProduct("milk", 3, 20);
        storehouse.addProduct("cream", 2, 55);
        storehouse.addProduct("bread", 7, 8);
 
        Shop shop = new Shop(storehouse, new Scanner(System.in));
        shop.manage("Pekka");
            
        
    }
}
